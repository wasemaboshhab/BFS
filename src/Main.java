public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");
        Node nodeG = new Node("G");
        Node nodeH = new Node("H");

        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeF);
        nodeA.addNeighbor(nodeG);

        nodeB.addNeighbor(nodeA);
        nodeB.addNeighbor(nodeC);
        nodeB.addNeighbor(nodeD);

        nodeF.addNeighbor(nodeA);

        nodeG.addNeighbor(nodeA);
        nodeG.addNeighbor(nodeH);

        nodeD.addNeighbor(nodeB);
        nodeD.addNeighbor(nodeE);

        nodeC.addNeighbor(nodeB);

        nodeE.addNeighbor(nodeD);

        nodeH.addNeighbor(nodeG);

        BFS bfs = new BFS();
        bfs.startBfs(nodeA);

    }
}
