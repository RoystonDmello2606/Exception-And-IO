import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BasicException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub'
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		try {
			FileHandler handler = new FileHandler("C:\\Users\\royston.dmello\\Desktop\\logs.txt");
			logger.addHandler(handler);
		} catch (SecurityException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			int i = 10/0;
		}
		catch(ArithmeticException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		try {
			int[] a = {0,1};
			int c = a[2];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
		
		try {
			new FileReader("a.txt");
		}
		catch(FileNotFoundException e) {
			logger.log(Level.SEVERE, e.getMessage());
		}
	}
}
