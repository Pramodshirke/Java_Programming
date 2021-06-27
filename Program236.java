//Accept String From user and count words from it
import java.util.*;
class Demo
{
	public void EvenWord(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		int Max=arr[0].length();
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			StringBuffer bobj=new StringBuffer(arr[i]);
			System.out.println(bobj.reverse());
			bobj=null;
		}
	}
}
class Program236
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