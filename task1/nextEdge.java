import java.util.Scanner;
public class nextEdge {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
		System.out.println ("Enter the first side of the triangle: ");
        int a = k.nextInt();  
        System.out.println ("Enter the second side of the triangle: ");   
        int b = k.nextInt(); 
        int s = a + b - 1;
        System.out.println(s);
    }
}   

