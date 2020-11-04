import java.util.Scanner;
class task33 {
    public static boolean checkPerfect (double n){
        int i=1;
        double sum=0;
	    while(i<=n/2){
	       if(n%i==0){
		        sum+=i;
	       }
	      i++;
	    }
	if(sum==n)
        return true;
	else
	    return false;
}
    public static void main(String[] args){
    Scanner k = new Scanner(System.in);
    System.out.println("inpunt n : ");
    double n = k.nextInt();
    System.out.println(task33.checkPerfect(n));
    }
 
}