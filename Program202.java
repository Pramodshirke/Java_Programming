import java.util.*;

class Numbers
{
	public int Sum(int Arr[])
	{
		int iSum=0,iResult=0;

		for(int i=0;i<Arr.length;i++)
		{
			for(int iCnt=1;iCnt<Arr[i]/2;iCnt++)
			{
				if(Arr[i] % iCnt == 0)
				{
					iSum=iSum+iCnt;
				}
			}
			if(iSum==Arr[i])
			{
				iResult=iResult+Arr[i];
			}
		}
		return iResult;
	}
}
class Program202
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