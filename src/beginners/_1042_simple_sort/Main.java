package beginners._1042_simple_sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Read three integers and sort them in ascending order. After, print these values in ascending
 * order, a blank line and then the values in the sequence as they were readed.
 * 
 * Input
 * - The input contains three integer numbers.
 * 
 * Output
 * - Present the output as requested above.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
	//	int N1=0, N2=0, N3=0;
		List<Integer> vet = new ArrayList<Integer>();
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");
		vet.add(Integer.parseInt(s[0]));
		vet.add(Integer.parseInt(s[1]));
		vet.add(Integer.parseInt(s[2]));

		/* Maneira 1: Algoritmo Bolha */
//		for (int i=0; i<s.length; i++) {
//			for (int j=0; j<s.length-1; j++) {
//				if (Integer.parseInt(s[j]) > Integer.parseInt(s[j+1])) {
//					aux = s[j];
//					s[j] = s[j+1];
//					s[j+1] = aux;
//				}
//			}
//		}

		/* Maneira 2: Metodo sort() */
		Collections.sort(vet);

		for (int i : vet) {
			out.println(i);
		}

		out.println();
		
		for (String str : s) {
			out.println(str);
		}
		in.close();
		out.flush();
	}
}

