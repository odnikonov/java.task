import java.util.Scanner;
public class isAvgWhole {

    
    public static void avg(double[]arr,int a){
        double k =0;
        for(int i=0; i<a;i++){
            k+=arr[i];
        }
        System.out.println(k/a);
        if((k/a)==(int)(k/a)){
            System.out.println(true);
        }
        else{System.out.println(false);
        }
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input the number:");
        int a = k.nextInt();
        double[] arr;
        arr = new double [a];
        System.out.println("Input the element of array:");
        for (int i=0; i<a; i++){
            arr[i] = k.nextDouble();
       }
       System.out.println("Result: ");
       isAvgWhole.avg(arr, a);
       System.out.println("");
    
    }
}
    

