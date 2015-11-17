/**
 * Created by akensho on 2015/11/18.
 */
public class Main {
    public static void main(String[] args){
        Node node = new Node(10);
        node.appendToTail(3);
        node.appendToTail(4);
        node.deleteNode(node, 10);
        System.out.println(node.data);
    }
}
