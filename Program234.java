//Accept String From user and count words from it
import java.util.*;
class Demo
{
	public void EvenWord(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		String temp2=null;
		int Max=arr[0].length();

		for(String s:arr)
		{
			if(s.length()> Max)
			{
				Max=s.length();
				temp2=s;
			}
		}
		System.out.println("Word is:"+temp);
	}
	
}
class Program234
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		
		Demo obj= new Demo();
		obj.EvenWord(str);
	}
}