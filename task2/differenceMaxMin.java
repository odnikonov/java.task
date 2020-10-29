import java.util.Scanner;
public class differenceMaxMin{
    public static void differenceMaxMin(double[]arr, int a){
    double min = arr[0];
    double max = arr[1];
    for(int i=0; i<a; i++){
        if(min > arr[i]){
            min=arr[i];
        }
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println(max-min);
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
       differenceMaxMin.differenceMaxMin(arr, a);
       System.out.println("");
    
    }
}