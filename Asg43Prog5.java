import java.util.*;

class StringDemo
{
	public void CountDiff(String str)
	{
		char arr[]=str.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
	}
}
class Asg43Prog5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Please enter string");
		String str1 = sobj.nextLine();
		
		StringDemo obj=new StringDemo();
		
		obj.CountDiff(str1);
	}
}