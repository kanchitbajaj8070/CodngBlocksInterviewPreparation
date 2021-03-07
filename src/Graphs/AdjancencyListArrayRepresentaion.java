package Graphs;

import java.util.ArrayList;
import java.util.List;

public class AdjancencyListArrayRepresentaion {
    List<List<Integer>> edges;
    AdjancencyListArrayRepresentaion(int n)
    {
        edges=new ArrayList<>(n);
        for( int i=0;i<n;i++)
            edges.add(new ArrayList<>());
    }
    public void addEdge( int to , int from,boolean isDirected)
    {
        edges.get(to).add(from);
        if( !isDirected)
            edges.get(from).add(to);
    }
    public void viewGraph()
    {
        for(int i=0;i<edges.size();i++)
        {
            System.out.println("Vertex "+i+" , "+" edges : "+edges.get(i).toString());
        }
    }
    public static void main(String[] args) {
        AdjancencyListArrayRepresentaion graph= new AdjancencyListArrayRepresentaion(4);
        graph.addEdge(1,2,true);
        graph.addEdge(1,0,true);
        graph.addEdge(2,3,true);
        graph.addEdge(2,0,true);
        graph.addEdge(2,1,true);
        graph.addEdge(0,2,true);
        graph.addEdge(0,1,true);
        graph.addEdge(3,2,true);
        graph.viewGraph();

   /*     0 => {1,2}
        1 =>{2,0}
2={3,0,1}
3={2}*/
    }
}
