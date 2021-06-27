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
	
	public void Transpose()
	{
		int temp=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				if(i<j)
				{
					temp=Arr[i][j];
					Arr[i][j]=Arr[j][i];
					Arr[j][i]=temp;
				}
			}
		}
	}
}

class Asg52Prog1
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
		
		mobj.Transpose();
		mobj.Display();
	}
}