import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
public class task37 {
    public static boolean isKaprekar(int n) {
        if((n==1) || (n==0))
            return true;
        if((n>1) && (n<10))
            return false;
        String st =Integer.toString(n*n);
        System.out.println(st);
        int len=(st.length())/2;      
        char a= st.charAt(len);
            int index = st.indexOf(a);
            char str_index = st.charAt(index);
            String[] list= st.split(Character.toString(str_index));
            String first_element = list[0];
            String second_element = list[1];
            second_element=a+second_element;
            if((Integer.parseInt(first_element) + Integer.parseInt(second_element)) == n)
                return true;
            return false;
} 
        public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt n: ");
        // String st = k.nextLine();
        int n =k.nextInt();
        boolean x = task37.isKaprekar(n);
        System.out.println(x);
        } 
}