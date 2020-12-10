public class task52 {
    public static boolean canMove(String figure, String cell1, String cell2)
	{
		if (figure == "Pawn")
		{
			if (cell1.charAt(0) == cell2.charAt(0) && Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) == 1)
				return true;
			else return false;
		}
		else if (figure == "Rook")
		{
			if (cell1.charAt(0) == cell2.charAt(0) || cell1.charAt(1) == cell2.charAt(1))
				return true;
			return false;
		}
		else if (figure == "King")
		{
			if (Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) <= 1 && 
					Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) <= 1)
				return true;
			else
				return false;
		}
		else if (figure == "Bishop")
		{
			if (Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) ==
					Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)))
				return true;
			else return false;
		}
		else if (figure == "Queen")
		{
			if ((cell1.charAt(0) == cell2.charAt(0) || cell1.charAt(1) == cell2.charAt(1) ||
					Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) ==
					Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1))))
				return true;
			else return false;
		}
		else if (figure == "Horse")
		{
			if ((Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) == 1 &&  
					(Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) == 2)) ||
					(Math.abs((int)cell1.charAt(0) - (int)cell2.charAt(0)) == 2 &&  
					(Math.abs((int)cell1.charAt(1) - (int)cell2.charAt(1)) == 1)))
				return true;
			else return false;
		}
		return false;
    }
    public static void main(String[] args){
    String figure = "Horse";
		String cell1 = "H8";
		String cell2 = "G7";
        System.out.println("Result: " + task52.canMove(figure, cell1, cell2));
    }
}
