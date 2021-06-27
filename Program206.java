import java.util.*;

class StringX
{
	public int CountCap(String str)
	{
		char arr[]=str.toCharArray();
		int iCnt=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='A') && (arr[i]<='Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
}
class Program206
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		
		String str = sobj.nextLine();
		
		StringX obj=new StringX();
		int iRet=obj.CountCap(str);
		
		System.out.println("Capital Letters Are:"+iRet);
	}
}
