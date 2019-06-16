import java.io.File;
import java.io.FilenameFilter;

public class FileBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUtils.recursiveList("/Users/royston.dmello/Desktop");
		
		FileUtils.listFilterDelete("/Users/royston.dmello/Desktop", ".txt");
		
		
	}

}

class FileUtils{
	public static void recursiveList(String initial) {
		File initialFile = new File(initial);
		
		for (File filename : initialFile.listFiles()) {
			System.out.println(filename);
			if(filename.isDirectory()) {
				FileUtils.recursiveList(filename.getAbsolutePath());
			}
		}
	}
	
	public static void listFilterDelete(String initial, String extension) {
		File initialFile = new File(initial);
		
//		FilenameFilter filter = ;
		
		File[] files = initialFile.listFiles((dir, name) -> {
			return name.toLowerCase().endsWith(extension);
		});
		
		for (File filename : files) {
			System.out.println(filename);
			filename.delete();
			System.out.println("Deleted");
		}
	}
	
	public static void copyContent(String file, String newFile) {
		
	}
}
