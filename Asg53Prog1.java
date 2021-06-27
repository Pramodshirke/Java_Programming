import java.util.*;
class Demo
{
	public void Pattern(int iRow,int iCol)
	{
		char ch='A';
		
		for(int i=0;i<iRow;i++)
		{
			char ch='A';
			for(int j=0;j<iCol;j++)
			{
				System.out.print(ch+"\t");
				ch++;
			}
			System.out.println();
		}
	}
}
class Asg53Prog1
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