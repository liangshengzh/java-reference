package info.liangsheng.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhong on 5/5/16.
 */
public class ReverseSingleList2 {


    public static Node reserve(Node node){
        if(node == null || node.getNext() ==null){
            return node;
        }
        List<Node> nodeList = new ArrayList<>();
        while (node != null){
            nodeList.add(node);
            node = node.getNext();
        }
        Node[] nodes = nodeList.toArray(new Node[]{});
        for(int i = nodes.length - 1; i>0; i--){
            nodes[i].setNext(nodes[i-1]);
        }
        nodes[0].setNext(null);
        return nodes[nodes.length - 1];
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
        System.out.println();
    }
}
