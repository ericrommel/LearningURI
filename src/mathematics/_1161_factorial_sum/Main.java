package mathematics._1161_factorial_sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Read two numbers M and N indefinitely. Calculate and write the sum of their factorial. Be
 * carefull, because the result can have more than 15 digits.
 *
 * Input
 * - The input file contains many test cases. Each test case contains two integer numbers
 *   M (0 <= M <= 20) and N (0 <= N <= 20). The end of file is determined by eof.
 *
 * Output
 * - For each test case in the input your program must print a single line, containing an number
 *   that is the sum of the both factorial (M and N).
 *
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = "";
		String[] s = null;
		while ((str=in.readLine())!=null) {
			s = str.split(" ");
//			out.write((fat_rec(Integer.parseInt(s[0])) + fat_rec(Integer.parseInt(s[1]))) + "\n");
			out.write(sumFat(Integer.parseInt(s[0]), Integer.parseInt(s[1])) + "\n");
		}
		in.close();
		out.flush();
	}

	// Metodo nao recursivo que retorna a soma
	static long sumFat(int n, int m) {
		long fatorial=1;
		if (n==m) {
			if (n == 0 || n == 1) {
				fatorial=1;
			} else {
				for (long i=n; i>=1; i--) {
					fatorial *= i;
				}
			}
			return fatorial*2;
		} else {
			return fat(n) + fat(m);
		}
//		return fatorial;
	}

	// Metodo nao recursivo
	static long fat(int n) {
		long fatorial=1;
		if (n == 0 || n == 1) {
			fatorial=1;
		} else {
			for (long i=n; i>=1; i--) {
				fatorial *= i;
			}
		}
		return fatorial;
	}

	// Metodo recursivo
	static long fat_rec(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return (n * fat_rec(n-1));
		}
	}
}
