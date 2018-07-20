package reader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Distinct {
	
	private static String filePath = "C:\\Users\\Mosen\\Desktop\\lsh_shortUrl_demo.txt";
	private static String filePath2 = "C:\\Users\\Mosen\\Desktop\\repetition.txt";

	public static void main(String[] args) {
		List<String> list = getList(filePath);
		compare(list);
		System.out.println("over");
	}
	
	
	public static List<String> getList(String filePath) {
		List<String> list = new ArrayList<String>();
		LineIterator lt = null;
		try {
			lt = FileUtils.lineIterator(new File(filePath), "UTF-8");
			while (lt.hasNext()) {
				String line = lt.nextLine().trim();
				list.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lt!=null) {
				LineIterator.closeQuietly(lt);
			}
		}
		System.out.println("getListOver");
		return list;
	}
	
	
	public static void compare(List<String> list){
		
		String str1;
		String str2;
		int count = 0;
		long start = System.currentTimeMillis();
		for (int i = 0; i < list.size(); i++) {
			boolean flag = false;
			str1 = list.get(i);
			
			for (int j = i+1; j < list.size(); j++) {
				str2 = list.get(j);
				if (str1.equals(str2)) {
					flag = true;
					break;
				}
			}
			if (flag) {
				method2(str1);
				System.out.println(str1+"重复");
			}
			count++;
			if(count%10000==0){
				System.out.println(count+"条已完成，耗时"+(System.currentTimeMillis()-start)+"毫秒");
			}
		}
	}
	
	public static void method2(String content) {
		FileWriter writer = null;
		try {
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
			writer = new FileWriter(filePath2, true);
			writer.write(content+"\n");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
