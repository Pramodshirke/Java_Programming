import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public void Maximum()
	{
		int iMax=Arr[0][0];
		
		for(int i=0;i<Arr.length;i++)
		{
			iMax=Arr[i][0];
			for(int j=0;j<Arr[i].length;j++)
			{
				if(Arr[i][j]>iMax)
				{
					iMax=Arr[i][j];
				}
			}
			System.out.println("Max is:"+iMax);
		}
	}	
	
}
class Program221
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
		mobj.Maximum();

		System.gc();
	}
	
}