import java.util.*;
import Marvellous.Matrix;

class Demo extends Matrix
{
	public Demo(int iRow,int iCol)
	{
		super(iRow,iCol);
	}
	public int Sum()
	{
		int iSum=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				if((i==0) || (i==Arr.length-1) || (j==0) || (j==Arr[i].length-1))
				{
					iSum = iSum+Arr[i][j];
				}
			}
		}
		return iSum;
	}	
	
}
class Program223
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
		int iRet=mobj.Sum();
		System.out.println("Sum is:"+iRet);
		System.gc();
	}
	
}