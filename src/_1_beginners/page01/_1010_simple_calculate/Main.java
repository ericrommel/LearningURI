package _1_beginners.page01._1010_simple_calculate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * In this problem the task is read a code for a product 1, the number of units of product 1, the
 * price for one unit of product 1, the code for a product 2, the number of units of product 2, the
 * price for one unit of product 2 and calculates and print the amount to be paid.
 * 
 * Input
 * - The input file contains two lines of data. In each contains 3 numbers: two integers and a
 *   floating number with 2 digits after the decimal point.
 *   
 * Output
 * - The output file will contain a message like the following example where "Valor a pagar"
 *   means Value to Pay. Remember the space after the ":" and after the "$" symbol. The value
 *   must be printed with 2 digits after the point.
 *   
 * @author e.dantas
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int CODE=0, UNITS=0;
		float PRICE=0, VALOR=0;
		String s;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//for (int i=0; i<=1; i++) {
		while ((s=br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreElements()) {
				CODE = Integer.parseInt(st.nextToken());
				UNITS = Integer.parseInt(st.nextToken());
				PRICE = Float.parseFloat(st.nextToken());
			}
			VALOR = VALOR + (UNITS*PRICE);
		}
		br.close();
		System.out.printf("VALOR A PAGAR: R$ %.2f", VALOR);
		System.out.println();
	}
}
