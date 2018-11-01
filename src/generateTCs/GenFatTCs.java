package generateTCs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenFatTCs {

	public static void main(String[] args) {
		int count, N, M;
		File arq = new File("test_cases.txt");
		try (PrintWriter pw = new PrintWriter(arq)) {
			Random generate = new Random();
			count = 200;
			while (count!=0) {
				N = generate.nextInt(21);
				M = generate.nextInt(21);
				pw.println(N + " " + M);
				count--;
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
