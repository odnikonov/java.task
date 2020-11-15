// import java.util.Scanner;
public class task41 {
    public static String esse(int n, int k, String st) {
        // if(n>100 || n<1)
        //     System.out.println("incorrect values ??entered ");
        // if (k>80||k<1)
        //     System.out.println("incorrect values ??entered ");
         int kol_simv_v_slove=0;
         int s =0;
        int len = st.length();
        for(int i=0;i<len;i++){
            if (st.charAt(i) != ' ') 
            kol_simv_v_slove++;
            else 
                s=i;
            if(kol_simv_v_slove>k && s!=0){
                // k=i-s;
                st=st.substring(0,s)+"\n"+st.substring(s+1,len);
            }
        }
        return st;
    }
    public static void main(String[] args)
    {
        int n = 10;
		int k = 7;
		String st = "I am the best of your pupils of our school!";
		System.out.println("Result: ");
		System.out.println(esse(n,k,st));
        
    }
}

