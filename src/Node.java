import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
    private String name;
    private boolean visited;
    private List<Node> neighbors;


    public Node(String name) {
        this.name = name;
        this.visited = false;
        this.neighbors = new ArrayList<>();
    }

    public void addNeighbor(Node neighbor) {
        this.neighbors.add(neighbor);
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
        if (visited) {
            System.out.println(this + " was visited");

        }
    }

    public boolean isVisited() {
        return visited;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public String toString() {
        return  this.name;
    }
}