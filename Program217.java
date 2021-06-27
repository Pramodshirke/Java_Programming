import java.util.*;
import Marvellous.Matrix;

class Program217
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number Of Rows");
		int row = sobj.nextInt();
		System.out.println("Enter Number of Columns");
		int col = sobj.nextInt();
		
		Matrix mobj=new Matrix(row,col);
		mobj.Accept();
		mobj.Display();
		
		System.gc();
	}
	
}