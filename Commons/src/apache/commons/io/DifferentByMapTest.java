package apache.commons.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DifferentByMapTest {

	private static String filePath = "C:\\Users\\Mosen\\Desktop\\fp_dsfpt_swjg.txt";
	private static String filePath2 = "C:\\Users\\Mosen\\Desktop\\sfrz_cj.txt";

	
	public static void main(String[] args) {
		LineIterator lt = null;
		Map<String, String> map1 = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map12 = new HashMap<String, String>();
		Map<String, String> map21 = new HashMap<String, String>();
		String line;
		String[] one;
		String mapKey;
		System.out.println("开始");
		try {
			lt = FileUtils.lineIterator(new File(filePath), "UTF-8");
			while (lt.hasNext()) {
				line = lt.nextLine().trim();
				one = line.split(",");
				mapKey = one[2]+one[3]+one[0];
				if (!map1.containsKey(mapKey)) {
					map1.put(mapKey,line);
				} else {
					System.out.println("重复数据:"+line);
				}
			}
			System.out.println("map1已准备就绪,共"+map1.size()+"条");

			lt = FileUtils.lineIterator(new File(filePath2), "UTF-8");
			while (lt.hasNext()) {
				line = lt.nextLine().trim();
				one = line.split(",");
				mapKey = one[0]+one[3]+one[2];
				if (!map2.containsKey(mapKey)) {
					map2.put(mapKey,line);
				} else {
					System.out.println("重复数据:"+line);
				}
				//1中没有的数据
				if (!map1.containsKey(mapKey)) {
					map12.put(mapKey,line);
				}
			}
			System.out.println("map2已准备就绪,共"+map2.size()+"条");
			//2中没有的数据
			for (Map.Entry<String, String> entry : map1.entrySet()) {
				if (!map2.containsKey(entry.getKey())) {
					map21.put(entry.getKey(),entry.getValue());
				}
			}
			FileUtils.writeLines(new File("C:\\Users\\Mosen\\Desktop\\diff1.txt"),map12.values(),"\r");
			FileUtils.writeLines(new File("C:\\Users\\Mosen\\Desktop\\diff2.txt"),map21.values(),"\n");
			System.out.println("比对完毕");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lt!=null) {
				LineIterator.closeQuietly(lt);
			}
		}
	}

}
