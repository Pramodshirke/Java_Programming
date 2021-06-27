import java.util.*;

class StringDemo
{
	public int Count(String str)
	{
		char arr[]=str.toCharArray();
		int iCnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a') && (arr[i]<='z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}
class Asg43Prog2
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Please enter string");
		String str1 = sobj.nextLine();
		
		StringDemo obj=new StringDemo();
		
		int iRet=obj.Count(str1);
		
		System.out.println("Small Characters are:"+iRet);
	}
}