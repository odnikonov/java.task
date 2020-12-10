public class task54 {
    public static String sumDigProd(int digits[])
	{
		int a = 0;
		int p = 1;		
		for (int i=0; i<digits.length; i++)
		{
			a += digits[i];
		}
		String charital = Integer.toString(a);
		while (charital.length() != 1)
		{			
			for (int i=0; i<charital.length(); i++)
				p *= Integer.parseInt(charital.substring(i,i+1));
			charital = Integer.toString(p);
			p = 1;
		}
		return charital;
    }
    public static void main(String[] args){
        int[] digits = {1, 2, 3, 4, 5, 6};
		System.out.println("Result: " + task54.sumDigProd(digits));

    }
}
