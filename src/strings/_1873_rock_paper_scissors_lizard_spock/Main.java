package _3_strings._1873_rock_paper_scissors_lizard_spock;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1873.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int qtd = Integer.parseInt(in.readLine());

		for (int i=0; i<qtd;i++) {
			String[] sb = in.readLine().split(" ");
			if (sb[0].equals(sb[1])) {
				out.write("empate\n");
			} else {
				if (sb[0].equals("tesoura") && (sb[1].equals("papel")||sb[1].equals("lagarto"))) {
					out.write("rajesh\n");
					break;
				} else {
					out.write("sheldon\n");
				}
				if (sb[0].equals("papel") && (sb[1].equals("pedra")||sb[1].equals("spock"))) {
					out.write("rajesh\n");
				} else {
					out.write("sheldon\n");
				}
				if (sb[0].equals("pedra") && (sb[1].equals("tesoura")||sb[1].equals("lagarto"))) {
					out.write("rajesh\n");
				} else {
					out.write("sheldon\n");
				}
				if (sb[0].equals("lagarto") && (sb[1].equals("spock")||sb[1].equals("papel"))) {
					out.write("rajesh\n");
				} else {
					out.write("sheldon\n");
				}
				if (sb[0].equals("spock") && (sb[1].equals("tesoura")||sb[1].equals("pedra"))) {
					out.write("rajesh\n");
				} else {
					out.write("sheldon\n");
				}
			}
		}
		in.close();
		out.close();
	}

}
