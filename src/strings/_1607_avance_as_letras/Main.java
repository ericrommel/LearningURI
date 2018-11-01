package _3_strings.page02._1607_avance_as_letras;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1607.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder s1=null, s2=null; 
		for (int i=0; i<Integer.parseInt(in.readLine());i++) {
		//	s1 = Character. new StringBuilder(in.readLine());
			s2 = new StringBuilder(in.readLine());
			if (s1.equals(s2)) {
				out.write(0 + "\n");
			} else {
				for (int j=0; j<s1.length(); j++) {
					for (int k=0; k<s2.length(); k++) {
						if (s1.charAt(j) == s2.charAt(k)) {
							continue;
						} else {
	//						s1.setCharAt(j, Character.toString(s1.charAt(j) + 1)); 
						}
					}
				}
			}
		}
	}

}
