import java.util.Scanner;
public class sumOfCubes {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in); // ????????? Scanner
        System.out.println("Enter array length: ");
        int size = input.nextInt(); // ?????? ? ?????????? ?????? ??????? ? ?????????? ? size
        int array[] = new int[size]; // ??????? ?????? int ???????? ? size
        System.out.println("Insert array elements:");
        /*????????? ?? ????? ???????, ???????? ???*/
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt(); // ????????? ?????? ??????????, ?????????? ? ??????????
        }
        int sum_kub=0;
        System.out.print ("Inserted array elements:");
        for (int i = 0; i < size; i++) {
            array[i]=array[i]*array[i]*array[i];
            sum_kub+=array[i];
        }
        System.out.println(sum_kub);
    }
}