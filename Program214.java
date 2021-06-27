import java.util.*;

class Matrix
{
	public int Addition(int Arr[][])
	{
		int iSum=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				iSum=iSum + Arr[i][j];
			}
		}
		return iSum;
	}
}
class Program214
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number Of Rows");
		int row = sobj.nextInt();
		System.out.println("Enter Number of Columns");
		int col = sobj.nextInt();
		
		int Arr[][] = new int[row][col];
		
		System.out.println("Enter Elements");
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr[i].length;j++)
			{
				Arr[i][j] =sobj.nextInt();
			}
		}
		
		Matrix mobj=new Matrix();
		
		int iRet=mobj.Addition(Arr);
		
		System.out.println("Addtion of all Elements is : "+iRet);
		Arr=null;
	}
	
	
}