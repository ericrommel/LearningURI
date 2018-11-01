package simulators._1667_html;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * If you ever tried to read a html document on a Macintosh, you know how hard it is if no Netscape is installed. Now, who can forget to install a HTML browser? This is very easy because most of the times you don't need one on a MAC because there is a Acrobate Reader which is native to MAC. But if you ever need one, what do you do? Your task is to write a small html-browser. It should only display the content of the input-file and knows only the html commands (tags) which is a linebreak and

which is a horizontal ruler. Then you should treat all tabulators, spaces and newlines as one space and display the resulting text with no more than 80 characters on a line.

Input

The input consists of a text you should display. This text consists of words and HTML tags separated by one or more spaces, tabulators or newlines.A word is a sequence of letters, numbers and punctuation. For example, "abc,123" is one word, but "abc, 123" are two words, namely "abc," and "123". A word is always shorter than 81 characters and does not contain any '<' or '>'. All HTML tags are either <br> or <hr>.

Output

You should display the the resulting text using this rules:

If you read a word in the input and the resulting line does not get longer than 80 chars, print it, else print it on a new line.

If you read a <br> in the input, start a new line.

If you read a <hr> in the input, start a new line unless you already are at the beginning of a line, display 80 characters of '-' and start a new line (again).

The last line is ended by a newline character.
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1667.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = "";
		String[] str = null;
		
		while ((s=in.readLine()) != null) {
			if ( s.contains("<br>") || s.contains("<hr>") ) {
				
			} else {
				if (s.length() > 80) {
					str = s.split(" ");
					for (int i=0; i<str.length; i++) {
						System.out.println();
					}
				}
			}
		}
	}

}
