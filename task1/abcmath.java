import java.util.Scanner;
public class abcmath{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // ????????? Scanner
        System.out.println("Enter a: ");
        double a = input.nextDouble(); 
        System.out.println("Enter b: ");
        double b = input.nextDouble();
        System.out.println("Enter c: "); 
        double c = input.nextDouble(); 
        

        for(int i = 0; i < b; i++){
                a+=a;
        }
        System.out.println(a);
        System.out.println(c);
        if(a % c == 0){
                System.out.println(true);
        }
        else{
            
            System.out.println(false);
        }
    
    }
}