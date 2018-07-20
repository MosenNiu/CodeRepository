package reader;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

public class DistinctByMap {

	private static String filePath = "C:\\Users\\Mosen\\Desktop\\lsh_shortUrl_demo.txt";

	
	public static void main(String[] args) {
		LineIterator lt = null;
		Map<String, String> map = new HashMap<String, String>();
		try {
			lt = FileUtils.lineIterator(new File(filePath), "UTF-8");
			while (lt.hasNext()) {
				String line = lt.nextLine().trim();
				if (!map.containsKey(line)) {
					map.put(line, line);
				} else {
					System.out.println(line);
				}
//				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lt!=null) {
				LineIterator.closeQuietly(lt);
			}
		}
	}

}
