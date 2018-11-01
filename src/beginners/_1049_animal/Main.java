package beginners._1049_animal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * In this problem, your job is to read three Portuguese words. These words define an animal
 * according to the table below, from left to right. After, print the chosen animal defined by
 * these three words.
 * 
 * Input
 * - The input contains 3 words, one by line, that will be used to identify the animal, according
 *   to the above table, with all letters in lowercase.
 *   
 * Output
 * - Print the animal name according to the given input.
 * 
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		String s = in.readLine();
		
		if (s.equals("vertebrado")) {
			s = in.readLine();
			if (s.equals("ave")) {
				s = in.readLine();
				if (s.equals("carnivoro")) {
					out.write("aguia\n");
				} else {
					out.write("pomba\n");
				}
			} else {
				s = in.readLine();
				if (s.equals("onivoro")) {
					out.write("homem\n");
				} else {
					out.write("vaca\n");
				}				
			}
		} else {
			s = in.readLine();
			if (s.equals("inseto")) {
				s = in.readLine();
				if (s.equals("hematofago")) {
					out.write("pulga\n");
				} else {
					out.write("lagarta\n");
				}
			} else {
				s = in.readLine();
				if (s.equals("onivoro")) {
					out.write("minhoca\n");
				} else {
					out.write("sanguessuga\n");
				}				
			}			
		}
		in.close();
		out.flush();
	}

}
