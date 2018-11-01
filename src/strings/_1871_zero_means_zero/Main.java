package _3_strings._1871_zero_means_zero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1871.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] sb = null;
		String s = null;
		int a=0,b=0,total=0;
		
		while ((sb=in.readLine().split(" ")) != null) {
			a = Integer.parseInt(sb[0]);
			b = Integer.parseInt(sb[1]);
			if (a!=0 && b!=0) {
				total=a+b;
				s = String.valueOf(total).replace("0", "");
			} else {
				break;
			}
			out.write(s+"\n");
		}
		in.close();
		out.close();
	}
}
