import java.util.*;

class Demo
{
	public String StrTogX(String str)
	{
		char Arr[] = str.toCharArray();
		int i=0;
		String output="";
		char ch;
		for(i=Arr.length-1;i>0;i--)
		{
			ch=Arr[i];
			
			if((Arr[i])>='A' && (Arr[i])<='Z')
			{
				output=ch.toLowerCase();
			}
			else if((Arr[i])>='a' && (Arr[i])<='z')
			{
				output=output + (Arr[i].toUpperCase());
			}
		}
		return output;
	}
}
class Asg49Prog4
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