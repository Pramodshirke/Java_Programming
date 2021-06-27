import java.util.*;
class Matrix
{
	public int Arr[][];
	
	public Matrix(int iRow,int iCol)
	{
		Arr=new int[iRow][iCol];
	}
	protected void finalize()
	{
		Arr=null;
	}
	
	public void Accept()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter Elements");
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				Arr[i][j]=sobj.nextInt();
			}
		}
	}
	
	public void Display()
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Entered Elements Are:");
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				System.out.print(Arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public int Frequency(int iNo)
	{
		int iCnt=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				if(Arr[i][j]==iNo)
				{
					iCnt++;
				}
			}
		}
		return iCnt;
	}
}

class Asg51Prog2
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Numnber of Rows");
		int row=sobj.nextInt();
		
		System.out.println("Enter  Number Of Columns");
		int col=sobj.nextInt();
		
		System.out.println("Enter Element to Search");
		int iNo=sobj.nextInt();
		
		Matrix mobj=new Matrix(row,col);
		
		mobj.Accept();
		mobj.Display();
		
		int iRet=mobj.Frequency(iNo);
		
		System.out.println("Frequency of Elements is:"+iRet);
		
	}
}