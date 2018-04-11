package apache.commons.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;

public class LineCount {
	
	private static String filePath = "D:\\IdeaProjects\\register_push\\src";
	private static String filePath2 = "D:\\IdeaProjects\\CodeRepository\\ApacheCommons\\src";

	public static void main(String[] args) {
		int lines = 0;
		File file = new File(filePath);
		lines = readFileLines(file,lines);
		System.out.println(lines);
	}

	public static int readFileLines(File file, int i) {
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				i = readFileLines(f,i);
			}
		} else {
			i = i+getLines(file);
		}
		return i;
	}
	
	public static int getLines(File file) {
		int num = 0;
		LineIterator lt = null;
		try {
			lt = FileUtils.lineIterator(file, "UTF-8");
			while (lt.hasNext()) {
				lt.nextLine();
				num++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lt!=null) {
				LineIterator.closeQuietly(lt);
			}
		}
		return num;
	}
	



}
