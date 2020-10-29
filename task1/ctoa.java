import java.util.Scanner;
import java.nio.charset.Charset;
import java.util.InputMismatchException;
public class ctoa {
    public static void main(String args[]){
        Scanner k = new Scanner(System.in);
		System.out.println ("Enter argument char: ");
        String st = k.nextLine();
        char character = st.charAt(0);
        // byte[] b = str.getBytes(StandardCharsets.US_ASCII);
        //Charset characterSet = Charset.forName(a);
        //byte[] b = string.getBytes(characterSet);
        int ascii = (int) character;
        System.out.println(ascii);

//String string = "Wazzup";

    }
}
