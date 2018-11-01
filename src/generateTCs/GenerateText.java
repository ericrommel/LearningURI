package generateTCs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class GenerateText {

	public static void main(String[] args) {
		long count=1073741824;
		File arq = new File("test_cases.txt");
		try (PrintWriter pw = new PrintWriter(arq)) {
			//Random generate = new Random();
			while (count!=0) {
				if (arq.length() > count/1024) {
					break;
				}
				pw.printf("Test - ");
				count--;
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}