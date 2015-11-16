/**
 * Created by akensho on 2015/11/17.
 */
public class Main {
    public static void main(String... args){
        System.out.println(reverse("yoyoginiikuyo"));
    }

    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
