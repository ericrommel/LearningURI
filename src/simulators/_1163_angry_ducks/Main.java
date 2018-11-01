package simulators._1163_angry_ducks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * Em uma terra distante existem duas cidades, a Nlog�nia onde vivem os Nlogoneses, e Ducklog�nia
 * onde vivem seus vizinhos os Duckneses, j� � algum tempo estas duas cidades est�o em guerra e
 * agora em uma tentativa de ganhar a guerra os Duckneses pretendem atacar a cidade da Nlog�nia
 * com um bodoque que atira patos, porem para que n�o haja erro eles pediram que voc� construa um
 * programa que dados os valores da altura do bodoque (h), os pontos onde inicia (p1) e onde termina
 * (p2) a cidade da Nlog�nia, o �ngulo do disparo (ALFA) e a velocidade do lan�amento, calcule se o
 * projetil atingira o alvo.
 * Para os c�lculos assuma que a acelera��o da gravidade � g = 9.80665 e que PI = 3.14159.
 * 
 * Entrada
 * - Existem v�rios casos de teste, cada caso inicia com 1 valor de ponto flutuante h
 *   (1 <= h <= 150) indicando a altura do bodoque, a pr�xima linha contem 2 valores inteiros p1 e
 *   p2 (1 <= p1, p2 <= 9999) indicando onde inicia e onde termina a Nlog�nia, a linha seguinte
 *   contem um inteiro n (1 <= n <= 100) indicando o numero de tentativas que ser�o feitas para
 *   acertar a Nlog�nia, as n linhas seguintes contem dois valores de ponto flutuante com os valores
 *   do �ngulo ALFA (1 <= ALFA <= 180) e a velocidade V (1 <= V <= 150) do disparo.
 *   O final do arquivo de entrada � determinado por EOF.
 *   
 * Sa�da
 * - Para cada disparo, seu programa deve imprimir uma �nica linha no seguinte formato, "X -> DUCK"
 *   para quando o pato acertar a Nlog�nia ou "X -> NUCK" quando o pato n�o acertar a Nlog�nia, onde
 *   X eh a distancia m�xima que o projetil atingiu at� chegar ao ch�o (Y=0). X de ser impresso com
 *   5 casas decimais.
 *   
 * @author e.dantas
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1163.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double g = 9.80665, pi = 3.14159, h=0, alfa=0, v=0, x=0;
		int p1=0, p2=0, n=0;
		
		String s = "";
		String[] str = null;
		while ((s=in.readLine()) != null) {
			h = Double.parseDouble(s);
			str = in.readLine().split(" ");
			p1 = Integer.parseInt(str[0]);
			p2 = Integer.parseInt(str[1]);
			n = Integer.parseInt(in.readLine());
			for (int i=0; i<n; i++) {
				str = in.readLine().split(" ");
				alfa = Double.parseDouble(str[0]);
				v = Double.parseDouble(str[1]);
				
				// Alcance m�ximo: X = [(V0^2)*SEN 2*ALFA]/G
				x = Math.pow(v, 2) * (Math.sin(2*alfa))/g;
				System.out.println(x + " -> " + "DUCK");
			}
			
		}
	}

}
