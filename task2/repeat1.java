import java.util.Scanner;
public class repeat1 {
    private static void repeat (char[] ch, int a){
        for(int i=0; i<ch.length;i++){
            for(int j=0; j<a; j++)
                System.out.print(Character.toString(ch[i]));    
        }
     }  
   

    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
        System.out.println("Task 1");
        System.out.println("Input the number:");
        int a = k.nextInt();
        System.out.println("Input the size of array:");
        int n = k.nextInt();
        char[] ch;
        ch = new char [n];
        System.out.println("Input the element of array:");
        for (int i=0; i<n; i++){
             ch[i] = k.next().charAt(0);
             //5System.out.println(ch[i]);
        }
        System.out.println("Result: ");
        repeat1.repeat(ch, a);
        System.out.println("");
    }
}
    

