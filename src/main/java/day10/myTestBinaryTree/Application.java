package day10.myTestBinaryTree;

public class Application {
    public static void main(String[] args) {
        Tree tree = new Tree();
        // insert nodes into the tree:
        tree.insertNode(6);
        tree.insertNode(8);
        tree.insertNode(5);
        tree.insertNode(8);
        tree.insertNode(2);
        tree.insertNode(9);
        tree.insertNode(7);
        tree.insertNode(4);
        tree.insertNode(10);
        tree.insertNode(3);
        tree.insertNode(1);
        // tree display:
        tree.printTree();

        // remove one node and display the remaining tree in the console
        tree.deleteNode(5);
        tree.printTree();

        // find the node by value and display it in the console
        Node foundNode = tree.findNodeByValue(7);
        foundNode.printNode();
    }
}
