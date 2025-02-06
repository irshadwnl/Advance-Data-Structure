
package Graph;
import java.util.*;
public class adjaList {
    static class Edge {
        int src;
        int dest;
        public Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
        
    }
    public static void createGraph(List<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }
    public static void main(String[] args) {
        int v=5;
        List<Edge> graph[]=new List[v];
        createGraph(graph);
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.print(e.dest +" ");
        }
    }
}
