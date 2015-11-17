/**
 * Created by akensho on 2015/11/18.
 * 単方向連結リスト
 */
public class Node {
    Node next = null;
    int data;

    public Node(int data){
        this.data = data;
    }

    /**
     * リストの末尾に追加する
     * @param data
     */
    void appendToTail(int data){
        Node end = new Node(data);
        Node n = this;
        System.out.println(n);
        while( n.next != null ){
            n = n.next;
        }
        n.next = end;
    }

    Node deleteNode(Node head, int data){
        Node n = head;
        if( n.data == data ) return head.next;
        while ( n.next != null ){
            if( n.next.data == data ){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
