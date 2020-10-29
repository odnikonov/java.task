import java.util.Scanner;
import java.util.InputMismatchException;
public class addUpTo {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
		System.out.println ("Enter argument n: ");
        double n = k.nextDouble();      
            int result = 0;
            for (int i = 1; i <=n; i ++){
                result = result+i;
            System.out.println (result);
            }	
    
    }
}
