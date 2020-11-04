import java.util.Scanner;
public class task31 {
    public static int solutions(double a, double b, double c) {
       double d;
       d=b*b-4*a*c;
       if (d<0)
           return 0;
       else if(a==0)
           return 1;
        else if((b==0)&&(c==0))
            return 1;
       else 
           return 2;
        
    }   
    public static void main(String[] args) {
       Scanner k = new Scanner(System.in);
       System.out.print("inpunt a : ");
       double a = k.nextDouble();
       System.out.print("inpunt b : ");
       double b = k.nextDouble();
       System.out.print("inpunt c : ");
       double c = k.nextDouble();
       int koren = task31.solutions(a,b,c);
       System.out.println(koren);
        
    }
}
   