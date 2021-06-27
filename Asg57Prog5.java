import java.util.*;
class Demo
{
	public void Pattern(int iRow,int iCol)
	{
		for(int i=0;i<=iRow;i++)
		{
			for(int j=0;j<=iCol;j++)
			{
				if((i==0) || (j==0) || (i==iRow) || (j==iCol) || (i==j))
				{
					System.out.print((j+1)+"\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
}
class Asg57Prog5
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter Number Of Rows");
		int iNo1=sobj.nextInt();
	
		System.out.println("Enter Number Of Columns");
		int iNo2=sobj.nextInt();
	
		Demo obj=new Demo();
	
		obj.Pattern(iNo1,iNo2);
	}
}