package _1_beginners.page01._1035_selection_test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Read 4 integer numbers A, B, C and D. Then if B is greater than C and D is greater than A and if
 * the sum of C and D is greater than the sum of A and B and if C and D were positives values and
 * if A is even, write the message "Valores aceitos" (Accepted values). Otherwise, write the message
 * "Valores nao aceitos" (Values not accepted).
 * 
 * Input
 * - Four integer numbers A, B, C and D.
 * 
 * Output
 * - Show the corresponding message after the validation of the values.
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int a=0, b=0, c=0, d=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> nums = new ArrayList<Integer>();
		
		StringTokenizer st = new StringTokenizer(in.readLine());
		in.close();
		while (st.hasMoreTokens()) {
			nums.add(Integer.parseInt(st.nextToken()));
		}
		a = nums.get(0);
		b = nums.get(1);
		c = nums.get(2);
		d = nums.get(3);
	
		if (b>c & d>nums.get(0) & (c+d)>(a+b) & c>0 & d>0) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}
	}

}
