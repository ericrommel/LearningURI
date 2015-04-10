package simulators._1274_p_networks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		int num=0, t=1, qtd=0;
		
		String s="";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while ((s=in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				num = Integer.parseInt(st.nextToken());
				if (t==1) {
					qtd = num;
					t++;
				} else if (num==0) {
					t=0;
					break;
				} else {
					System.out.println(num);
				}
			}
			if (t==0) {
				break;
			} else {
				t=1;
			}
		}
	}

}
