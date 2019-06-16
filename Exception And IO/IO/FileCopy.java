import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String source = "/Users/royston.dmello/eclipse-workspace/Day 1/src/Main.java";
		String destination = "/Users/royston.dmello/Desktop/Main.java";
//		
//		try {
//			FileCopyUtils.copyContent(source, destination);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			FileCopyUtils.copyFile(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class FileCopyUtils{
	public static void copyContent(String source, String destination) throws FileNotFoundException, 
	IOException{
		File in = new File(source);
		File out = new File(destination);
		FileReader inReader = null;
		FileWriter outWriter = null;
		
		inReader = new FileReader(in);
		outWriter = new FileWriter(out);
		
		int c = inReader.read();
		
		while(c != -1) {
			outWriter.write(c);
			c = inReader.read();
		}
		
		outWriter.close();
		inReader.close();
	}
	
	public static void copyFile(String source, String destination) throws IOException {
		File in = new File(source);
		File out = new File(destination);
		
		Files.copy(in.toPath(), out.toPath());
	}
}
