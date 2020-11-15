public class task410 {
    public static int countUniqueBooks(String st, char end)
	{
		int start = -1; 
		int end2 = -1; 
		int i, j; 
		int k = 0;
        String temp, test;
        for (i=0; i<st.length(); i++) 
        {
            if (st.charAt(i) == end) 
            {
                if (start == -1) 
                {
                    start = i;
                }
                else 
                {
                    end2 = i;
                }
            }
            if (start != -1 && end2 != -1) 
            {
                test = st.substring(start+1, end2);
                temp = "";
                for (j = 0; j < test.length(); j++)
                {
                    char current = test.charAt(j);
                    if (temp.indexOf(current) < 0)
                    {
                        temp = temp + current;
                    }
                }
                k += temp.length();
                start = -1;
                end2 = -1;
            }
        }
        return k;
    }
    public static void main(String[] args){
        String books = "AZYWABBCATTTA";
		char end = 'A';
		System.out.println("Result: " + task410.countUniqueBooks(books, end));
        
    }
}   

