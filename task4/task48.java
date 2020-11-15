import java.util.Scanner;
public class task48 {
    public static boolean doesRhyme(String slang, String slang2)
	{
		String newslang = "", newslang2 = "";
		int a = slang.lastIndexOf(" ");
		int b = slang2.lastIndexOf(" ");
		for (int i=a; i<slang.length(); i++)
		{
			if (slang.charAt(i) == 'a' || slang.charAt(i) == 'e' || slang.charAt(i) == 'i' || slang.charAt(i) == 'o' ||
					slang.charAt(i) == 'u' || slang.charAt(i) == 'y' || slang.charAt(i) == 'A' || slang.charAt(i) == 'E'
					|| slang.charAt(i) == 'I' || slang.charAt(i) == 'O' || slang.charAt(i) == 'U' || slang.charAt(i) == 'Y')
				newslang += Character.toString(slang.charAt(i));
		}
		for (int i=b; i<slang2.length(); i++)
		{
			if (slang2.charAt(i) == 'a' || slang2.charAt(i) == 'e' || slang2.charAt(i) == 'i' || slang2.charAt(i) == 'o' ||
					slang2.charAt(i) == 'u' || slang2.charAt(i) == 'y' || slang2.charAt(i) == 'A' || slang2.charAt(i) == 'E'
					|| slang2.charAt(i) == 'I' || slang2.charAt(i) == 'O' || slang2.charAt(i) == 'U' || slang2.charAt(i) == 'Y')
				newslang2 += Character.toString(slang2.charAt(i));
		}
		boolean b1 = newslang.equalsIgnoreCase(newslang2) ? true : false;
		return b1;
    }
    public static void main(String[] args){
        // Scanner k = new Scanner(System.in);
        System.out.println("inpunt slang: ");
        String slang ="Sam I am!";
        System.out.println("inpunt slang2: ");
        String slang2 ="Green eggs and ham.";
        boolean x= task48.doesRhyme(slang,slang2);
        System.out.println(x);
        }
}
