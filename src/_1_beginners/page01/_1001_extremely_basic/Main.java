package _1_beginners.page01._1001_extremely_basic;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Read 2 variables, named A and B and make the sum of these two variables,
 * assigning its result to the variable X. Print X as shown below. Print
 * endline after the result otherwise you will get “Presentation Error”.
 * 
 * Input
 * - The input file will contain 2 integer numbers.
 * 
 * Output
 * - Print X according to the following example, with a blank space before
 *   and after the equal signal.
 *   
 * @author e.dantas
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
		//int A, B, X;
//			Scanner s = new Scanner(new File("inputfile.txt")).useDelimiter("\\r\\n");
		//BufferedReader br = new BufferedReader(new FileReader("inputfile.txt"));
		//BufferedReader br = new BufferedReader(new FileReader(args[0]));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(System.out);
		//PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		//while (br.readLine()!=null) {
			int A = Integer.parseInt(in.readLine());
			int B = Integer.parseInt(in.readLine());
			int X = A+B;
			System.out.println("X = " + X);
		//}
		in.close();
		//out.flush();
//			Scanner scanner = new Scanner(System.in);
//			Scanner s = scanner.useDelimiter("\\r\\n");
//			while (s.hasNext()) {
//				A = Integer.parseInt(s.nextLine());
//				B = Integer.parseInt(s.nextLine());
//				X = A+B;
//				System.out.println("X = " + X);	
//			}			
//			scanner.close();
	}
}
