package simulators._1774_routers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Bruno is responsible for configuring the routers of a company. Routers transmit data to each other
 * through the Internet cables, the transmitted data can travel by one or more routes for reach the
 * receiver.
 * 
 * The price of network cables used in the company's routers can be very expensive, and the company
 * needs to save money. Thinking about that, the company decided to make some changes in the network
 * infrastructure.
 * 
 * Bruno must modify the network infrastructure and make sure that all routers are able to transmit
 * data to each other and there is only one route between each pair of routers, saving as much as
 * possible of Internet cables.
 * 
 * You have to find out the total cost with cables that the company will have after the changes made
 * by Bruno. The figure below shows (a) the current infrastructure networks; and (b) the infrastructure
 * networks after the change.
 * 
 * Input
 * - The first line contains two integers R (3 <= R <= 60) and C (R <= C <= 200) representing respectively
 *   the number of routers and the number of Internet cables.
 *   Followed by C lines, each one containing three integers V (1 <= V <= R), W (1 <= W <= R) and P (1 <= P <= 10000).
 *   V and W representing a pair of routers that are connected to each other through the internet cable and
 *   P representing the price of the cable.
 *   
 * Output
 * - Your program should print one integer value representing the total cost that the company will spend with
 *   cables after the modifications.
 *   
 * @author e.dantas
 * Solução: Trata-se de um problema relacionado a busca pelo melhor/menor caminho dentro de grafos. O
 *          algoritmo de Dijkstra é bastante conhecido e utilizado nesse tipo de problema.
 *          Tentativa 01: Uso do algoritmo de Dijkstra.
 *          
 * Referências: - http://pt.wikipedia.org/wiki/Algoritmo_de_Dijkstra
 *              - http://www.inf.ufsc.br/grafos/temas/custo-minimo/dijkstra.html
 *              - https://sites.google.com/site/diegopedro/grafos
 * 
 */
public class Dijkstra extends Grafo { // nome da classe Grafo substituida por Main
	
	private boolean verticesVisitados[];
	private int distancias[];
	private int pai[];
	private List<Integer> filaPrioridade = new ArrayList<Integer>();
	private int origem;
	
	/* Construtor do Grafo */
	public Dijkstra(int numVertices) throws Exception {
		super(numVertices);
	
		verticesVisitados = new boolean[numVertices];
		distancias = new int[numVertices];
		pai = new int[numVertices]; // Antecessor do vertice
	}

	/****** Getters and Setters ***********************************************/
	public boolean[] getVerticesVisitados() {
		return verticesVisitados;
	}

	public void setVerticesVisitados(boolean[] verticesVisitados) {
		this.verticesVisitados = verticesVisitados;
	}

	public int[] getDistancias() {
		return distancias;
	}

	public void setDistancias(int[] distancias) {
		this.distancias = distancias;
	}

	public int[] getPai() {
		return pai;
	}

	public void setPai(int[] pai) {
		this.pai = pai;
	}

	public List<Integer> getFilaPrioridade() {
		return filaPrioridade;
	}

	public void setFilaPrioridade(List<Integer> filaPrioridade) {
		this.filaPrioridade = filaPrioridade;
	}
	
	public int getOrigem() {
		return origem;
	}

	public void setOrigem(int origem) {
		this.origem = origem;
	}
	/**************************************************************************/


	public void printDistancias() {
		for (int i=1; i<=getNumVertices(); i++) {
			System.out.print("[" + distancias[i] + "]");
		}
		System.out.println();
	}
	
	private int defOrigemDestino(int origem, int destino) throws Exception {
		if (origem < 0 || origem > getNumVertices()) {
			throw new Exception("Origem menor que 0 ou destino inexistente!");
		}
		
		try {
			System.out.println("Origem = " + origem);
			iniciaMenorCaminho(origem);
		} catch (Exception e) {
			System.out.println("Erro ao iniciar os dados " + e);
		}
		
		System.out.println(" filaPrioridade.isEmpty() = " + filaPrioridade.isEmpty() );
		while (!filaPrioridade.isEmpty()) {
			
			int verticeMenorPeso = extraiMenor();
			System.out.println("Vertice Menor Peso = " + verticeMenorPeso);
			
			for (int i=1; i<=getNumVertices(); i++) {
				System.out.println("getMatrizPesos[" + verticeMenorPeso + "][" + (i-1) + "]= " + getMatrizPesos()[verticeMenorPeso-1][i-1]);
				if (getMatrizPesos()[verticeMenorPeso-1][i-1] > 0) {
					relax(verticeMenorPeso, i);
				}
			}
		}

		printDistancias();
		return distancias[destino];
	}	

	private void iniciaMenorCaminho(int origem) {
		
		for (int i=1; i <= getNumVertices(); i++) {
			System.out.println("distancias[" + i + "] = " + maiorValor);
			distancias[i-1] = maiorValor;
			System.out.println("verticesVisitados[" + i + "] = " + verticesVisitados[i-1]);
			verticesVisitados[i-1] = false;
			System.out.println("pai[" + i + "] = " + maiorValor);
			pai[i-1] = maiorValor;
			filaPrioridade.add(new Integer(i)); // Adiciona aresta na fila
			System.out.println("Aresta " + filaPrioridade.get(i-1) + " adicionada na fila");
		}
		distancias[origem] = 0; // Inicia vetor de distancias
	}
	
	private int extraiMenor() {
		int menorValor = maiorValor;
		int verticeMenorPeso = 1;
		
		Iterator<Integer> it = filaPrioridade.iterator();
		while (it.hasNext()) {
			int verticeAtual = it.next();
			System.out.println("Vertice atual = " + verticeAtual + "; Menor Valor = " + menorValor);
			System.out.println("distancias[" + verticeAtual + "] = " + distancias[verticeAtual-1]);
			if (distancias[verticeAtual-1] < menorValor) {
				menorValor = distancias[verticeAtual-1];
				verticeMenorPeso = verticeAtual;
			}
		}
		
		System.out.println("Remove o vertice " + verticeMenorPeso + " da fila de peso " + menorValor);
		
		// Remove o vertice com menor distancia do grafo
		filaPrioridade.remove(new Integer(verticeMenorPeso));
		
		System.out.println("-------------------------------------------------------");
		return verticeMenorPeso;
	}
	
	// Relaxa arestas no grafo (algoritmo Dijkistra)
	private void relax(int u, int v) {
		u--;
		v--;
		if ( distancias[v] > distancias[u] + getMatrizPesos()[u][v] ) {
			distancias[v] = distancias[u] + getMatrizPesos()[u][v];
			pai[v] = u;
		}
	}
	
	public static void main(String[] args) {
		//int line=0, R=0, C=0;		String s;

		try {
			Dijkstra d = new Dijkstra(7);
			d.insertArestas(1, 3, 6);
			d.insertArestas(1, 4, 9);
			d.insertArestas(2, 3, 17);
			d.insertArestas(2, 5, 32);
			d.insertArestas(2, 7, 27);
			d.insertArestas(3, 4, 11);
			d.insertArestas(3, 5, 4);
			d.insertArestas(4, 5, 3);
			d.insertArestas(4, 6, 19);
			d.insertArestas(5, 6, 13);
			d.insertArestas(5, 7, 15);
			d.insertArestas(6, 7, 5);
			
			System.out.println("Menor caminho entre 1 e 7 " + d.defOrigemDestino(1, 7));
			
			//d.printMatriz(d.getMatrizPesos());
			
		} catch (Exception e) {
			if (e.getMessage() == null) {
				System.out.println("Ocorreu um erro de " + e + " no main!");
			} else {
				System.out.println(e.getMessage() + "XXX");
				e.printStackTrace();
			}
		}
		
//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		while ((s=in.readLine()) != null) {
//			StringTokenizer st = new StringTokenizer(s);
//			while(st.hasMoreTokens()) {
//				if (line == 0) {
//					R = Integer.parseInt(st.nextToken());
//					C = Integer.parseInt(st.nextToken());
//					line++;
//				}
//				
//				
//				System.out.println(st.nextToken());
//			}
//		}

	}
}
