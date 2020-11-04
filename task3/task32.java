import java.util.Scanner;
class task32 {
    public static int findZip (String st) {
        return st.indexOf("zip", st.indexOf("zip") + 1);
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("inpunt st : ");
        String st = k.nextLine();
        System.out.println(task32.findZip(st));
    }
    
}
