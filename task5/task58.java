import java.security.MessageDigest;
import java.util.*;
public class task58 {
    public static String getSha256Has(String base) 
	{
		try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(base.getBytes("UTF-8"));
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }

	        return hexString.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
    }
    public static void main(String[] args){
        String word11 = "a";
		System.out.println("Result: " + task58.getSha256Has(word11));
    }
}
