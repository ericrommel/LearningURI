package beginners._1046_game_time;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Read the start time and end time of a game, in hours. Then calculate the duration of the game,
 * knowing that the game can begin in a day and finish in another day, with a maximum duration of
 * 24 hours. The message must be printed in portuguese "O JOGO DUROU X HORA(S)" that means "THE GAME
 * LASTED X HOUR(S)".
 * 
 * Input
 * - Two integer numbers representing the start and end time of a game.
 * 
 * Output
 * - Print the duration of the game as in the sample output.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] s = in.readLine().split(" ");			
		int tempo = 24 - (Integer.parseInt(s[0]) - Integer.parseInt(s[1]));
		if (tempo > 24) {
			tempo = tempo-24;
		}
		out.write("O JOGO DUROU " + tempo + " HORA(S)\n");
		in.close();
		out.flush();
	}
}
