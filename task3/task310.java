import java.util.Scanner;
public class task310 {
    public static boolean rightTriangle(int g, int k1, int k2) {
    if(g*g==k1*k1+k2*k2)
    return true;
    return false;
}
public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt g : ");
        int g = k.nextInt();
        System.out.println("inpunt k1 : ");
        int k1 = k.nextInt();
        System.out.println("inpunt k2 : ");
        int k2 = k.nextInt();
        // int prime;
        boolean x =  task310.rightTriangle(g,k1,k2);
        System.out.println(x);
        
    }
}
