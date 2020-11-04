import java.util.Scanner;
import java.util.Arrays;
public class task38 {
    public static String longestZero(String st){  
        int k = 0;
        String[] zero = st.split("1");   
        System.out.println("zero : "+Arrays.toString(zero)); 
        int max= zero[0].length();
        for(int i = 0;i<zero.length;i++){
            if(max<zero[i].length()){
                max=zero[i].length();
                k=i;
            }
            
        }

        return zero[k];
        
    } 
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt st : ");
        String st = k.nextLine();
        String x = task38.longestZero(st);
        System.out.println(x);
        }   
}
