package generateTCs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateTC_1400 {

	public static void main(String[] args) {
		int count, N, M, K;
		File arq = new File("test_cases.txt");
		try (PrintWriter pw = new PrintWriter(arq)) {
			Random generate = new Random();
			count = 1000000000;
			while (count!=0) {
				N = generate.nextInt(1000)+ 2;
				M = generate.nextInt(N) + 1;
				K = generate.nextInt(1000) + 1;
				pw.println(N + " " + M + " " + K);
				count--;
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
