import java.util.Scanner;
public class isValid {
    public static boolean check(String st) {
        int len = st.length();
        if (st != null){
            if(len==5) // checks if the String is null 
                return true;
        }
          
          for (int i = 0; i < len; i++) {
             // checks whether the character is a digit and not a space
                if ((Character.isDigit(st.charAt(i)) == true) && (st.charAt(i) != ' ')) {
                return false; // if it is not any of them then it returns false
             }
          }
          return true;
       }
       public static void main(String [] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input the string:");
        String st = k.nextLine();
        System.out.println("Result:");
        boolean x = isValid.check(st);
        System.out.println(x);

       } 
    
}
