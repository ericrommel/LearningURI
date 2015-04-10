package simulators._1774_routers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
 
public class MainLisandra {
 
        public static void main(String[] args) throws IOException {
 
                try {
                        BufferedReader in = new BufferedReader(new InputStreamReader(
                                        System.in));
                        List<Vertice> vertices = new ArrayList<Vertice>();
 
                        while (true) {
                                String linha = in.readLine();
 
                                String[] conf = linha.split(" ");
                                int nVertices = Integer.valueOf(conf[0]);
                                HashMap<Integer, List<Roteador>> grafo = new HashMap<Integer, List<Roteador>>();
 
                                int nArestas = Integer.valueOf(conf[1]);
 
                                while (nArestas > 0) {
                                        linha = in.readLine();
                                        conf = linha.split(" ");
                                        int v1 = Integer.valueOf(conf[0]);
                                        int v2 = Integer.valueOf(conf[1]);
                                        int aresta = Integer.valueOf(conf[2]);
 
                                        // v1
                                        List<Roteador> g1;
                                        if (grafo.containsKey(v1)) {
                                                g1 = grafo.get(v1);
                                        } else {
                                                g1 = new ArrayList<Roteador>();
                                                grafo.put(v1, g1);
                                        }
                                        Roteador r1 = new Roteador(v2, aresta);
                                        g1.add(r1);
 
                                        // v2
                                        List<Roteador> g2;
                                        if (grafo.containsKey(v2)) {
                                                g2 = grafo.get(v2);
                                        } else {
                                                g2 = new ArrayList<Roteador>();
                                                grafo.put(v2, g2);
                                        }
                                        Roteador r2 = new Roteador(v1, aresta);
                                        g2.add(r2);
                                        nArestas--;
                                }
 
                                for (List<Roteador> adjacentes : grafo.values()) {
 
                                        Collections.sort(adjacentes, new Comparator<Roteador>() {
                                                @Override
                                                public int compare(Roteador r1, Roteador r2) {
                                                        return r1.pesoAresta - r2.pesoAresta;
                                                }
 
                                        });
                                }
 
                                int cVertice = 1;
                                vertices.add(new Vertice(cVertice));
                                int custo = 0;
                                while (vertices.size() < nVertices) {
                                        int n = 10000;
                                        int vMenor = 0;
                                        Roteador origem = null;
                                        int vorigem = 0;
                                        for (Vertice v : vertices) {
                                                if (grafo.containsKey(v.vertice)) {
                                                        for (Roteador lv : grafo.get(v.vertice)) {
                                                                Vertice aux = new Vertice(lv.vertice);
                                                                if (!vertices.contains(aux)
                                                                                && lv.pesoAresta < n) {
                                                                        n = lv.pesoAresta;
                                                                        vMenor = lv.vertice;
                                                                        origem = lv;
                                                                        vorigem = v.vertice;
                                                                        break;
                                                                }
                                                        }
                                                }
                                        }
 
                                        if (grafo != null && grafo.get(vorigem) != null
                                                        && !grafo.isEmpty()) {
                                                grafo.get(vorigem).remove(origem);
                                                grafo.get(vMenor).remove(new Roteador(vorigem, 0));
                                                if (grafo.get(vorigem).isEmpty())
                                                        grafo.remove(vorigem);
                                        }
                                        vertices.add(new Vertice(vMenor));
                                        custo += n;
                                }
 
                                System.out.println(custo);
                        }
                } catch (Exception e) {
                        // TODO: handle exception
                }
 
        }
 
}
 
class Vertice {
        int vertice;
 
        public Vertice(int i) {
                vertice = i;
        }
 
        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + vertice;
                return result;
        }
 
        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Vertice other = (Vertice) obj;
                if (vertice != other.vertice)
                        return false;
                return true;
        }
 
}
 
class Roteador {
        public int vertice;
        public int pesoAresta;
 
        public Roteador(int vertice, int pesoAresta) {
                super();
                this.vertice = vertice;
                this.pesoAresta = pesoAresta;
        }
 
        @Override
        public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + vertice;
                return result;
        }
 
        @Override
        public boolean equals(Object obj) {
                if (this == obj)
                        return true;
                if (obj == null)
                        return false;
                if (getClass() != obj.getClass())
                        return false;
                Roteador other = (Roteador) obj;
                if (vertice != other.vertice)
                        return false;
                return true;
        }
 
}