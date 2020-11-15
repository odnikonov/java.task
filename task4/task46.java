import java.util.Scanner;
import java.util.Arrays;
class task46 {
    public static int bugger(int num) {
        String[] number = String.valueOf(num).split("");
        System.out.println("number: "+ Arrays.toString(number));
        int q=1;
        int k=0;
    while(number.length!=1){
        
        for(int i = 0;i<number.length;i++){
            q *= Integer.parseInt(number[i]);
            System.out.println("i= "+ i+" len= "+ number.length+" q= "+q); 
        }
        number=String.valueOf(q).split("");
        System.out.println(" number = "+Arrays.toString(number));
        System.out.println("q= "+q);
        k++;
        q=1;
        System.out.println("number.length= "+number.length);
    }
        return k;
        
    }

    public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt num: ");
        int num  =k.nextInt();
        System.out.println(task46.bugger(num));

        
    }
    
}
