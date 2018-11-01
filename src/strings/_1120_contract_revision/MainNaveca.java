package strings._1120_contract_revision;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MainNaveca {

	public static void main(String[] args) throws IOException {

		// BufferedReader br = new BufferedReader(new
		// InputStreamReader(System.in));
		String myPackage = MainNaoOtimizado.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1120.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		PrintWriter bw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

		StringTokenizer line = new StringTokenizer(br.readLine());
		char digit = line.nextToken().charAt(0);
		String number = line.nextToken();
		boolean notEmpty, rb = false;
		int numberLen;

		while (digit != '0' && number.charAt(0) != '0') {

			notEmpty = rb = false;
			numberLen = number.length();

			for (int i = 0; i < numberLen; i++) {
				if (number.charAt(i) != digit) {
					if (number.charAt(i) == '0' && !rb) {
						continue;
					}
					notEmpty = rb = true;
					bw.write(number.charAt(i));
				}
			}

			bw.write(notEmpty ? "\n" : "0\n");

			line = new StringTokenizer(br.readLine());
			digit = line.nextToken().charAt(0);
			number = line.nextToken();
		}

		bw.flush();
	}
}