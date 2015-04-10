package beginners.page01._1008_salary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write a program that reads the number of an employee, the number of hours that he worked in a
 * month and the amount he received per hour. Print the employee number and the salary that he
 * will receive at end of the month, rounded to two decimal places. Don't forget to print end
 * line after the result otherwise you will get "Presentation Error". Don't forget the space
 * before and after the equal signal and after the U$.
 * 
 * Input
 * - The input file contains 2 integer numbers and 1 floating-point number, respectively the
 *   number, hours worked and the among received by an hour worked.
 *   
 * Output
 * - Print the number and the salary of the employee, according to the given example, with
 *   a blank space before and after the equal signal.
 *     
 * @author e.dantas
 *     
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int NUMBER, HOURS;
		float AMOUNT, SALARY;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		NUMBER = Integer.parseInt(in.readLine());
		HOURS  = Integer.parseInt(in.readLine());
		AMOUNT = Float.parseFloat(in.readLine());
		in.close();
		SALARY = HOURS*AMOUNT;
		System.out.println("NUMBER = " + NUMBER);
		System.out.printf("SALARY = U$ %.2f", SALARY);
		System.out.println();
	}

}
