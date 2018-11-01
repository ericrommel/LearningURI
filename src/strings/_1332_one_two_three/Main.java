package strings._1332_one_two_three;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Your little brother has just learnt to write one, two and three, in English. He has written a lot
 * of those words in a paper, your task is to recognize them. Note that your little brother is only
 * a child, so he may make small mistakes: for each word, there might be at most one wrong letter.
 * The word length is always correct. It is guaranteed that each letter he wrote is in lower-case,
 * and each word he wrote has a unique interpretation.
 * 
 * Input
 * - The first line contains the number of words that your little brother has written. Each of the
 *   following lines contains a single word with all letters in lower-case. The words satisfy the
 *   constraints above: at most one letter might be wrong, but the word length is always correct.
 *   There will be at most 1000 words in the input.
 *   
 * Output
 * - For each test case, print the numerical value of the word.
 * 
 * @author e.dantas
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		while ((s=in.readLine()) != null) {
			for (int i=0; i<Integer.parseInt(s); i++) {
				out.write(whatWord(in.readLine()) + "\n");
			}
		}
		in.close();
		out.flush();
	}

	static int whatWord(String str) {
		int one=0, three=0, value = 0;
		for (int i=0; i<str.length(); i++) {
			if (str.length() == 3) {
				if (str.charAt(i) == "one".charAt(i)) {
					one++;
				}
//				if (str.charAt(i) == "two".charAt(i)) {
//					two++;
//				}
			} else {
				if (str.charAt(i) == "three".charAt(i)) {
					three++;
				}
			}
		}
//		System.out.println(one);
//		System.out.println(two);
//		System.out.println(three);
		value = (one>=2) ? 1 : 2;
		if (three>=4) {
			value = 3;
		}
		return value;
	}
}
