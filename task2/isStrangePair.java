import java.util.Scanner;
public class isStrangePair {
    public static boolean pair(String st1, String st2) {
        int len1 = st1.length();
        int len2 = st2.length();
        char last_st2= st2.charAt(len2-1);
        char first_st2= st2.charAt(0);
        char last_st1= st1.charAt(len1-1);
        char first_st1= st1.charAt(0);
        if(last_st2==first_st1)
            if(last_st1==first_st2)
                return true;
        return false;        
    }
    public static void main(String [] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input the string:");
        String st1 = k.nextLine();
        String st2 = k.nextLine();
        System.out.println("Result:");
        boolean x = isStrangePair.pair(st1, st2);
        System.out.println(x);

    }
}
