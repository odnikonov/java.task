import java.util.Scanner;
public class getDecimalPlaces {
    public static void get(String st) {
        int k=0;
        int q=0;
        for(int i = 0; i < st.length; i++){
            if(st[i]=="."){
                k=i;
                for(int j=k ;j<st.length;j++){
                    q=j;                    
                }
            }
        }
        System.out.println(q);  
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println ("Enter argument char: ");
        String st = k.nextLine(); 
      char[] stToArray = st.toCharArray(); // ??????????? ?????? str ? ?????? ???????? (char)
      // ????? ??????? ?? ?????
      for(int i = 0; i < stToArray.length; i++) {
         System.out.print(stToArray[i] + " ");
        System.out.println("Result: ");
        getDecimalPlaces.get(st);  
    }  
}
