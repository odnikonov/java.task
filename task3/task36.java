import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;
public class task36 {
    public static boolean arr() {
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt list1 : ");
        String st = k.nextLine();
        String[] list1 = st.split(",");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(list1 ));
        Object[] arset = set.toArray();
        System.out.println("inpunt list2 : ");
        String st2 = k.nextLine();
        String[] list2 = st2.split(",");
        Set<String> set2 = new LinkedHashSet<String>(Arrays.asList(list2 ));
        Object[] arset2 = set2.toArray();
        if (arset.length == arset2.length)
            return true;
        return false;
}        


    public static void main(String[] args){
        System.out.println(task36.arr());        
        } 
}
