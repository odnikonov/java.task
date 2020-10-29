import java.util.Scanner;
import java.util.Arrays;
public class cumulativeSum {
    public static void Sum(double[]arr, double[] arr_new, int a){
        double k=0;
        //arr_new[0] = arr[0];
        for(int i=0; i<a; i++){
            k+=arr[i];
            arr_new[i]=k;
        }
        System.out.println(Arrays.toString(arr_new));
    }

    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input the number:");
        int a = k.nextInt();
        double[] arr = new double [a];
        double[] arr_new = new double [a];
        System.out.println("Input the element of array:");
        for (int i=0; i<a; i++){
            arr[i] = k.nextDouble();
       }
       System.out.println("Result: ");
       cumulativeSum.Sum(arr, arr_new, a);  
    }
}
