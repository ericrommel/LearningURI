package adhoc.page01._1125_formula_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/**
 *
A temporada de F�rmula 1 consiste de uma s�rie de corridas, conhecidas como Grandes Pr�mios,
organizados pela Federa��o Internacional de Automobilismo (FIA). Os resultados de cada Grande Pr�mio
s�o combinados para determinar o Campeonato Mundial de Pilotos. Mais especificamente, a cada Grande
Pr�mio s�o distribu�dos pontos para os pilotos, dependendo da classifica��o na corrida. Ao final da
temporada, o piloto que tiver somado o maior n�mero de pontos � declarado Campe�o Mundial de Pilotos.

Os organizadores da F�rmula 1 mudam constantemente as regras da competi��o, com o objetivo de dar
mais emo��o �s disputas. Uma regra modificada para a temporada de 2010 foi justamente a distribui��o
de pontos em cada Grande Pr�mio. Desde 2003 a regra de pontua��o premiava os oito primeiros
colocados, obedecendo a seguinte tabela:

Place  - 1  2 3 4 5 6 7 8
Points - 10 8 6 5 4 3 2 1

Ou seja, o piloto vencedor ganhava 10 pontos, o segundo colocado ganhava 8 pontos, e assim por diante.
Na temporada de 2010, os dez primeiros colocados receber�o pontos obedecendo a seguinte tabela:

Place  - 1  2  3  4  5  6 7 8 9 10
Points - 25 18 15 12 10 8 6 4 2 1

A mudan�a no sistema de pontua��o provocou muita especula��o sobre qual teria sido o efeito nos
Campeonatos Mundiais passados se a nova pontua��o tivesse sido utilizada nas temporadas anteriores.
Por exemplo, teria Lewis Hamilton sido campe�o em 2008, j� que a diferen�a de sua pontua��o total
para Felipe Massa foi de apenas um ponto? Para acabar com as especula��es, a FIA contratou voc� para
escrever um programa que, dados os resultados de cada corrida de uma temporada determine Campe�o
Mundial de Pilotos para sistemas de pontua��es diferentes.

Entrada
 - A entrada cont�m v�rios casos de teste. A primeira linha de um caso de teste cont�m dois n�meros
   inteiros G e P separados por um espa�o em branco, indicando respectivamente o n�mero de Grandes
   Pr�mios (1 <= G <= 100) e o n�mero de pilotos (1 <= P <= 100). Os pilotos s�o identificados por
   inteiros de 1 a P. Cada uma das G linhas seguintes indica o resultado de uma corrida, e cont�m P
   inteiros separados por espa�os em branco. Em cada linha, o i-�simo n�mero indica a ordem de
   chegada do pilodo i na corrida (o primeiro n�mero indica a ordem de chegada do piloto 1 naquela
   corrida, o segundo n�mero indica a ordem de chegada do piloto 2 na corrida, e assim por diante).
   A linha seguinte cont�m um �nico n�mero inteiro S indicando o n�mero de sistemas de pontua��o
   (1 <= S <= 10), e ap�s, cada uma das S linhas seguintes cont�m a descri��o de um sistema de
   pontua��o. A descri��o de um sistema de pontua��o inicia com um inteiro K (1 <= K <= P),
   indicando a �ltima ordem de chegada que receber� pontos, seguido de um espa�o em branco, seguido
   de K inteiros k0, k1, ... , kn-1 (1 <= ki <= 100) separados por espa�os em branco, indicando os
   pontos a serem atribu�dos (o primeiro inteiro indica os pontos do primeiro colocado, o segundo
   inteiro indica os pontos do segundo colocado, e assim por diante).
   O �ltimo caso de teste � seguido por uma linha que cont�m apenas dois n�meros zero separados por
   um espa�o em branco.

Sa�da
 - Para cada caso de sistema de pontua��o da entrada seu programa deve imprimir uma linha, que deve
   conter o identificador do Campe�o Mundial de Pilotos. Se houver mais de um Campe�o Mundial
   Pilotos (ou seja, se houver empate), a linha deve conter todos os Campe�es Mundiais de Pilotos,
   em ordem crescente de identificador, separados por um espa�o em branco.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		double r=0;
		int G=0; // N�mero de Grandes Premios
		int P=0; // N�mero de Pilotos

		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1125.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));


		String str[] = null;

		while ((str=in.readLine().split(" ")) != null) {
			G = Integer.parseInt(str[0]);
			P = Integer.parseInt(str[1]);
			if (G==0 & P==0) {
				break;
			} else {
				// Mapa<ID da corrida, Posicao>
				Map<Integer, String> corridas = new HashMap();

				// Mapa<ID do Piloto, Pontuacao>
				Map<Integer, Integer> pilotos = new HashMap();
				for (int i=0; i<P; i++) {
					pilotos.put(i, 0);
				}

				Map <Integer, String> sistemas = new HashMap();

				// Cada uma das G linhas seguintes indica o resultado de uma corrida e cont�m P
				// inteiros separados por espa�os em branco.
				for (int i=0; i<G; i++) {
					corridas.put(i, in.readLine());
				}

				// Em cada linha, o i-�simo n�mero indica a ordem de chegada do pilodo i na corrida
				// (o primeiro n�mero indica a ordem de chegada do piloto 1 naquela corrida, o
				// segundo n�mero indica a ordem de chegada do piloto 2 na corrida, e assim por diante).                                


				// A linha seguinte cont�m um �nico n�mero inteiro S indicando o n�mero de sistemas
				// de pontua��o (1 <= S <= 10), e ap�s, cada uma das S linhas seguintes cont�m a
				// descri��o de um sistema de pontua��o.
				int S = Integer.parseInt(in.readLine()); //
				for (int i=1; i<S; i++) {
					// A descri��o de um sistema de pontua��o inicia com um inteiro K (1 <= K <= P),
					// indicando a �ltima ordem de chegada que receber� pontos, seguido de um
					// espa�o em branco, seguido de K inteiros k0,  k1, ... , kn-1 (1 <= ki <= 100)
					// separados por espa�os em branco, indicando os pontos a serem atribu�dos
					// (o primeiro inteiro indica os pontos do primeiro colocado, o segundo inteiro
					// indica os pontos do segundo colocado, e assim por diante).
					String[] descricao = in.readLine().split(" ");
					int K = Integer.parseInt(descricao[0]); // �ltima ordem de chegada que receber� pontos

					for (int j=1; j<K; j++) {
						System.out.println("Sistema: " + descricao[j]);
						for (Integer idCorrida : corridas.keySet()) {
							System.out.println("Corrida " + idCorrida + ": " + corridas.get(idCorrida));
							for (Integer idPiloto : pilotos.keySet()) {
								System.out.println("Piloto " + idPiloto + ": " + pilotos.get(idPiloto));   
							}
						}
					}
					//sistemas.put(j, in.readLine());

				}                                
			}

		}

	}
}