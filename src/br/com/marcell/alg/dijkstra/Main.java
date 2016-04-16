package br.com.marcell.alg.dijkstra;

import java.math.BigDecimal;

import br.com.marcell.alg.dijkstra.Graph.Vertex;

public class Main {
   private static final Graph.Edge[] GRAPH = {
      new Graph.Edge("a", "b", new BigDecimal(7)),
      new Graph.Edge("a", "c", new BigDecimal(9)),
      new Graph.Edge("a", "f", new BigDecimal(14)),
      new Graph.Edge("b", "c", new BigDecimal(10)),
      new Graph.Edge("b", "d", new BigDecimal(15)),
      new Graph.Edge("c", "d", new BigDecimal(11)),
      new Graph.Edge("c", "f", new BigDecimal(2)),
      new Graph.Edge("d", "e", new BigDecimal(6)),
      new Graph.Edge("e", "f", new BigDecimal(9)),
   };
   private static final String START = "a";
   private static final String END = "e";
 
   public static void main(String[] args) {
      Graph g = new Graph(GRAPH);
      g.dijkstra(START);
      g.printPath(END);
//      g.printAllPaths();
      for (Vertex vertex : g.getGraph()) {
		System.out.println(vertex.name);
	}
   }
}