public class task55 {
    public static void sameVowelGroup(String[] words)
	{
		int a, e, i, o, u, y;
		String[] vowels = new String[words.length];
		a = 0; e = 0; i = 0; o = 0; u = 0; y = 0;
	    for (int i1=0; i1<words.length; i1++)
	    {	    	
	    	for (int j = 0; j<words[i1].length(); j++) 
		    {	    		
		        if (words[i1].charAt(j) == 'a' || words[i1].charAt(j) == 'A') 
		        {
		            a = 1;
		        } 
		        else if (words[i1].charAt(j) == 'e' || words[i1].charAt(j) == 'E') 
		        {
		            e = 1;
		        } 
		        else if (words[i1].charAt(j) == 'i' || words[i1].charAt(j) == 'I') 
		        {
		            i = 1;
		        } 
		        else if (words[i1].charAt(j) == 'o' || words[i1].charAt(j) == 'O') 
		        {
		            o = 1;
		        } 
		        else if (words[i1].charAt(j) == 'u' || words[i1].charAt(j) == 'U') 
		        {
		            u = 1;
		        }
		        else if (words[i1].charAt(j) == 'y' || words[i1].charAt(j) == 'Y') 
		        {
		            y = 1;
		        }
		        vowels[i1] = Integer.toString(a) + Integer.toString(e) + Integer.toString(i) +
		        		Integer.toString(o) + Integer.toString(u) + Integer.toString(y);		        
		    }
	    	a = 0; e = 0; i = 0; o = 0; u = 0; y = 0;
	    }
	    for (int i1 = 0; i1<words.length; i1++)
	    {
	    	if (vowels[0].equals(vowels[i1]))
	    		System.out.print(words[i1] + " ");
	    }
	    System.out.println();
    }
    public static void main(String[] args){
        String[] words1 = {"mother", "eran", "father", "sOnne", "Eons"};
		System.out.println("Result: "); 
		task55.sameVowelGroup(words1);
    }
    
}
