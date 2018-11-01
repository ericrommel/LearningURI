package generateTCs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateTCs {

	public static void main(String[] args) {
		int N, NS;
		File arq = new File("test_cases.txt");
		try (PrintWriter pw = new PrintWriter(arq)) {
			Random generate = new Random();
			N = generate.nextInt(100)+1;
			pw.println(N);
			while (N!=0) {
				NS = generate.nextInt(100)+1;
				pw.println(NS);
				while (NS!=0) {
					pw.printf("%d ", generate.nextInt(NS)+1);
					NS--;
				}
				pw.println();
				N--;
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
