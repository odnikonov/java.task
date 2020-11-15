import java.util.Scanner;

public class task44 {
    public static String overtime(double[] z) { //overTime([9, 17, 30, 1.5]) 
    String st = "$";
		double zp = z[1] > 17 ? (17 - z[0]) * z[2] + (z[1] - 17) * z[2] * z[3]
				: (z[1] - z[0]) * z[2];
		st += String.format("%.2f", zp);
		return st;

    }
    public static void main(String[] args){
        double[] z = {16, 18, 30, 1.8};
		System.out.println(task44.overtime(z));
    }
}
//??????? ????? ??????? ? 17??????