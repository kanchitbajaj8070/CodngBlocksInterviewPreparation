package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class WeightedGraphHashMap {
   /*
    A=> (B,20),(D,50),(C,10)
    B=>(D,30),(A,20)
    C=>(A,10),(D,40)
    */
   public class Pair
   {
       Integer weight;
       String vertex;
       Pair( String v, Integer w)
       {
           vertex=v;
           weight=w;
       }
       @Override
       public String toString()
       {
           return "( "+ vertex +" , "+ weight+" )";
       }
   }
   HashMap<String, List<Pair>> graph= new HashMap<>();
    public void addEdge( String to, String from , int weight)
    {
        if( !graph.containsKey(to))
        graph.put(to,new ArrayList<>());
        if( !graph.containsKey(from))
            graph.put(from,new ArrayList<>());
        graph.get(to).add(new Pair( from, weight));
    }
    public void viewGraph()
    {
        System.out.println(graph);
    }

    public static void main(String[] args) {
        WeightedGraphHashMap graph= new WeightedGraphHashMap();
        graph.addEdge("A","B",20);
        graph.addEdge("A","D",50);
        graph.addEdge("A","C",10);
        graph.addEdge("B","D",30);
        graph.addEdge("B","A",20);
        graph.addEdge("C","D",40);
        graph.addEdge("C","A",10);
        graph.viewGraph();
    }


}
