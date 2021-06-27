import java.util.*;

class ArrayDemo
{
	public int OddMult(int Arr[])
	{
		int i=0,iMult=1;
		
		for(i=0;i<Arr.length;i++)
		{
			if(((Arr[i]%2)!=0)  && (Arr[i]!=0))
			{
				iMult=iMult*Arr[i];
			}
		}
		
		return iMult;
	}
}
class Asg46Prog5
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
		
		int iRet=obj.OddMult(Arr);
		
		System.out.println("Multiplication of Odd Elements"+iRet);
	}

}