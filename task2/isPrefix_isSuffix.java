import java.util.Scanner;
public class isPrefix_isSuffix {
    public static boolean isPrefix(String word1, String word2){
        return word1.startsWith(word2.substring(0, word2.length()-1));
    }

    public static boolean isSuffix(String word1, String word2){
        return word1.endsWith(word2.substring(1, word2.length()));
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("inpunt string 1: ");
        String word1 = k.nextLine();
        System.out.print("inpunt string 2: ");
        String word2= k.nextLine();
        System.out.print("isSuffix: ");
        boolean su = isPrefix_isSuffix.isSuffix(word1,word2);
        System.out.print(su);
        System.out.print(" ,isPrefix: ");
        boolean pr = isPrefix_isSuffix.isPrefix(word1,word2);
        System.out.print(pr);
        //
        

        
    }
}
