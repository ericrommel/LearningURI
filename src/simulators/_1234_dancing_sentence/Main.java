package simulators._1234_dancing_sentence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * A sentence is called dancing if its first letter is uppercase and the case of each subsequent
 * letter is the opposite of the previous letter. Spaces should be ignored when determining the
 * case of a letter. For example, "A b Cd" is a dancing sentence because the first letter ('A') is
 * uppercase, the next letter ('b') is lowercase, the next letter ('C') is uppercase, and the next
 * letter ('d') is lowercase.
 * 
 * Input
 * - The input contains several test cases. Each test case is composed by one line that contais a
 *   string sentence. This string will contain between 1 and 50 characters ('A'-'Z','a'-'z' or space
 *   ' '), inclusive, or at least, one letter ('A'-'Z','a'-'z').
 *   
 * Output
 * - Turn the sentence into a dancing sentence (like following examples) by changing the cases of
 *   the letters where necessary. All spaces in the original sentence must be preserved, ie,
 *   " sentence " must be converted in " SeNtEnCe ".
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1234.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int first = 0;
		boolean toChange = false;
		String s="";
		StringBuilder str = null;
		while ((s=in.readLine()) != null) {
			str = new StringBuilder(s);
			
			for (int i=0; i<str.length(); i++) {
				
				if (Character.isSpaceChar(str.charAt(i))) {
					out.write(str.charAt(i));
				} else {
					if (first == 0) {
						if (Character.isLowerCase(str.charAt(i))) {
							out.write(Character.toUpperCase(str.charAt(i)));
							toChange = false;
						} else {
							out.write(str.charAt(i));
						}
						first++;
					} else {
						if (!toChange) {
							if (Character.isUpperCase(str.charAt(i))) {
								out.write(Character.toLowerCase(str.charAt(i)));
								toChange = true;								
							} else {
								out.write(str.charAt(i));
								toChange = true;								
							}
						} else {
							out.write(Character.toUpperCase(str.charAt(i)));
							toChange = false;
						}
					}
				}
			}
			out.write("\n");
			first=0;
			toChange=false;
		}
		in.close();
		out.flush();
	}

}
