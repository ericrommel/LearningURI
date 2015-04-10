package _1_beginners.page01._1016_distance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Two cars (X and Y) leave in the same direction. The car X leaves with a constant speed of 60 km/h
 * and the car Y leaves with a constant speed of 90 km/h. Read the distance (in km) and calculate
 * how long it takes (in minutes) for the car Y to reach this distance in relation to the other car.
 * 
 * Input
 * - The input file contain 1 integer number.
 * 
 * Output
 * - Print the necessary time followed by the message " minutos" that means minutes in portuguese.
 * 
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int minutes;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		/**
		 * Partindo do mesmo lugar aa velocidade contante:
		 * - CarX: 60 km/h e CarY: 90 km/h
		 * - Após 60 minutos, o CarY estará 30Km (90km-60km) na frente do Carro X.
		 * Colocando na regra de três, temos:
		 * 60min -- (30)
		 * X min -- Distancia
		 * X = (Distancia * 60)/30
		 */
		minutes = (Integer.parseInt(in.readLine())*60)/30;
		in.close();
		System.out.println(minutes + " minutos");
	}

}
