
import java.util.*;
class Demo
{
	public void LongWord(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		int Max=arr[0].length();
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()> Max)
			{
				Max=arr[i].length();
				index=i;
			}
		}
		System.out.println("Word is:"+arr[index]);
	}
	
}
class Program235
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		
		Demo obj= new Demo();
		obj.LongWord(str);
	}
}