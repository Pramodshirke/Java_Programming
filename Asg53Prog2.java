import java.util.*;
class Demo
{
	public void Pattern(int iRow,int iCol)
	{
		char ch1='A',ch2='a';
		
		for(int i=0;i<iRow;i++)
		{
			ch1='A';
			ch2='a';
			for(int j=0;j<iCol;j++)
			{
				if(i%2==0)
				{
					System.out.print(ch1+"\t");
					ch1++;
				}
				else
				{
					System.out.print(ch2+"\t");
					ch2++;
				}
			}
			System.out.println();
		}
	}
}
class Asg53Prog2
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