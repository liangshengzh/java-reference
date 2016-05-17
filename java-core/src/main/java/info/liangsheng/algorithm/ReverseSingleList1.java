package info.liangsheng.algorithm;

/**
 * Created by zhong on 5/5/16.
 */
public class ReverseSingleList1 {

    public static Node reserve(Node node){
        Node currentNode = node;
        Node previousNode = null;
        Node nextNode = null;
        while (currentNode != null){
            nextNode = currentNode.getNext();
            currentNode.setNext(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }

        return previousNode;
    }

    public static void main(String[] args){
        Node<String> nodeA= new Node<String>("A");
        Node<String> nodeB= new Node<String>("B");
        Node<String> nodeC= new Node<String>("C");
        Node<String> nodeD= new Node<String>("D");
        nodeA.setNext(nodeB);
        nodeB.setNext(nodeC);
        nodeC.setNext(nodeD);

        printNode(reserve(nodeA));
    }

    private static  void printNode(Node node){
        while (node != null){
            System.out.print(node.getData() +"-->");
            node = node.getNext();
        }
    }
}
