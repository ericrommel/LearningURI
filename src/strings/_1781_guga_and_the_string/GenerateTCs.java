package strings._1781_guga_and_the_string;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class GenerateTCs {

	static Random generate = new Random();

	public static void main(String[] args) {
		int T=1, Q=1, OP=0, DES=0;
		String S="";
		File arq = new File("TC_1781.txt");
		try (PrintWriter pw = new PrintWriter(arq)) {

			T = generate.nextInt(10)+1;
			pw.println(T);
			while (T-- != 0) {
				S = geraString(generate.nextInt((int)Math.pow(10, 1))+1);
				pw.println(S);
				Q = generate.nextInt((int)Math.pow(10, 1))+1;
				pw.println(Q);
				DES = Q;
				while (Q-- != 0) {
					OP = generate.nextInt(3);
					if (OP == 2) {
						pw.println(OP);	
					} else {
						pw.println(OP + " " + generate.nextInt(DES));
					}
				}
			}			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static String geraString(int tam) {
		// Determia as letras que poder�o estar presente nas chaves  
		String alphabet = "abcdefghijklmnopqrstuvywxz";  

		String str = "";  
		int index = 0;  
		for(int i=0; i<tam; i++) {  
		   index = generate.nextInt(alphabet.length());  
		   str += alphabet.substring(index, index+1);  
		}  
		return str; 
	}
}