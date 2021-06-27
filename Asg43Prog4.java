import java.util.*;

class StringDemo
{
	boolean Vowels(String str)
	{
		char arr[]=str.toCharArray();
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]=='a')||(arr[i]=='A')||(arr[i]=='e')||(arr[i]=='E')||(arr[i]=='i')||(arr[i]=='I')||(arr[i]=='O')||(arr[i]=='O')||(arr[i]=='u')||(arr[i]=='U'))
			{
				break;
			}
		}
		if(i==arr.length)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
}
class Asg43Prog4
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
	
		System.out.println("Please enter string");
		String str1 = sobj.nextLine();
		
		StringDemo obj=new StringDemo();
		
		boolean bRet=obj.Vowels(str1);
		
		if(bRet==true)
		System.out.println("Vowel is Present");
		else
		System.out.println("Vowel is not present");
	}
}