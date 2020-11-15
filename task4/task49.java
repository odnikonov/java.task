public class task49 {
    public static boolean trouble(long num1, Long num2) {
        int a = 1;
		char b='d';
        String number1 = String.valueOf(num1);
        String number2 = String.valueOf(num2);
        for (int i=0; i<number1.length()-2; i++)
		{
			if (number1.charAt(i) == number1.charAt(i+1) && number1.charAt(i+1) == number1.charAt(i+2))
				 b = number1.charAt(i);
		}
		for (int i=0; i<number2.length()-1; i++)
		{
			if (number2.charAt(i) == number2.charAt(i+1) && number2.charAt(i) == b)
				 a = number2.charAt(i);
		}
		boolean d = a == b ? true : false;
		return d;  
    }
    public static void main(String[] args){
        System.out.println("inpunt slang: ");
        long num1 = 451999277;
        long num2 = 41177722899L;
        System.out.println(task49.trouble(num1, num2));
        }
}
