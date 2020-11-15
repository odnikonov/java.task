import java.util.Scanner;
public class task47 {
    public static String toStarShorthand(String st)
	{
		String new_st = "";
        char first = (char) 0;
        int k = 0;
        for (int i = 0; i<st.length(); i++) 
        {
            if (first != st.charAt(i)) 
            {
                if (k > 1) 
                {
                    new_st += "*" + k;
                }
                first = st.charAt(i);
                new_st += first;
                k = 1;
            }
            else 
            {
                k++;
                if (i == st.length() - 1 && k > 1) 
                {
                    new_st += "*" + k;
                }
            }
        }
        return new_st;
    }
    public static void main(String[] args){
    Scanner k = new Scanner(System.in);
    System.out.println("inpunt st: ");
    String st =k.nextLine();
    System.out.println(task47.toStarShorthand(st));
    }
}
