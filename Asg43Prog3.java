import java.util.*;

class StringDemo
{
	int CountDiff(String str)
	{
		char arr[]=str.toCharArray();
		int iCnt1=0,iCnt2=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a') && (arr[i]<='z'))
			{
				iCnt1++;
			}
			if((arr[i]>='A') && (arr[i]<='Z'))
			{
				iCnt2++;
			}
		}
		return iCnt1-iCnt2;
	}
}
class Asg43Prog3
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Please enter string");
		String str1 = sobj.nextLine();
		
		StringDemo obj=new StringDemo();
		
		int iRet=obj.CountDiff(str1);
		
		System.out.println("Diffrence From Small and Capital are:"+iRet);
	}
}