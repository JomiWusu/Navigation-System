import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

public class Graph_DQ {
    public int[] dist;
    int previous[];
    Set<Integer> visited;
    PriorityQueue<Node> pqueue;
    int V; //Number of vertices
    List<List<Node>> adj_list;
    int[] previousNodes;

    //class constructor
    public Graph_DQ(int V){
        this.V = V;
        dist = new int[V];
        previous = new int[V];
        visited = new HashSet<Integer>();
        pqueue = new PriorityQueue<Node>(V, new Node());

    }

    public void algo_dijsktra(List<List<Node>> adj_list, int src_vertex, Node src_node){
        this.adj_list = adj_list;

        for(int i = 0; i < V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
    }
}