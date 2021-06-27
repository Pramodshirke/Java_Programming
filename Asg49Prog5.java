import java.util.*;

class Demo
{
	public String StrTogX(String str)
	{
		char ch=str.toLowerCase();
		char Arr[] = str.toCharArray();
		int i=0;
		String output="";

		
		for(i=Arr.length-1;i>0;i--)
		{
			output=output+Arr[i];
		}
		return output;
	}
}
class Asg49Prog5
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		String str=sobj.nextLine();
	
		Demo obj= new Demo();
		String ret=obj.StrTogX(str);
		
		System.out.println("Reversed Stirng is:"+ret);
		
	}
}