package beginners._1047_game_time_with_minutes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Read the start time and end time of a game, in hours and minutes (initial hour, initial minute,
 * final hour, final minute). Then print the duration of the game, knowing that the game can begin
 * in a day and finish in another day.
 * Obs.: With a maximum game time of 24 hours and the minimum game time of 1 minute.
 * 
 * Input
 * - Four integer numbers representing the start and end time of the game.
 * 
 * Output
 * - Print the duration of the game in hours and minutes, in this format: "O JOGO DUROU XXX HORA(S)
 *   E YYY MINUTO(S)" . Which means: the game lasted XXX hour(s) and YYY minutes.
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");
		//int sH = Integer.parseInt(s[0]);
		//int sM = Integer.parseInt(s[1]);
		int eH = Integer.parseInt(s[2]);
		//int eM = Integer.parseInt(s[3]);
		
		if (eH <= Integer.parseInt(s[0])) {
			eH = eH + 24;
		}

		int temp = ((60 * eH) + Integer.parseInt(s[3])) - ((60 * Integer.parseInt(s[0])) + Integer.parseInt(s[1]));

		out.write("O JOGO DUROU " + (temp/60) + " HORA(S) E " + (temp%60) + " MINUTO(S)" + "\n");
		in.close();
		out.flush();
	}

}
