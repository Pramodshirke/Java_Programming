//Accept String From user and count words from it
import java.util.*;
class Demo
{
	public int WordCount(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		return arr.length;
	}
}
class Program230
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		
		Demo obj= new Demo();
		int ret=obj.WordCount(str);
		
		System.out.println("Word Count is:"+ret);
	}
}