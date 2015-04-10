package simulators._1746_dividing_the_names;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The Queen of Nlogonia has decided to move the capital of the queendom to a brand new city called
 * Sortonia. The design for the city is an N � N grid consisting of N avenues running in the
 * North-South direction and N streets running in the East-West direction. Thus, each avenue
 * intersects every street, and no two streets or two avenues intersect each other.
 * 
 * As the city is almost finished, it is now time to assign names to its streets and avenues. The
 * people of Nlogonia have already voted on the 2�N names that they want to use, but it hasn�t been
 * decided yet which of those will be used for the streets and which for the avenues. The issue is
 * not so simple, because in each crossing there should be a sign identifying the street and the
 * avenue that intersect there, and the Queen has expressly ordered that the letters in these signs
 * ought to be written in gold encrusted with rubies.
 * 
 * Being the official Accountant who Counts the Money (ACM), it is your task to find a way to
 * minimize the total number of letters written in the crossings� signs, for obvious reasons.
 * Luckily, you have thought of a very clever way to achieve this, which is to use abbreviations
 * for the names of the streets and avenues in the signs. The abbreviation for the name of an
 * avenue (respectively a street) is the shortest prefix of its name which is not a prefix of the
 * name of any other avenue (respectively street). Of course, the abbreviation to be used for each
 * name depends on how the set of 2 � N names is split in two disjoint sets of N names to be used
 * for the streets and avenues.
 * 
 * For example, consider the case with N = 2 where the four chosen names are "GAUSS", "GALOIS",
 * "ERDOS" and "EULER". If the streets are assigned the names "GAUSS" and "GALOIS", whereas the
 * avenues are assigned the names "ERDOS" and "EULER", then the abbreviations would be "GAU" for
 * "GAUSS", "GAL" for "GALOIS", "ER" for "ERDOS" and "EU" for "EULER". With this splitting, the
 * total number of letters to be written in the signs would be 20, as the four intersections would
 * be labeled by "GAU|ER", "GAU|EU", "GAL|ER" and "GAL|EU".
 * 
 * However, in the example above it would be more convenient to assign the streets the names "GAUSS"
 * and "ERDOS", leaving "GALOIS" and "EULER" for the avenues. Then, the abbreviations would be "G"
 * for "GAUSS", "E" for "ERDOS", "G" for "GALOIS" and "E" for "EULER", and the total number of
 * letters to be written in the signs would be just 8 (as the intersections would be labeled by
 * "G|G", "G|E", "E|G" and "E|E").
 * 
 * Fortunately, the set of names that has been chosen is such that no name in it is a prefix of some
 * other name in the set, thereby ensuring that the scheme you propose will always be feasible. Can
 * you calculate the minimum number of letters to be written in the signs if you split the names
 * optimally?
 * 
 * Input
 * - The first line contains an integer N (2 <= N <= 100) representing both the number of streets
 *   and the number of avenues in Sortonia. Each of the next 2 � N lines contains a non-empty
 *   string of at most 18 uppercase letters, indicating one of the names that have been chosen.
 *   You may assume that none of the given strings is a prefix of another string in the input.
 *   
 * Output
 * - Output a line with an integer representing the minimum total number of letters to be written
 *   in the signs, when the splitting of the names of streets and avenues is chosen optimally.
 *   
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int row=0, col=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = "";

		s=in.readLine();
		row = col = Integer.parseInt(s);
		String[][] maps = new String[row][col];
		List<String> names = new ArrayList<String>();
		List<String> streets = new ArrayList<String>();
		List<String> avenues = new ArrayList<String>();
		
		for (int i=0; i<2*row; i++) {
			s=in.readLine();
			names.add(s);
		}
		in.close();
		
		/* Atribuindo os nomes as avenidas e ruas */
		for (int i=0; i<names.size(); i++) {
			if (i < names.size()/2) {
				avenues.add(names.get(i));
				System.out.println("Avenues: " + avenues.get(i));
			} else {
				streets.add(names.get(i));
				System.out.println("Streets: " + streets.get(i-(names.size()/2)));
			}
		}

		// Trocando os nomes entre ruas e avenidas (nao ficou legal quando tem 8 ou mais)
		for (int i=0; i<avenues.size()-1; i++) {
			boolean troca = true;
			String aux = "";
			StringBuilder str1 = new StringBuilder(avenues.get(i));
			StringBuilder str2 = new StringBuilder(streets.get(i));
			for (int j=0; j<avenues.get(i).length(); j++) {
				char a = avenues.get(i).charAt(j);
				char b = avenues.get(i+1).charAt(j); 
				if (a == b && troca) {
					aux = avenues.get(i);
					avenues.set(i, streets.get(i));
					streets.set(i, aux);
					troca = false;
				} else {
					break;
				}
			}
		}

//		if (avenues.get(i).contains(Character.toString(avenues.get(i).charAt(j)))) {
//		System.out.println( Character.toString(avenues.get(i).charAt(j)) );
//	}							

		
		for (int i=0; i<row; i++) {
			System.out.println(streets.get(i));
		}
		for (int i=0; i<col; i++) {
			System.out.println(avenues.get(i));
		}		
//		for (int j=0; j<row; j++) {
//			for (int k=0; k<col; k++) {
//				maps[j][k] = s=in.readLine();;
//			}
//		}
//		
//		for (int j=0; j<row; j++) {
//			for (int k=0; k<col; k++) {
//				System.out.println(maps[j][k]);
//			}
//		}
	}
}
