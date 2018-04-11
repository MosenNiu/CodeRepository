package apache.commons.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DistinctByMap {

	private static String filePath = "C:\\Users\\Mosen\\Desktop\\11111.txt";

	
	public static void main(String[] args) {
		LineIterator lt = null;
		Map<String, String> map = new HashMap<String, String>();
		int count = 0;
		int repleat = 0;
		try {
			lt = FileUtils.lineIterator(new File(filePath), "UTF-8");
			while (lt.hasNext()) {
				String line = lt.nextLine().trim();
				count++;
				if (!map.containsKey(line)) {
					map.put(line, line);
				} else {
					repleat++;
					System.out.println(line);
				}
			}
			System.out.println("共处理"+count+"行。重复"+repleat+"行。");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lt!=null) {
				LineIterator.closeQuietly(lt);
			}
		}
	}

}
