public class task53 {
    public static boolean canComplete(String word1, String word2)
	{
		String word3 = "";
		int count = 0;
		for (int i=0; i<word1.length(); i++)
		{
			word3 += word2.indexOf(word1.charAt(i));		
		}

		for (int i=0; i<word3.length()-1; i++)
		{
			if (word3.indexOf("-1") == -1)
			{	if ((int)(word3.charAt(i)) < (int)(word3.charAt(i+1)))
					count++;
				else if ((int)(word3.charAt(i)) > (int)(word3.charAt(i+1)))
				{
					if (word2.indexOf(word1.charAt(i+1)) < word2.lastIndexOf(word1.charAt(i+1)))
						count++;
				}
			}
			else return false;
		}
		boolean b = count + 1 == word3.length() ? true : false;
		return b;
    }
    public static void main(String[] args){
        String word9 = "aulu";
		String word10 = "beautifulu";
		System.out.println("Result: " + task53.canComplete(word9, word10));
    }
    
}
