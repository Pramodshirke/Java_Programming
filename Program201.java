import java.util.*;

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum=0;
		for(int i=0;i<Arr.length;i++)
		{
			iSum=iSum+Arr[i];
		}
		return iSum;
	}
}
class Program201
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
		Numbers nobj = new Numbers();
		
		int iRet=nobj.Sum(Arr);
		
		System.out.println("Addtion of N Numbers"+iRet);
	}
}