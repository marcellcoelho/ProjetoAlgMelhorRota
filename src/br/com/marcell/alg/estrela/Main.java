package br.com.marcell.alg.estrela;

import java.util.HashMap;
import java.util.Map;

public class Main {
	
	public static void main(String[] args) {
        Map<String, Map<String, Double>> hueristic = new HashMap<String, Map<String, Double>>();
        // map for A    
        Map<String, Double> mapA = new HashMap<String, Double>();
        mapA.put("A",  0.0);
        mapA.put("B", 10.0);
        mapA.put("C", 20.0);
        mapA.put("E", 100.0);
        mapA.put("F", 110.0);


        // map for B
        Map<String, Double> mapB = new HashMap<String, Double>();
        mapB.put("A", 10.0);
        mapB.put("B",  0.0);
        mapB.put("C", 10.0);
        mapB.put("E", 25.0);
        mapB.put("F", 40.0);


        // map for C
        Map<String, Double> mapC = new HashMap<String, Double>();
        mapC.put("A", 20.0);
        mapC.put("B", 10.0);
        mapC.put("C",  0.0);
        mapC.put("E", 10.0);
        mapC.put("F", 30.0);


        // map for X
        Map<String, Double> mapE = new HashMap<String, Double>();
        mapE.put("A", 100.0);
        mapE.put("B", 25.0);
        mapE.put("C", 10.0);
        mapE.put("E",  0.0);
        mapE.put("F", 10.0);

        // map for X
        Map<String, Double> mapF = new HashMap<String, Double>();
        mapF.put("A", 110.0);
        mapF.put("B",  40.0);
        mapF.put("C",  30.0);
        mapF.put("E", 10.0);
        mapF.put("F",  0.0);

        hueristic.put("A", mapA);
        hueristic.put("B", mapB);
        hueristic.put("C", mapC);
        hueristic.put("E", mapE);
        hueristic.put("F", mapF);

        GraphAStar<String> graph = new GraphAStar<>(hueristic);
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("E");
        graph.addNode("F");

        graph.addEdge("A", "B",  10);
        graph.addEdge("A", "E", 100);
        graph.addEdge("B", "C", 10);
        graph.addEdge("C", "E", 10);
        graph.addEdge("C", "F", 30);
        graph.addEdge("E", "F", 10);

        AStar<String> aStar = new AStar<String>(graph);

        for (String path : aStar.astar("C", "F")) {
            System.out.println(path);
        }
    }

}
