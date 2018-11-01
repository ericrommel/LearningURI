package simulators._1163_angry_ducks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * Em uma terra distante existem duas cidades, a Nlogônia onde vivem os Nlogoneses, e Ducklogônia
 * onde vivem seus vizinhos os Duckneses, já à algum tempo estas duas cidades estão em guerra e
 * agora em uma tentativa de ganhar a guerra os Duckneses pretendem atacar a cidade da Nlogônia
 * com um bodoque que atira patos, porem para que não haja erro eles pediram que você construa um
 * programa que dados os valores da altura do bodoque (h), os pontos onde inicia (p1) e onde termina
 * (p2) a cidade da Nlogônia, o ângulo do disparo (ALFA) e a velocidade do lançamento, calcule se o
 * projetil atingira o alvo.
 * Para os cálculos assuma que a aceleração da gravidade é g = 9.80665 e que PI = 3.14159.
 * 
 * Entrada
 * - Existem vários casos de teste, cada caso inicia com 1 valor de ponto flutuante h
 *   (1 <= h <= 150) indicando a altura do bodoque, a próxima linha contem 2 valores inteiros p1 e
 *   p2 (1 <= p1, p2 <= 9999) indicando onde inicia e onde termina a Nlogônia, a linha seguinte
 *   contem um inteiro n (1 <= n <= 100) indicando o numero de tentativas que serão feitas para
 *   acertar a Nlogônia, as n linhas seguintes contem dois valores de ponto flutuante com os valores
 *   do ângulo ALFA (1 <= ALFA <= 180) e a velocidade V (1 <= V <= 150) do disparo.
 *   O final do arquivo de entrada é determinado por EOF.
 *   
 * Saída
 * - Para cada disparo, seu programa deve imprimir uma única linha no seguinte formato, "X -> DUCK"
 *   para quando o pato acertar a Nlogônia ou "X -> NUCK" quando o pato não acertar a Nlogônia, onde
 *   X eh a distancia máxima que o projetil atingiu até chegar ao chão (Y=0). X de ser impresso com
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
				
				// Alcance máximo: X = [(V0^2)*SEN 2*ALFA]/G
				x = Math.pow(v, 2) * (Math.sin(2*alfa))/g;
				System.out.println(x + " -> " + "DUCK");
			}
			
		}
	}

}
