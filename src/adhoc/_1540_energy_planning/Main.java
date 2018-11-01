package adhoc.page04._1540_energy_planning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 * You are contributing for a summit that will help forecast the growing up of eletrical energy in
 * Brazil, making the eletric power be available for a long time in the future.
 * To be able do that, you have the following informations:
 *  1. During the year of 2010 the consume average was 104,326 GWh.
 *  2. In 2013 the consume was 127,755 GWh.
 *  
 *  You should calculate the anual growing up rate for many situations and forcasting, you can
 *  assume that this growing up is linear. In this case, the rate was 7809,66 GWh per year.
 *  
 * Input
 * - The first input line has an integer number N (1 <= N <= 1000) that is the total test cases.
 *   The follow N lines are made by the integers A, B (B > 0), C and D (D > 0) separated by one
 *   blank space. The number A is the year, B is the consume of A year. The number C is another
 *   year and number D is the consume of B year.
 *   
 * Output
 * - For each test case, should be printed the growing up rate with only two decimal places,
 *   separated by comma and truncated - no rounding.
 *   
 * @author e.dantas
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.GERMAN);
		//String myPackage = Main.class.getPackage().getName().replace(".", "/");
		//FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1540.txt");
		//BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String tam = "";
		String[] s = null;
		double qtdAnos = 0;
		double diffConsume = 0;
		double consume = 0;
		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.DOWN);
		while ((tam=in.readLine()) != null) {
			for (int i=0; i<Integer.parseInt(tam); i++) {
				s = in.readLine().split(" ");
				qtdAnos = Double.parseDouble(s[2]) - Double.parseDouble(s[0]);
				diffConsume = Double.parseDouble(s[3]) - Double.parseDouble(s[1]);
				consume = diffConsume/qtdAnos;
				out.println(df.format(consume));
			}			
		}
		in.close();
		out.flush();
	}
}
