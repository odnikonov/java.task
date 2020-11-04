import java.util.Scanner;
import java.util.Arrays;
public class task35 {
    public static boolean isValidHexCode(String st) {
        int len = st.length();
        int k = 0;
        char[] result = st.toCharArray();
        if(result[0]=='#'){
            if(len==7){
                for(int i=1;i<len;i++){
                    if( ( Character.isDigit(result[i]) ) || (result[i] >= 'a' && result[i] <= 'z') || (result[i] >= 'A' && result[i] <= 'Z') ){
                      k+=1;
    
                    }
                }               
            }
        }
        if(k==len-1)
            return true;
        return false;
    }
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt st : ");
        String st = k.nextLine();
        boolean x = task35.isValidHexCode(st);
        System.out.println(x);
        } 
}
