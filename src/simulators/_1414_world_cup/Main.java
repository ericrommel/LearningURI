package simulators._1414_world_cup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * A Button Soccer World Cup is being held with teams from around the world. The classification is
 * based on the number of points earned by the teams, and the distribution of points is done in the
 * usual way. That is, when a team wins a game, it gets 3 points if the game ends in a draw, both
 * teams get 1 point, and the loser no points.
 * Given the current standings of the teams and the number of participating teams in the World Cup,
 * his task is to determine how many games ended in draws so far.
 * 
 * Input
 * - The input contains several test cases. The first line of a test case contains two integers T
 *   and N, respectively indicating the number of participating teams (2 <= T <= 200) and the number
 *   of matches played (0 <= N <= 10000). Each of the next T lines contains the name of a team (a
 *   string of up to 10 letters and digits), a space, and the number of points the team got so far.
 *   The end of input is indicated by T = 0.
 * 
 * Output
 * - For each test case your program must print a single line containing an integer representing the
 *   amount of games ended in draws.
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1414.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		String[] str = null;
		int T=2, N=0;
		
		while ((s=in.readLine()) != null) {
			str = s.split(" ");
			T = Integer.parseInt(str[0]);
			N = Integer.parseInt(str[1]);
			if (T!=0 && N!=0) {
				for (int i=0; i<T; i++) {
					
				}				
			}
		}
	}

}
