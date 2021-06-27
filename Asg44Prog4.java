import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[])
	{
		int iSum1=0,iSum2=0;
		
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i] % 3 == 0) && (Arr[i]% 5 ==0))
			{
				System.out.println(Arr[i]);
			}
		}
	}
}
class Asg44Prog4
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize=0;
		
		System.out.println("Enter Number Of Elememts");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		System.out.println("Enter Elements");
		
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		ArrayDemo obj = new ArrayDemo();
		System.out.println("Numbers Divisible By 3 and 5 Are:");
		obj.Display(Arr);
		
	}
}