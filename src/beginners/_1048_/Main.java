package beginners._1048_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * The enterprise ABC had decided to give a salary increase to his employees, according de following
 * table:
 * +---- Salary --------+- Increase Percentual -+
 * |       0 -  400.00  |       15%             |
 * |  400.01 -  800.00  |       12%             |
 * |  800.01 - 1200.00  |       10%             |
 * | 1200.01 - 2000.00  |        7%             |
 * | Acima de 2.000.00  |        4%             |
 * +--------------------+-----------------------+
 * 
 * Read de employee salary, calculate and print the new employee salary, as well the Money earned
 * and the increase percentual obtained by the employee, with corresponding messages in Portuguese,
 * as the below example.
 * 
 * Input
 * - The input contains only a floating-point number, with 2 digits after the decimal point.
 * 
 * Output
 * - Print 3 messages followed by the corresponding numbers (see example) informing the new salary,
 *   the among of money earned and the percentual obtained by the employee. Note:
 *   Novo salario:  means "New Salary"
 *   Reajuste ganho: means "Money earned"
 *   Em percentual: means "In percentage"
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		int percent=0;
		double salary = Double.parseDouble(in.readLine());
		in.close();
		if (salary >= 0 & salary <= 400) {
			percent = 15;
		} else if (salary > 400 & salary <= 800) {
			percent = 12;
		} else if (salary > 800 & salary <= 1200) {
			percent = 10;
		}else if (salary > 1200 & salary <= 2000) {
			percent = 7;
		}else if (salary > 2000) {
			percent = 4;
		}
		out.printf("Novo salario: %.2f\n", (salary + (salary*percent)/100));
		out.printf("Reajuste ganho: %.2f\n", (salary+(salary*percent)/100 - salary));
		out.println("Em percentual: " + percent + " %");
		out.flush();
	}

}
