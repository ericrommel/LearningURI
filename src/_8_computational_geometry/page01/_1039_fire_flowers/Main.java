package _8_computational_geometry.page01._1039_fire_flowers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Nos dias atuais uma flor de fogo não é algo considerado estranho para muitos jovens.  Isso porque
 * um famoso jogo de videogame popularizou esse tipo de flor. Nesse jogo o protagonista ganhava
 * superpoderes ao tocar em uma flor de fogo, passando a atirar pequenas bolas de fogo para derrotar
 * seus inimigos.
 * 
 * No entanto, já se falava sobre flores de fogo há muito tempo atrás. Na mitologia polonesa, flores
 * de fogo são flores místicas de grande poder guardadas por espíritos malignos. Ela possuía esse
 * nome porque brilhava tanto que era impossível olhá-la diretamente. Quem possuísse uma flor dessas
 * ganharia a habilidade de ler a mente de outras pessoas, encontrar tesouros escondidos e repelir
 * todos os males.
 * 
 * Para obter uma flor de fogo, a pessoa deveria procurá-la em uma floresta antes da meia-noite na
 * véspera do Noc Kupaly. Exatamente à meia-noite ela floresceria. Para colhê-la seria preciso
 * desenhar um círculo em volta dela. Parece uma tarefa fácil, no entanto, os espíritos malignos que
 * guardam a flor tentariam de tudo para distrair qualquer um tentando colher a flor. Se a pessoa
 * falhasse ao tentar desenhar um círculo em volta da flor, teria sua vida sacrificada.
 * 
 * Dados dois círculo, um desenhado por um ambicioso caçador de flores de fogo e outro representando
 * a área da flor, sua tarefa é determinar se o caçador morre ou fica rico com sua conquista.
 * 
 * Entrada
 * - A entrada é composta por diversas instâncias e termina com final de arquivo (EOF). Cada
 *   instância consiste em uma linha com seis inteiros, R1 (1 <= R1) , X1(|X1|), Y1(|Y1|),
 *   R2 (R2 <= 1000), X2(|X2|), Y2 (Y2 <= 1000). O círculo desenhado pelo caçador possui raio R1 e
 *   centro (X1; Y1). O círculo representando a área da flor possui raio R2 e centro (X2; Y2).
 * 
 * Saída
 * - Para cada instância imprima uma única linha contendo MORTO, se o caçador morre, ou RICO se o
 *   caçador consegue colher a flor.
 *   
 * @author Eric
 *
 */
public class Main {

	/**
	 * Para resolver esta questão, calcula-se a distância entre os dois pontos (do caçador e da
	 * flor), depois verifica as posições relativas entre as circuferências e a distâncias entre
	 * seus pontos. Pelo enunciado, a circunferência da flor precisa estar totalmente dentro da
	 * circunferência do caçador. Ver a figura para visualização do problema.  
	 * Em matemática, distância euclidiana (ou distância métrica) é a distância entre dois pontos
	 * que pode ser provada pela aplicação repetida do teorema de Pitágoras. Aplicando essa fórmula
	 * como distância, o espaço euclidiano torna-se um espaço métrico. A fórmula da distância
	 * Euclidiana é:
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
				r1 = Integer.parseInt(st.nextToken()); // Raio do caçador
				x1 = Integer.parseInt(st.nextToken()); // Centro do círculo do caçador
				y1 = Integer.parseInt(st.nextToken()); // Centro do círculo do caçador
				r2 = Integer.parseInt(st.nextToken()); // Raio da flor
				x2 = Integer.parseInt(st.nextToken()); // Centro do círculo da flor
				y2 = Integer.parseInt(st.nextToken()); // Centro do círculo da flor
				X = (int) Math.pow((x1 - x2),2);
				Y = (int) Math.pow((y1 - y2),2);
				dist =  (int) Math.sqrt(X + Y);
				
				// Posicoes relativas das circunferencias
				// Externas: D > r1 + r2
				// Internas: D < r1 – r2
				// Tangentes internas: D = r1 – r2
				// Tangentes externas: D = r1 + r2
				// Secantes: r1 – r2 < D < r1 + r2
				// Concêntricas: D = 0
				
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
