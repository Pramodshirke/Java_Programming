//Accept String From user and count words from it
import java.util.*;
class Demo
{
	public void EvenWord(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		
		for(String s:arr)
		{
			if((s.length()%2)==0)
			{
				System.out.println(s);
			}
		}
	}
}
class Program233
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