import java.util.Arrays;

/**
 * Created by akensho on 2015/11/17.
 * 問題：2つの文字列が現れたとき、片方がもう片方の並び替えになっているかどうかを調べよ。
 */
public class Main {
    public static void main(String... args){
        System.out.println(isPermutation("aaaa", "aaaa"));
    }

    public static String sort(String str){
        char[] content = str.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean isPermutation(String string, String target){
        if( string.length() != target.length() ) return false;
        return sort(string).equals(sort(target)) ? true : false;
    }
}
