package _1_beginners.page01._1013_the_greatest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Make a program that read 3 integer numbers and print the greatest one using the following formula:
 * MaiorAB = (a+b+abs(a-b))/2
 * 
 * Input
 * - The input file contain 3 integer numbers.
 * 
 * Output
 * - Print the greatest of these three values followed by a space and the message "eh o maior".
 * 
 * @author e.dantas
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int A=0, B=0, C=0, MAJOR=0;
		//String s;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//while ( (s=in.readLine()) != null ) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			while (st.hasMoreTokens()) {
				A = Integer.parseInt(st.nextToken());
				B = Integer.parseInt(st.nextToken());
				C = Integer.parseInt(st.nextToken());
			}
			MAJOR = majorAB(A, B);
			MAJOR = majorAB(MAJOR, C);
		//}
		in.close();
		System.out.println(MAJOR + " eh o maior");
	}
	
	static int majorAB(int a, int b) {
		return (a + b + Math.abs(a-b))/2;
	}
}

