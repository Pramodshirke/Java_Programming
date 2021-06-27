import java.util.*;
class Demo
{
	public void Pattern(int iRow,int iCol)
	{
		for(int i=0;i<iRow;i++)
		{
			for(int j=iCol-1;j>=0;j--)
			{
				if((i==j) || (i==0) || (i==iRow-1) || (j==0) || (j==iCol-1))
				{
					System.out.print("*\t");
				}
				else if(i<j)
				{
					System.out.print("#\t");
				}
				else
				{
					System.out.print("@\t");
				}
				
			}
			System.out.println();
		}
	}
}
class Asg57Prog4
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