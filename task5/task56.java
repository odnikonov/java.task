public class task56 {
    public static boolean validateCard(long cardcode)
	{
		String code2 = "";
		String code = Long.toString(cardcode);
		code2 = code.substring(0, code.length()-1);
		String reversecode = "";
		String reversecode2 = "";
		int a = 0;
		int sum = 0;
		int controlsum = 0;
		if (code.length() >= 14 && code.length() <= 19)
		{
			for (int i=code2.length(); i>0; i--)
			{
				reversecode += code2.substring(i-1, i);
			}
			for (int i=0; i<reversecode.length(); i++)
			{
				if (i % 2 == 0)
				{
					a = ((int)reversecode.charAt(i) - 48) * 2;
					if (a >= 10)
						a = (int)Integer.toString(a).charAt(0) + (int)Integer.toString(a).charAt(1) - 96;
					reversecode2 += Integer.toString(a);
				}
				else if (i % 2 == 1)
				{
					a = ((int)reversecode.charAt(i) - 48);
					reversecode2 += Integer.toString(a);
				}
				sum += a;
		}	
			controlsum = 10 - (int)Integer.toString(sum).charAt(Integer.toString(sum).length()-1) + 48;
			boolean b = controlsum == (int)code.charAt(code.length()-1) - 48 ? true : false;
			return b;
		}
		else return false;
    }
    public static void main(String[] args){
        long validatecode = 1234567890123452L;
		System.out.println("Result: " + task56.validateCard(validatecode));

    }
}
