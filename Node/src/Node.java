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
     * リストの末尾に値を追加する。
     * nextがnullになるまで探し、nullになったら新しいNodeをつけるだけ。
     * @param data
     */
    void appendToTail(int data){
        Node end = new Node(data);
        Node n = this;
        while( n.next != null ){
            n = n.next;
        }
        n.next = end;
    }

    /**
     * ノードを削除する。
     * ノードnが与えられ、それが削除したいdataだった場合は、単純にノードの先頭を移動する。そうでなければ、nextがnullになるまで探す。
     * nextのdataが削除したい値だった場合は、nextを次の値に置き換えるだけ。（n.next = n.next.nextがそれにあたる行為）
     * @param head
     * @param data
     * @return
     */
    Node deleteNode(Node head, int data){
        Node n = head;
        if( n.data == data ){
            return head.next;//ノードの先頭を移動する
        }
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
