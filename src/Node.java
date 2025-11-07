import java.util.Comparator;

public class Node implements Comparator<Node>{
    public int node;
    public int cost;
    public int listIndex = -1;
    public int nodeIndex = -1;
    public String name;

    //Empty Constructor
    public Node(){
    }

    //Constructor
    public Node(int node, int cost, String name){
        this.node = node;
        this.cost = cost;
        this.name = name;
    }

    //Getter Methods
    public int getNode(){
        return node;
    }

    public String getName(){
        return name;
    }

    //Overriding abstract method
    @Override
    public int compare(Node o1, Node o2) {
        //Node 1 comes before node 2
        if (o1.cost < o2.cost)
            return -1;
            //Node 1 comes after node 2
        else if (o1.cost > o2.cost)
            return 1;
        //Equal
        return 0;
    }

    @Override
    public boolean equals (Object p){
        //Return false if p is not an instance of node
        if(!(p instanceof  Node)) return false;
        //Uses type casing on p then checks if node equals each other
        return (this.node == ((Node) p).node);
    }

    //Changing node index in list
    public void setNodeIndex(int nodeIndex) {
        this.nodeIndex = nodeIndex;
    }

    public void setListIndex(int listIndex) {
        this.listIndex = listIndex;
    }

    //Getter Methods
    public int getNodeIndex(){
        return nodeIndex;
    }

    public int getListIndex(){
        return listIndex;
    }
}
