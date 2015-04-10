package _1_beginners.page01._1015_distance_between_two_points;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Read the four values corresponding to the x and y axes of two points in the plane, p1 (x1, y1)
 * and p2 (x2, y2) and calculate the distance between them, rounded to four decimal places, according
 * to the formula:
 * 
 * Distance = raiz( (x2-x1)^2 + (y2-y1)^2 ) // Distância Euclidiana
 * 
 * Input
 * - The input file contains two lines with data. The first one contains two double numbers with one
 *   digit after the decimal point, respectly: x1 y1 and the second one also contains two double
 *   numbers with one digit after the decimal point: x2 y2.
 * 
 * Output
 * - Calculate and print the distance, using the above phormula, with 4 digits after the decimal point.
 * 
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		double distance=0;
		ArrayList<Double> points = new ArrayList<Double>(); 
		String s;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while ( (s=in.readLine()) != null ) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				points.add(Double.parseDouble(st.nextToken()));
			}
		}
		in.close();
		distance = Math.sqrt((Math.pow((points.get(2)-points.get(0)), 2) + Math.pow((points.get(3)-points.get(1)), 2)));
		System.out.printf("%.4f\n", distance);
	}

}
