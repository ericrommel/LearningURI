package beginners.page01._1014_consumption;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Calculate the average consumption of a car given the total distance traveled (in Km) and the
 * total spent fuel (in liters).
 * 
 * Input
 * - The input file contains two numbers: the first one is an integer X which represents the total
 *   distance (in Km) and the second one is an floating-point number Y  which represents the among
 *   of spent fuel by the car, with a digit after the decimal point.
 * 
 * Output
 * - Print the result which represents the medium of the car consumption with 3 digits after the
 *   decimal point, followed by the message "km/l".
 *   
 * @author e.dantas
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
		float consumption;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		consumption = Integer.parseInt(in.readLine())/Float.parseFloat(in.readLine());
		in.close();
		System.out.printf("%.3f km/l", consumption);
		System.out.println();
	}

}
