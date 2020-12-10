public class task59 {
    public static void correctTitle(String saying)
	{
		int j = 0;
		String[] sayingarray = saying.split("\\s+");
		
		for (String word : sayingarray) 
		{
			if (word.equalsIgnoreCase("and") || word.equalsIgnoreCase("in") ||
					word.equalsIgnoreCase("of") || word.equalsIgnoreCase("the"))
				System.out.print(word.toLowerCase() + " ");
			else
				System.out.print(Character.toString(word.charAt(0)).toUpperCase() + 
						word.substring(1, word.length()).toLowerCase() + " ");
		}
		System.out.println();
    }
    public static void main(String[] args){
        String saying = "sansa stark, lady of winterfell.";
		System.out.println("Result: "); 
		task59.correctTitle(saying);

    }
}
