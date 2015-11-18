import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by akensho on 2015/11/18.
 */
public class Main2_1 {
    static final int MAX_VAL = 5;
    public static void main(String... args){
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < 6; i++){
            list.add(rand.nextInt(MAX_VAL));
        }
        displayList(list);
        deleteSameValueFromList(list);
        System.out.println("====");
        displayList(list);
    }

    public static void deleteSameValueFromList(LinkedList<Integer> list){
        boolean[] is_appeared = new boolean[MAX_VAL+1];
        Arrays.fill(is_appeared, false);
        for (int x : list) {
            is_appeared[x] = true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++){
            if( is_appeared[list.indexOf(i)] ){
                list.remove(i);
                size--;
                i--;
            }
        }
        /*
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x: list){
            set.add(x);
        }
        int size = list.size();
        for (int i = 0; i < size; i++){
            if( set.contains(list.indexOf(i)) ){
                list.remove(i);
                //i--;
                //size--;
            }
        }
        */
    }

    public static void displayList(LinkedList<Integer> list){
        for (int x: list) {
            System.out.println(x);
        }
    }
}
