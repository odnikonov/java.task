public class task45 {
    public static void BMI(String h, String ves) {
        String a = "";
        String x = "";
		double ves2 = ves.endsWith("pounds") ? 0.453592 : 1;//???
		double h2 = h.endsWith("inches") ? 0.0254 : 1;//??????
		double bmi = Double.parseDouble(ves.substring(0, ves.indexOf(' '))) * ves2 / 
				Math.pow(Double.parseDouble(h.substring(0, ves.indexOf(' '))) * h2, 2);
		if (bmi < 18.5)
			System.out.println(String.format("%.1f", bmi) + " Underves");
		else if (bmi >= 18.5 && bmi <= 24.9)
			System.out.println(String.format("%.1f", bmi) + " Normal ves");
		else if (bmi >= 25)
            System.out.println(String.format("%.1f", bmi) + " Overves");
        //  return x;


        
    }
    public static void main(String[] args){
        // double[] z = {16, 18, 30, 1.8};
		// System.out.println(task44.overtime(z));
    
        String ves = "205 pounds";
		String h = "73 inches";
		System.out.println("Result: ");
        task45.BMI(h, ves);
    }
    
}
// ???? ? ??????????? ? ??????? ?? ??????? ?????? ????? ? ??????. 80/170*170