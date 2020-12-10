public class task510 {
    public static boolean hexLattice(int digit)
	{
		int a = 1;
		int b = 6;
		while (digit > a)
		{
			a += b;
			b += 6;
		}
		boolean c = digit == a ? true : false;
        return c;
    }
    public static void main(String[] args){
        int hexal = 127;
		System.out.println("Result: " + task510.hexLattice(hexal));
    }
	
}
