import java.util.Scanner;
public class boxSeq {
    public static int boxS(int step){
        if (step % 2 == 0)
        return step;
        else{
        step += 2;
        return step;
        }
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("inpunt number: ");
        int step = k.nextInt();
        System.out.print(boxSeq.boxS(step));
        
    }
}
