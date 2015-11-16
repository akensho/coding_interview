import java.util.HashSet;

/**
 * Created by akensho on 2015/11/17.
 */
public class Main {
    public static void main(String... args){
        System.out.println(isUniqueChars("abcdfg"));
    }

    /**
     * 入力された文字列を構成する全ての文字がユニークかどうかを判定するアルゴリズム
     * @param str 入力する文字列
     * @return
     */
    public static boolean isUniqueChars(String str){
        HashSet<Character> set = new HashSet<Character>();
        for( int index = 0; index < str.length(); index++ ){
            char letter = str.charAt(index);
            if( set.contains(letter) ) return false;
            set.add(letter);
        }
        return true;
    }
}
