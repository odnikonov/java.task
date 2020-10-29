import java.util.Scanner;
public class fibonachi {
    public static int fib(int n) {
            if (n == 0)
                return 0;
            else if (n == 1)
                return 1;
            else
                return fib(n - 1) + fib(n - 2);
            // System.out.println(fib(n)) ;
        }
        
    
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input the number:");
        int n = k.nextInt();
        System.out.println("Result: ");
        int x = fibonachi.fib(n);
        System.out.println(x) ;
        
    }
    
}
