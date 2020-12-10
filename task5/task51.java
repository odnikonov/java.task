public class task51{
public static void encrypt(String word)
	{
		int[] codes = new int[word.length()];
		codes[0] = (int)word.charAt(0);
		System.out.print(codes[0] + " ");
		for (int i=1; i<word.length(); i++)
		{
			codes[i] = (int)word.charAt(i-1) - (int)word.charAt(i);
			System.out.print(-codes[i] + " ");
		}
		System.out.println();
    }
    public static void decrypt(int[] codes)
	{
		int a = 0;
		for (int i=0; i<codes.length; i++)
		{
			a += codes[i];
			System.out.print((char)a);
		}
		System.out.println();
	}
    public static void main(String[] args){
    String word1 = "Sunshine";
		int codes[] = new int[word1.length()];
		int codes2[] = {72, 33, -73 , 84, -12, -3, 13, -13, -68};
		System.out.println("Result: ");
		task51.encrypt(word1);
		task51.decrypt(codes2);
    }
}   