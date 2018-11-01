package simulators._1279_leap_year_or_not_leap_year_and;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * The ancient race of Gulamatu is very advanced in their year calculation scheme. They understand what leap year is (A year that is divisible by 4 and not divisible by 100 with the exception that years that are divisible by 400 are also leap year.) and they have also similar festival years. One is the Huluculu festival (happens on years divisible by 15) and the Bulukulu festival (Happens on years divisible by 55 provided that is also a leap year). Given an year you will have to state what properties these years have. If the year is not leap year nor festival year, then print the line 'This is an ordinary year.' The order of printing (if present) the properties is leap year-->huluculu-->bulukulu.

Input

Input will contain several years as input. Each year will be in separate lines. Input is terminated by end of file. All the years will not be less than 2000 (to avoid the earlier different rules for leap years) but can have more than 1000 digits.

Output

For each input, output the different properties of the years in different lines according to previous description and sample output. A blank line should separate the output for each line of input. Note that there are four different properties.
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
//		String myPackage = Main.class.getPackage().getName().replace(".", "/");
//		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1279.txt");
//		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		int year = 0;
		while ((s=in.readLine()) != null) {
			if (!s.equals("")) {
				year = Integer.parseInt(s);
				if ( ((year%4==0) && (year%100!=0)) || year%400==0) {
					out.write("This is leap year.\n");
					if (year%15==0) {
						out.write("This is huluculu festival year.\n");	
					}
					if (year%55==0) {
						out.write("This is Bulukulu festival year.\n");
					}
				} else {
					if (year%15==0) {
						out.write("This is huluculu festival year.\n");	
					} else {
						out.write("This is an ordinary year.\n");
					}
				}
				out.write("\n");				
			} else {
				break;
			}
		}
		in.close();	
		out.flush();
	}
}
