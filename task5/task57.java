public class task57 {
    public static String numToEng(int number)
	{
		String[] ones = {"zero", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine"};
		String[] ones2 = {" ", "one", "two", "three", "four", "five", "six",
				"seven", "eight", "nine"};
		String[] tenprefixes = {"ten", "eleven", "twelve", "thir", "four", "fif", "six",
				"seven", "eight", "nine"};
		String[] tenprefixes2 = {"ten", "eleven", "twen", "thir", "for", "fif", "six",
				"seven", "eight", "nine"};
		String[] tensuffixes = {"ten", "eleven", "twelve", "teen", "teen", "teen", "teen",
				"teen", "een", "teen"};
		String[] tens = {"ten", "twenty", "ty", "ty", "ty", "ty", "ty", "ty", "ty", "ty"};
		if (Integer.toString(number).length() == 1)
			return ones[number];
		else if (Integer.toString(number).length() == 2)
		{
			if ((int)Integer.toString(number).charAt(0) == 48)
				return "Wrong number format";
			else if (Integer.toString(number).charAt(0) == '1' && (int)Integer.toString(number).charAt(1) >= 48
					&& (int)Integer.toString(number).charAt(1) <= 50)
				return tenprefixes[number % 10];
			else if (Integer.toString(number).charAt(0) == '1' && (int)Integer.toString(number).charAt(1) >= 51
					&& (int)Integer.toString(number).charAt(1) <= 57)
				return tenprefixes[number % 10] + tensuffixes[number % 10];
			else return tenprefixes2[number / 10] + tens[number / 10] + " " + ones2[number % 10];
		}
		 if (Integer.toString(number).length() == 3)
		{
			if ((int)Integer.toString(number).charAt(0) == 48)
				return "Wrong number format";
			else if (Integer.toString(number).charAt(1) == '0')
				return ones[number / 100] + " hundred " + ones2[number % 100];
			else if (Integer.toString(number).charAt(1) == '1' && (int)Integer.toString(number).charAt(2) >= 48
					&& (int)Integer.toString(number).charAt(2) <= 50)
				return ones[number / 100] + " hundred " + tenprefixes[number % 100 % 10];
			else if (Integer.toString(number).charAt(1) == '1' && (int)Integer.toString(number).charAt(2) >= 51
					&& (int)Integer.toString(number).charAt(2) <= 57)
				return ones[number / 100] + " hundred " + tenprefixes[number % 100 % 10] +
						tensuffixes[number % 100 % 10];
			else return ones[number / 100] + " hundred " + tenprefixes2[number / 10 % 10] +
					tens[number / 10 % 10] + " " + ones2[number % 100 % 10];
		}
		else return "Wrong number format";
    }
    public static void main(String[] args){
        int number = 531;
		System.out.println("Result: " + task57.numToEng(number));
    }
}
