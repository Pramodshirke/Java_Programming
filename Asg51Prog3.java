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
	
	public int Largest()
	{
		int iMax=Arr[0][0];
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				if((i==j) || ((i+j)==(Arr.length-1)))
				{
					if(Arr[i][j]>iMax)
					{
						iMax=Arr[i][j];
					}
				}
			}
		}
		return iMax;
	}
}

class Asg51Prog3
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Numnber of Rows");
		int row=sobj.nextInt();
		
		System.out.println("Enter  Number Of Columns");
		int col=sobj.nextInt();
		
		Matrix mobj=new Matrix(row,col);
		
		mobj.Accept();
		mobj.Display();
		
		int iRet=mobj.Largest();
		
		System.out.println("Largest Number is:"+iRet);
		
	}
}