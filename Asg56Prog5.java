import java.util.*;

class Demo
{
	public void Display(String str)
	{
		char Arr[]=str.toCharArray();
		
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<Arr.length;j++)
			{
				if((((i+j)<=8)&&(i>j)) || (i==j))
				{
					System.out.print(Arr[j]+"\t");
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
	}
}
class Asg56Prog5
{
	public static void main(String args[])
	{
		Scanner sobj=new Scanner(System.in);
	
		System.out.println("Enter String");
		String str=sobj.nextLine();
		
		Demo obj=new Demo();
		
		obj.Display(str);
	}
}