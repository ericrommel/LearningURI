package _1_beginners.page01._1019_time_conversion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read an integer value, which is the duration in seconds of a given event in a factory and tell
 * print it in the format expressed in hours:minutes:seconds.
 * 
 * Input
 * - The input file contains an integer N.
 * 
 * Output
 * - Print the read time in the input file (seconds) converted in hours:minutes:seconds like the
 *   following example.
 *   
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException{
		int ss = 0, hh=0, mm=0;
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		ss = Integer.parseInt(in.readLine());
		
		in.close();
		
		hh = ss/3600;

		ss = ss%3600;
	
		mm = ss/60;
		
		ss = ss%60;
				
		System.out.println(hh+ ":" + mm + ":" + ss);		
	}
}
