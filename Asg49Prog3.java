import java.util.*;

class Demo
{
	public boolean StrCmpX(String str1,String str2,int iNo)
	{
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();
		int i=0;

		for(i=0;i<=iNo;i++)
		{
			if(Arr[i] != Brr[i])
			{
				break;
			}
		}
		
		if(i==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Asg49Prog3
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		String str1=sobj.nextLine();
		
		System.out.println("Enter Stirng");
		String str2=sobj.nextLine();
		
		System.out.println("Enter Number to Compare");
		int No=sobj.nextInt();
		
		Demo obj= new Demo();
		boolean bRet=obj.StrCmpX(str1,str2,No);
		
		if(bRet==true)
		{
			System.out.println("Strings Are Equal");
		}
		else
		{
			System.out.println("Strings Are Not Equal");
		}
	}
}