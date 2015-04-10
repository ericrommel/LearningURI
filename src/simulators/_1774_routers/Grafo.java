package simulators._1774_routers;

public class Grafo {

	public final int numVertices;
	public final int maiorValor = 10000; // Preferencia por valores infinitos, mas o programa menciona esse como maior
	private Integer[][] matrizDePesos;

	public Grafo (int numVertices) throws Exception {
		if (numVertices <= 0) {
			throw new Exception("Numero de vertices deve ser maior que 0!");
		}
		
		this.numVertices = numVertices;
		
		try {
			setMatrizPesos(createMatriz(numVertices, 0));			
		} catch (Exception e) {
			if(e.getMessage() == null) {
				System.out.println("Ocorreu um erro de " + e + " no construtor"); 
			}
           else {
        	   System.out.println(e.getMessage()); 
           }
		}
	}
	
	/****** Getters and Setters ***********************************************/
	public int getNumVertices() {
		return numVertices;
	}

	public Integer[][] getMatrizPesos() {
		return this.matrizDePesos;
	}

	public void setMatrizPesos(Integer[][] pesos) {
		this.matrizDePesos = pesos;
	}

	/**************************************************************************/
	/* Criar a matriz com a quantidade de vertices */
	public Integer[][] createMatriz(int tam, int valueInitial) throws Exception {
		if (tam <= 1) {
			throw new Exception("Tamanho deve ser maior que 1!");
		}
		
		Integer[][] matriz = new Integer[tam+1][];
		
		for (int i=0; i<tam; i++ ) {
			matriz[i] = new Integer[tam+1];
			for (int j=0; j<tam; j++) {
				matriz[i][j] = valueInitial;
			}
		}
		
		return matriz;
	}
	
	public void printMatriz(Integer[][] matriz) throws Exception {
		if (matriz == null) {
			throw new Exception("Matriz NULA!");
		}
		
		if (matriz[0] == null) {
			throw new Exception("A matriz nao foi inicializada!");
		}
		
		int tam = getNumVertices();
		
		for (int i=0; i<tam; i++) {
			for (int j=0; j<tam; j++) {
				System.out.printf("[" + matriz[i][j] + "]");
			}
			System.out.println();
		}
	}
	
	public void insertArestas(int A, int B, int peso) throws Exception {
		try {
			if (A < 0 || B < 0 || A > getNumVertices() || B > getNumVertices()) {
				throw new Exception("Vertice invalido!");
			}
			
			if (peso == 0) {
				throw new Exception("Peso negativo!");
			}
			
			System.out.println("matrizDePesos[" + A + "][" + B + "] = " + peso);
			matrizDePesos[A][B] = peso;
			
		} catch (Exception e) {
			if (e.getMessage() == null) {
				System.out.println("Ocorreu um erro de " + e + " insertArestas!");
			} else {
				System.out.println("Erro na insercao de aresta!");
			}
		}
	}

	 public static void main (String args[]) {
		 try {
			 Grafo g = new Grafo(5);
			 g.printMatriz(g.getMatrizPesos());
		 } catch(Exception e){
	            if (e.getMessage() == null) {
	            	System.out.println("Ocorreu um erro de " + e + " no main"); 
	            } else {
	            	System.out.println(e.getMessage()); 
	            }

		 }
	 } 
}

