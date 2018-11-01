package simulators._1301_interval_product;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1301.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		double prod = 1;
		String prodstr="";
		int K=0;
		String s = "";
		String[] str = null;
		String[] op = null;
		while ((s=in.readLine()) != null) {
			str = s.split(" ");
			K = Integer.parseInt(str[1]);
			s = in.readLine();
			str = s.split(" ");
			for (int i=0; i<K; i++) {
				op = in.readLine().split(" ");
				if (op[0].equals("C")) {
					str[Integer.parseInt(op[1])-1] = op[2];
				} else {
					for (int j=Integer.parseInt(op[1]); j<=Integer.parseInt(op[2]); j++) {
						//prod *= Double.parseDouble(str[j-1]);
					}
					if (s.contains(" 0 ")) {
						out.print("0");
					} else if (s.split("-").length%2 == 0) {
						out.print("+");
					} else {
						out.print("-");
					}
					if (prod == 0) {
						out.print("0");
					} else if (prod > 0) {
						out.print("+");
					} else {
						out.print("-");
					}
					prod=1;
				}
			}
			out.println();
		}
		in.close();
		out.flush();
	}
}
