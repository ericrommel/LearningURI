package simulators._1243_how_easy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * TopCoder decided to automate the process of assigning levels of difficulty to the problems.
 * TopCoder developers concluded that the difficulty of the problem is related only to average
 * length of the words in the problem statement. If the average length of the words of the statement
 * is less than or equal to 3, the problem difficulty receives 250 points. If the average length of
 * the words of the statement is 4 or 5, the problem difficulty receives 500 points. If the average
 * length of utterance of words is greater than or equal to 6, the problem difficulty receives 1000
 * points.
 * Definitions:
 * - Symbol: A set of characters linked by spaces from both sides, or at the beginning of the
 *           description of the problem, or even the end of the description of the problem.
 * - Word: a symbol that contains only letters a-z or A-Z, epode finished with a single point.
 * - Word length: number of letters in a word (a point is not a letter).
 * 
 * Examples of symbols are words (quotes just to exemplify): "AB", "ab".
 * Example of symbols that are not words: "ab..", "a.b", ".ab", "a.b.", "a2b.", ".".
 * 
 * The average length of the words is given by the sum of the sizes of the utterance of words
 * divided by the number of words, the division is made by integers. If the word count is zero,
 * then the average length of the words is zero.
 * 
 * Your task is given the problem statement, compute its classification of difficulty of the
 * problem, which can be 250, 500, or 1000.
 * 
 * Input
 * - The entry contains several test cases. Each test case is composed of a line containing the
 *   statement of a problem, is a string containing between 1 and 50 characters ('A'-'Z','a'-'z',
 *   '0'-'9', ' ', '.') inclusive. The end of input is determined by EOF.
 *   
 * Output
 * - Compute the average length of words in the statement of the problem, and show the
 *   classification of the problem, for more details see the example below.
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int totalLetters=0, totalWords=0, media=0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		StringTokenizer st = null;
		
		while ((s=in.readLine()) != null) {
			st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				s = st.nextToken();
				// REGEX:
				//        [a-zA-Z]+ = qualquer quantidade que seja letra minuscula ou maiuscula
				//        | = 1 ou outro
				//        [a-zA-Z]+[\\.]{1} = o anterior e que termine com apenas 1 ponto 
				//if (s.matches("[a-zA-Z]+|[a-zA-Z]+[\\.]{1}")) {
				if (s.matches("[a-zA-Z]+[\\.]?")) {
					totalWords++;
					totalLetters += s.length();
					if (s.indexOf(".") != -1) {
						totalLetters--;	
					}
				}
			}
			
			media = totalWords > 0 ? totalLetters/totalWords : 0; 
			
			if (media <= 3) {
				out.write(250 + "\n");
			} else if (media == 4 | media == 5) {
				out.write(500 + "\n");
			} else {
				out.write(1000 + "\n");
			}
			
			totalLetters=totalWords=0;
		}
		in.close();
		out.flush();
	}

}
