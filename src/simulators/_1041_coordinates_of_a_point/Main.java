package simulators._1041_coordinates_of_a_point;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Write an algorithm that reads two floating values (x and y), which should represent the
 * coordinates of a point in a plane. Next, determine which quadrant the point belongs, or if you
 * are over one of the Cartesian axes or the origin (x = y = 0).
 * 
 *                  y
 *              Q2  | Q1
 *           -------------x
 *              Q3  | Q4
 * 
 * If the point is at the origin, write the message "Origem".
 * If the point is over X axis write "Eixo X", else if the point is over Y axis write "Eixo Y".
 * 
 * Input
 * - The input contains the coordinates of a point.
 * 
 * Output
 * - The output should display the quadrant in which the point is.
 * 
 * @author Eric
 *
 */
public class Main {

	/** Primeiro quadrante: x > 0 e y > 0
	 *  Segundo quadrante : x < 0 e y > 0
	 *  Terceiro quadrante: x < 0 e y < 0
	 *  Quarto quadrante  : x > 0 e y < 0
	 */
	public static void main(String[] args) throws IOException {
		float x=0, y=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] s = in.readLine().split(" ");
		//		while ((s=in.readLine()) != null) {
		//			StringTokenizer st = new StringTokenizer(s);
		//			while (st.hasMoreTokens()) {


		x = Float.parseFloat(s[0]);
		y = Float.parseFloat(s[1]);
		if (x>0) {
			if (y>0) {
				System.out.println("Q1");
			} else if (y<0){
				System.out.println("Q4");	
			} else {
				System.out.println("Eixo X");	
			}
		} else if (x<0) {
			if (y>0) {
				System.out.println("Q2");
			} else if (y<0) {
				System.out.println("Q3");
			} else {
				System.out.println("Eixo X");							
			}
		} else {
			if (y==0) {
				System.out.println("Origem");
			}
			if (y!=0) {
				System.out.println("Eixo Y");
			}
		}
		//			}
		//		}
		in.close();
	}
}
