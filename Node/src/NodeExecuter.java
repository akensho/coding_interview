/**
 * Created by akensho on 2015/11/18.
 */
public class NodeExecuter {
    public static void main(String[] args){
        Node node = new Node(10);
        node.appendToTail(111);
        System.out.println(node.data);
        System.out.println(node.next.data);
        node = node.deleteNode(node, 10);
        System.out.println(node.data);
    }
}
