package reader;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DistinctBySet {

	private static String filePath = "C:\\Users\\Mosen\\Desktop\\lsh_shortUrl_demo.txt";

	
	public static void main(String[] args) {
		LineIterator lt = null;
		Set<String> set = new HashSet<String>();
		try {
			lt = FileUtils.lineIterator(new File(filePath), "UTF-8");
			while (lt.hasNext()) {
				String line = lt.nextLine().trim();
//				System.out.println(line);
				if (!set.contains(line)) {		//set.contains()底层调用的map.containsKey()
					set.add(line);
				} else {
					System.out.println(line);
				}
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
