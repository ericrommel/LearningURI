package beginners.page01._1009_salary_with_bonus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * You have to calculate the final salary for your employee, based on value sold by him. So you have
 * to read his name, his fixed salary and the value sold by him. Your functionary wins 15% over all
 * products sold. Write the final (total) salary of this functionary, rounded to two decimal places.
 * - Don�t forget to print end line after the result otherwise you will get "Presentation Error".
 * - Don�t forget the blank spaces.
 * 
 * Input
 * - The input file contains an string (employee first name), and two double values, that are the
 *   salary of this employee and the total value sold by him.
 *   
 * Output
 * - Print the total salary of the employee, according to the given example.
 * 
 * @author e.dantas
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String NOME;
		double SALARIO, SOLD, TOTAL;
//		DecimalFormat df = new DecimalFormat("#.00");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		NOME = in.readLine();
		in.close();
		SALARIO = Double.parseDouble(in.readLine());
		SOLD = Double.parseDouble(in.readLine());
		TOTAL = SALARIO + (SOLD*0.15);
		System.out.printf("TOTAL = R$ %.2f", TOTAL);
		System.out.println();
	}

}