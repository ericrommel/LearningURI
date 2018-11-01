package beginners._1035_selection_test_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
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
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");
//		List<Integer> nums = new ArrayList<Integer>();
		
//		StringTokenizer st = new StringTokenizer(in.readLine());
//		while (st.hasMoreTokens()) {
//			nums.add(Integer.parseInt(st.nextToken()));
//		}
		
//		a = nums.get(0);
//		b = nums.get(1);
//		c = nums.get(2);
//		d = nums.get(3);
	
		a = Integer.parseInt(s[0]);
		b = Integer.parseInt(s[1]);
		c = Integer.parseInt(s[2]);
		d = Integer.parseInt(s[3]);

		if (b>c & d>a & (c+d)>(a+b) & c>0 & d>0) {
			out.println("Valores aceitos");
		} else {
			out.println("Valores nao aceitos");
		}
		in.close();
		out.flush();
	}

}
