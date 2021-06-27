import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public void SumRow()
	{
		int iSum=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			iSum=0;
			for(int j=0;j<Arr[i].length;j++)
			{
				iSum = iSum+Arr[i][j];
			}
			System.out.println("Sum of Row "+(i+1)+" is:"+iSum);
		}
	}	
	
}
class Program222
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter Number Of Rows");
		int row = sobj.nextInt();
		System.out.println("Enter Number of Columns");
		int col = sobj.nextInt();
		
		Demo mobj=new Demo(row,col);
		mobj.Accept();
		mobj.Display();
		mobj.SumRow();

		System.gc();
	}
	
}