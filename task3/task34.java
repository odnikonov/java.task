import java.util.Scanner;
import java.util.Arrays;
public class task34 {
    public static void flipEndChars(String st) {
        int len = st.length();
        char[] result = st.toCharArray();
        if(len<=2){
            System.out.println("Incompatible.");
        }
        if(result[len-1]==result[0]){
            System.out.println("Two's a pair.");
        }
        else{
           char k = result[len-1];
           result[len-1]=result[0];
            result[0] = k;

            System.out.println(result);
        }   
    }
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt st : ");
        String st = k.nextLine();
        task34.flipEndChars(st);
        } 
}
//   char last_st2= st2.charAt(len2-1);
//         char first_st2= st2.charAt(0);
//         char last_st1= st1.charAt(len1-1);
//         char first_st1= st1.charAt(0);
//         if(last_st2==first_st1)
//             if(last_st1==first_st2)
//                 return true;
//         return false;        