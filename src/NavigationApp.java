import java.util.ArrayList;
import java.util.List;

public class NavigationApp {
    public static void main() {
        List<List<Node>> adj_list = new ArrayList<>();//List that holds a list of nodes containing rooms next to the node

        int source = 0; // Starting Room
        int hallNameIndex = 0; //Hall
        boolean destinationReached = false;
        boolean newHall = true;
        int V = 11; //Vertices
        Node src_node;
        Node destination_node;

        //Initialize list for every node in the graph
        for (int i = 0; i < V; i++){
            //Creating  list of nodes
            List<Node> tem = new ArrayList<Node>();
            adj_list.add(tem);
        }

        String[] roomNames = {
                "Main", "RestRoom", "Room-223", "Room-225", "Room-227", "Hall-200", "Room-224", "Room-226",
                "Room-228", "Room-1101", "Hall-1100"
        };

        //Input Graph Edges
        adj_list.getFirst().add(new Node(1, 16, "RestRoom")); //Main To Restroom
        adj_list.getFirst().add((new Node(2, 20, "Hall-200"))); //Main To Hall-200
        adj_list.get(1).add(new Node(0,16, "Main")); //Restroom to Main
        adj_list.get(2).add(new Node(0, 20, "Main")); //Hall-200 to Main

        //Hall 200 Adjacent Rooms/Halls
        adj_list.get(2).add(new Node(3,3, "Room-223")); //Hall-200 to Room-223
        adj_list.get(2).add(new Node(4,3, "Room-224")); //Hall-200 to Room-224
        adj_list.get(2).add(new Node(5,5, "Room-225")); //Hall-200 to Room-225
        adj_list.get(2).add(new Node(6,6, "Room-226")); //Hall-200 to Room-226
        adj_list.get(2).add(new Node(7,8, "Room-227")); //Hall-200 to Room-227
        adj_list.get(2).add(new Node(8,9, "Room-228")); //Hall-200 to Room-228
        adj_list.get(2).add(new Node(9, 11, "Hall-1100")); //Hall-200 to Hall 1100

        adj_list.get(9).add(new Node(10, 3, "Room-1101")); //Hall 1100 to Room 1101



    }
}