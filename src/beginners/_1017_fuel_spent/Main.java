package beginners._1017_fuel_spent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Little John wants to calculate and show the amount of liters of fuel spent on a trip, using a
 * car that does 12 Km/L. For this, he would like you to help him through a simple program. To
 * perform the calculation, you have to read time spent (in hours) and the same average speed
 * (km/h). This way you can get distance and then calculate how many liters would be needed.
 * Print the result rounded to three decimal places.
 * 
 * Input
 * - The input file contains two integers. The first one is the time spent in the trip (in hours).
 *   The second one is the average velocity during the trip (in Km/h).
 * 
 * Output
 * - Print how many liters would be needed to do this trip, with three digits after the decimal point.
 * 
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int DT=0, VM=0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		/**
		 * Vm = DS/DT -> DS = Vm*DT
		 * Ct = DS/Cm (Ct=Consumo Total, Cm=Consumo Medio 
		 */ 
		DT = Integer.parseInt(in.readLine());
		VM = Integer.parseInt(in.readLine());
		out.printf("%.3f\n", ((VM*DT)/12.0));
		in.close();
		out.flush();
	}
}
