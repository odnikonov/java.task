import java.util.Scanner;
// import java.util.Arrays;
public class task42 {
    public static String split_st(String st){
        String new_st = "[";
        int open=0;
        int close=0;
        for(int i=0;i<st.length();i++){
            
            if(st.charAt(i)=='('){
                open++;
                new_st+='(';
            }
            else if(st.charAt(i)==')'){
                close++;
                new_st+=')';
            }
            if(open==close){
                if(i+1!=st.length())
                    new_st+=",";
                open=0;
                close=0;
            }
            
        }  
        new_st+="]";    
        return new_st;
    }
        


    
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt st: ");
        String st =k.nextLine();
        System.out.println(task42.split_st(st));
        } 
}
