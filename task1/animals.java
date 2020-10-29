import java.util.Scanner;
public class animals {
    public static void main(String args[]) {
        int chickens_legs = 2;
        int cows_legs = 4;
        int pigs_legs= 4;
        Scanner k = new Scanner(System.in);
		System.out.println ("Enter the number of chickens: ");
        int chikens = k.nextInt();
        System.out.println ("Enter the number of cows: ");
        int cows = k.nextInt();
        System.out.println ("Enter the number of pigs: ");
        int pigs = k.nextInt();
        int quantity_legs= chickens_legs*chikens + cows_legs*cows + pigs_legs*pigs;
        System.out.println ("number of legs of all animals: " + quantity_legs);

    }
    
}
 