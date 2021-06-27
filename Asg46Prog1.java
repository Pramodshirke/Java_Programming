import java.util.*;

class ArrayDemo
{
	public boolean Search(int Arr[],int iNo)
	{
		int i=0;
		
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i]==iNo)
			{
				break;
			}
		}
		if(i==Arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
class Asg46Prog1
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
		
		System.out.println("Enter Number To Search");
		int No=sobj.nextInt();
		
		ArrayDemo obj = new ArrayDemo();
		
		boolean bRet=obj.Search(Arr,No);
		
		if(bRet==true)
		{
			System.out.println("Number is Present");
		}
		else
		{
			System.out.println("Number is not Present");
		}
	}
}