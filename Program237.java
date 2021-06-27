//Input: Hello World
//Output: olleH dlroW
import java.util.*;
class Demo
{
	public String ReverseWord(String str)
	{
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		String arr[]=temp.split(" ");
		String output=" ";

		for(int i=0;i<arr.length;i++)
		{
			StringBuffer bobj=new StringBuffer(arr[i]);
			output=output +" "+ bobj.reverse();
			bobj=null;
		}
		return output.trim();
	}
}
class Program237
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		
		Demo obj= new Demo();
		String ret=obj.ReverseWord(str);
		System.out.println(ret);
	}
}