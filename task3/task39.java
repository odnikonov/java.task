import java.util.Scanner;
public class task39 {
 
    public static int next_Prime(int prime) 
	{
		int k = 0;
		for (int i=2; i<prime; i++) 
		{
            if (prime % i == 0) 	
            	k++;       
        }
		if (k == 0)
			return prime;
		else
		{
	    boolean isPrime = false;
	    int start = 2; 
	    while (!isPrime) 
	    {
	        prime += 1;
	        int m = (int) Math.ceil(Math.sqrt(prime));
	        isPrime = true;
	        for (int i = start; i <= m; i++) 
	        {
	            if (prime % i == 0) 
	            {
	                isPrime = false;
	                break;
	            } 
	        }
	    }
		}
	    return prime;
	}
	public static void main(String[] args)
    {
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt n : ");
        int prime = k.nextInt();
        // int prime;
        int x = task39.next_Prime(prime);
        System.out.println(x);
        
    }
}


      

