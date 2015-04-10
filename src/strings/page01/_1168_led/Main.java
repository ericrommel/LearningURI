package strings.page01._1168_led;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * John wants to set up a panel containing different numbers of LEDs. He does not have many leds,
 * he is not sure if will be able to mount the desired number. Considering the configuration of the
 * LEDs of the numbers below, make an algorithm that helps John to discover the number of LEDs
 * needed to set the value.
 *
 * Input
 * - The input contains an integer N, (1 <= N <= 2000) corresponding to the number of test cases,
 *   followed by N lines, each line containing an number (1 <= V <= 10100) corresponding to the value
 *   that John wants to set with the leds.
 *   
 * Output
 * - For each test case, print one line containing the number of LEDs that John needs to set the
 *   desired value, followed by the word "leds".
 *   
 * @author e.dantas
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		int N=0, leds=0;
		
		String s = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		while ((s=in.readLine()) != null) {
			N = Integer.parseInt(s);
			for (int i=0; i<N; i++) {
				s = in.readLine();
				for (int j=0; j<s.length(); j++) {
					char c = s.charAt(j);
					switch (c) {
					case '1':
						leds+=2;
						break;
					case '2':
					case '3':
					case '5':
						leds+=5;
						break;
					case '4':
						leds+=4;
						break;
					case '6':
					case '9':
					case '0':
						leds+=6;
						break;
					case '7':
						leds+=3;
						break;						
					case '8':
						leds+=7;
						break;						
					}
				}
				System.out.println(leds + " leds");
				leds=0;
			}
		}
	}
}
