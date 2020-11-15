import java.util.Scanner;
public class task43 {
    public static String toCamelCase(String st_camel) {
        char ch;
        String new_camel="";
        for(int i=0;i<st_camel.length();i++){
            ch=st_camel.charAt(i);
            if(ch=='_'){
                i++;
                ch=Character.toUpperCase(st_camel.charAt(i));
            }
            new_camel+=ch;
        }
        return new_camel;
    }
    public static String toSnakeCase(String st_snake) {
        char ch;
        String new_snake="";
        for(int i=0;i<st_snake.length();i++){
            ch=st_snake.charAt(i);
            if((int)ch >= 65 && (int)ch <= 90){
                new_snake+='_';
                ch=Character.toLowerCase(ch);
            }
            new_snake+=ch;
        }
        return new_snake;   
    }
  
    
    public static void main(String[] args){
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt st: ");
        String st =k.nextLine();
        int i =0;
        int count =0;
        while (i<st.length()){
            if (st.charAt(i)=='_'){
               count=1;
               
            }
            i++;
        }
        if(count==1)
            System.out.println(task43.toCamelCase(st));
        else
            System.out.println(task43.toSnakeCase(st));
    }
}
    