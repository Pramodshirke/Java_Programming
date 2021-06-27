import java.util.*;

class Pattern
{
	void Display(int iRow,int iCol)
	{
		int iNo=1;
		
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				if((i == 1) || (j==1) || (i==iRow) || (j==iCol))
				{
					System.out.print(iNo+"\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			iNo=iNo+2;
			System.out.println();
		}
	}
}

class Program198
{
	public static void main(String args[])
	{
		int iNo1,iNo2,ans;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter Number Of Rows:");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter Number Of Columns:");
		iNo2 = sobj.nextInt();
		
		Pattern pobj=new Pattern();
		pobj.Display(iNo1,iNo2);
	}
}