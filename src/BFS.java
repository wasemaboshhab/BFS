import java.util.LinkedList;
import java.util.Queue;

public class BFS {


    public void startBfs(Node start) {
        Queue<Node> queue = new LinkedList();
        start.setVisited(true);
        queue.add(start);
        System.out.println("Queue:" + queue);
        while (!queue.isEmpty()) {
            Node currentNode = queue.remove();
            for (Node currentNeighbor : currentNode.getNeighbors()) {
                if (!currentNeighbor.isVisited()) {
                    currentNeighbor.setVisited(true);
                    queue.add(currentNeighbor);
                    System.out.println(queue);
                }
            }
        }
    }


}
