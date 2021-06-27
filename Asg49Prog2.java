import java.util.*;

class Demo
{
	public boolean StrCmpX(String str1,String str2)
	{
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();
		int i=0;
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		for(i=0;i<str1.length();i++)
		{
			if(Arr[i] != Brr[i])
			{
				break;
			}
		}
		
		if(i==Arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Asg49Prog2
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		String str1=sobj.nextLine();
		
		System.out.println("Enter Stirng");
		String str2=sobj.nextLine();
		
		Demo obj= new Demo();
		boolean bRet=obj.StrCmpX(str1,str2);
		
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