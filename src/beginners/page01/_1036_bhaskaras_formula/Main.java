package beginners.page01._1036_bhaskaras_formula;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read 3 floating-point numbers. After, print the roots of bhaskara's formula. If was impossible
 * to calculate the roots because a division by zero or a square root of a negative number, presents
 * the message "Impossivel calcular".
 * FORMULA DE BHASKARA: D=(b^2)-4ac, x1=(-b + SQRT(D))\2a
 * D=0, então a equação tem duas raízes iguais.
 * D>0, então a equação tem duas raízes diferentes.
 * D<0, então a equação não tem raízes reais.
 * 
 * Input
 * - Read 3 floating-point numbers A, B and C.
 * 
 * Output
 * - Print the result with 5 digits after the decimal point or the message if it is impossible to
 *   calculate.
 *   
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		double a=0, b=0, c=0, delta=0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] s = in.readLine().split(" ");
		//List<Float> nums = new ArrayList<Float>();
		
		//StringTokenizer st = new StringTokenizer(in.readLine());
		in.close();
		//while (st.hasMoreTokens()) {
		//	nums.add(Float.parseFloat(st.nextToken()));
		//}
		
		a = Double.parseDouble(s[0]);
		b = Double.parseDouble(s[1]);
		c = Double.parseDouble(s[2]);
		delta = (Math.pow(b,2))-(4*a*c); //FORMULA DE BHASKARA: D=(b^2)-4ac, x=(-b +/- SQRT(D))\2a (a != 0)
		
		//D<0, então a equação não tem raízes reais.		
		if (delta < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			//D=0, então a equação tem duas raízes iguais.
			//D>0, então a equação tem duas raízes diferentes.

			if (delta == 0) {
				System.out.printf("R1 = %.5f\n", ( (-b) + Math.sqrt(delta) )/(2*a));
				System.out.printf("R2 = %.5f\n", ( (-b) - Math.sqrt(delta) )/(2*a));					
			} else {
				System.out.printf("R1 = %.5f\n", ( (-b) + Math.sqrt(delta) )/(2*a));
				System.out.printf("R2 = %.5f\n", ( (-b) - Math.sqrt(delta) )/(2*a));
			}
		}
	}
}
