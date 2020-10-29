import java.util.Scanner;
import java.util.InputMismatchException;
public class operation {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
		System.out.println ("Enter argument a: ");
        double a = k.nextDouble();
        System.out.println ("Enter argument b: ");
        double b = k.nextDouble();
        System.out.println ("Enter argument n: ");
        double n = k.nextDouble();
        if(a-b == n){
            System.out.println ("added ");
        }
        else if(b-a == n){
            System.out.println ("subtracted ");
        }
        else {
            System.out.println ("none ");
        }
        

    }
    
}
