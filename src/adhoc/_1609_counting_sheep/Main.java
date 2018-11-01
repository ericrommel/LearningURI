package adhoc.page01._1609_counting_sheep;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/**
 * You have decided to count sheep to sleep. You are taking too long to fall asleep and you
 * realized that some of the sheep are repeating! Each one is identified by a unique integer, thus
 * you can avoid counting repeated ones.
 * Given the sheep sequence, output how many you really counted, it is, output the number of
 * distinct ones.
 * 
 * Input
 * - The first line contains an integer T (T = 100*) indicating the number of test cases.
 * - In the first line of each case we have an integer N (1 <= N <= 100* or 1 <= N <= 10^4**),
 *   indicating the number of sheep.
 * - The next line contains N integers separated by space indicating the sequence of sheep.
 *   The sheep identifiers will be between 0 and 10^9, inclusive.
 *   *For around 90% of the cases;
 *   **For the other cases.
 *   
 * Output
 * - Output the number of distinct sheep for each test case.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Set<String> sheeps = new HashSet<String>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
//		PrintWriter out = new PrintWriter(System.out, true);
		
		String[] s = null;
//		while ((s=in.readLine().split(" ")) != null) {
			//int TC = Integer.parseInt(s[0]);
		int TC = Integer.parseInt(in.readLine());
			for (int i=0; i<TC; i++) {
				in.readLine().split(" ");
				//int NS = Integer.parseInt(s[0]);
				s = in.readLine().split(" ");
//				StringTokenizer st = new StringTokenizer(in.readLine());
//				while (st.hasMoreTokens()) {
				for (String str : s) {
//					if (!sheeps.contains(str)) {
						//sheeps.add(st.nextToken());
					sheeps.add(str);
//					}
				}
				out.write(sheeps.size() + "\n");
				sheeps.clear();
			}
			in.close();
			out.flush();
//		}
	}
}
