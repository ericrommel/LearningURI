package simulators._1063_rails_again_tracing_movements;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * Do you remember the railway station of PopPush City? If you don't know about or only to remember,
 * exist a railway station in a country incredibly hilly. In addition, the station was built in last
 * century and unfortunately, funds were extremely limited that time. It was possible to establish
 * only a surface track. Moreover, it turned out that the station could be only a dead-end one (see
 * picture) and due to lack of available space it could have only one track.
 * 
 * Every wagon arriving from the direction A continues in the direction B, reorganized in some way
 * at the station. You can assume that every single wagon can be disconnected from the train before
 * it enter the station and that they can move themselves until they are on the track in the
 * direction B to be connected in the other locomotive. You can also suppose that at any time there
 * can be located as many wagons as necessary in the station. But once a wagon has entered the
 * station it cannot return to the track in the direction A and also once it has left the station in
 * the direction B it cannot return back to the station.
 * 
 * All the wagons are identified by letters from a to z, all in lowercase. This means 26 wagons, at
 * the maximum. The chief for train reorganizations must know what sequence of movements is needed
 * to achieve a desired output order to continue going from station to B direction. The movements to
 * and from the station, are described by the letters I and R (Insert and Remove respectely). Using
 * the figure example, the input e,t,d,a and the desired output d,a,t,e, result in the movements
 * I,I,I,R,I,R,R,R
 * 
 * Input
 * - The input consists of many test cases, where each one is a set of three lines. The first line
 *   is an integer number that represent the number of wagons. The second line contains the input
 *   sequence and a third line presents the desired output sequence. The last line of the input
 *   contains just 0, indicating the end of input.
 *   
 * Output
 * - The output file contains the lines corresponding to the number of test cases. Each line contain
 *   a sequence of I and R needed to produce the output. If it’s impossible generate the I/R
 *   sequence, the message "Impossible" must be printed.
 * 
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1063.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<String> stack = new Stack<String>();
		int size = 0, tam=0;
		String[] input=null, output=null;
		while ((size=Integer.parseInt(in.readLine())) != 0) {
			input = in.readLine().split(" ");
			output = in.readLine().split(" ");		
			for (int i=0; i<size; i++) {
//				System.out.println("input[" + i + "] = " + input[i]);
//				System.out.println("output[" + tam + "] = " + output[tam]);
//				System.out.println("input[" + i + "] != output[ " + tam + "]");
				if (!input[i].equals(output[tam])) {
					stack.push(input[i]);
					System.out.print("I");
				} else {
					if (input[i+1] != null) {
						stack.push(input[i]);
						tam++;
						System.out.print("R");
					}
				}
			}
			System.out.println();
		}
		in.close();
		out.flush();
		
	}

}
