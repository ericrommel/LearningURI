package _8_computational_geometry.page01._1039_fire_flowers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Nos dias atuais uma flor de fogo n�o � algo considerado estranho para muitos jovens.  Isso porque
 * um famoso jogo de videogame popularizou esse tipo de flor. Nesse jogo o protagonista ganhava
 * superpoderes ao tocar em uma flor de fogo, passando a atirar pequenas bolas de fogo para derrotar
 * seus inimigos.
 * 
 * No entanto, j� se falava sobre flores de fogo h� muito tempo atr�s. Na mitologia polonesa, flores
 * de fogo s�o flores m�sticas de grande poder guardadas por esp�ritos malignos. Ela possu�a esse
 * nome porque brilhava tanto que era imposs�vel olh�-la diretamente. Quem possu�sse uma flor dessas
 * ganharia a habilidade de ler a mente de outras pessoas, encontrar tesouros escondidos e repelir
 * todos os males.
 * 
 * Para obter uma flor de fogo, a pessoa deveria procur�-la em uma floresta antes da meia-noite na
 * v�spera do Noc Kupaly. Exatamente � meia-noite ela floresceria. Para colh�-la seria preciso
 * desenhar um c�rculo em volta dela. Parece uma tarefa f�cil, no entanto, os esp�ritos malignos que
 * guardam a flor tentariam de tudo para distrair qualquer um tentando colher a flor. Se a pessoa
 * falhasse ao tentar desenhar um c�rculo em volta da flor, teria sua vida sacrificada.
 * 
 * Dados dois c�rculo, um desenhado por um ambicioso ca�ador de flores de fogo e outro representando
 * a �rea da flor, sua tarefa � determinar se o ca�ador morre ou fica rico com sua conquista.
 * 
 * Entrada
 * - A entrada � composta por diversas inst�ncias e termina com final de arquivo (EOF). Cada
 *   inst�ncia consiste em uma linha com seis inteiros, R1 (1 <= R1) , X1(|X1|), Y1(|Y1|),
 *   R2 (R2 <= 1000), X2(|X2|), Y2 (Y2 <= 1000). O c�rculo desenhado pelo ca�ador possui raio R1 e
 *   centro (X1; Y1). O c�rculo representando a �rea da flor possui raio R2 e centro (X2; Y2).
 * 
 * Sa�da
 * - Para cada inst�ncia imprima uma �nica linha contendo MORTO, se o ca�ador morre, ou RICO se o
 *   ca�ador consegue colher a flor.
 *   
 * @author Eric
 *
 */
public class Main {

	/**
	 * Para resolver esta quest�o, calcula-se a dist�ncia entre os dois pontos (do ca�ador e da
	 * flor), depois verifica as posi��es relativas entre as circufer�ncias e a dist�ncias entre
	 * seus pontos. Pelo enunciado, a circunfer�ncia da flor precisa estar totalmente dentro da
	 * circunfer�ncia do ca�ador. Ver a figura para visualiza��o do problema.  
	 * Em matem�tica, dist�ncia euclidiana (ou dist�ncia m�trica) � a dist�ncia entre dois pontos
	 * que pode ser provada pela aplica��o repetida do teorema de Pit�goras. Aplicando essa f�rmula
	 * como dist�ncia, o espa�o euclidiano torna-se um espa�o m�trico. A f�rmula da dist�ncia
	 * Euclidiana �:
	 *                    Distancia =  SQRT((Px - Qx)^2 + (Py - Qy)^2) 
	 */
	public static void main(String[] args) throws IOException {
		int r1=0, X=0, Y=0, x1=0, y1=0, r2=0, x2=0, y2=0, dist=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String str = "";
		while ((str=in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(str);
			while (st.hasMoreTokens()) {
				r1 = Integer.parseInt(st.nextToken()); // Raio do cacador
				x1 = Integer.parseInt(st.nextToken()); // Centro do circulo do cacador
				y1 = Integer.parseInt(st.nextToken()); // Centro do circulo do cacador
				r2 = Integer.parseInt(st.nextToken()); // Raio da flor
				x2 = Integer.parseInt(st.nextToken()); // Centro do circulo da flor
				y2 = Integer.parseInt(st.nextToken()); // Centro do circulo da flor
				X = (int) Math.pow((x1 - x2),2);
				Y = (int) Math.pow((y1 - y2),2);
				dist =  (int) Math.sqrt(X + Y);
				
				// Posicoes relativas das circunferencias
				// Externas: D > r1 + r2
				// Internas: D < r1 � r2
				// Tangentes internas: D = r1 � r2
				// Tangentes externas: D = r1 + r2
				// Secantes: r1 � r2 < D < r1 + r2
				// Conc�ntricas: D = 0
				
				if ((dist == 0 && (r1 > r2)) || ((dist != 0) && (Y==0 && r1 > r2)) || dist < (r1 - r2)) {
					out.println("RICO");
				} else {
					out.println("MORTO");					
				}
			}
		}
		out.flush();
		in.close();
	}
}
