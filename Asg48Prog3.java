import java.util.*;

class ArrayDemo
{
	public int LastOcc(int Arr[],int iNo)
	{
		int i=0;
		
		for(i=Arr.length-1;i>0;i--)
		{
			if(Arr[i]==iNo)
			{
				break;
			}
		}
		
		if(i==0)
		{
			return -1;
		}
		else
		{
			return i+1;
		}
	}
}
class Asg48Prog3
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
		
		System.out.println("Enter Number To Find Frequency");
		int No=sobj.nextInt();
		
		ArrayDemo obj = new ArrayDemo();
		
		int iRet=obj.LastOcc(Arr,No);
		
		System.out.println("Last Occurence is"+iRet);
	}

}