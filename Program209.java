import java.util.*;

class StringX
{
	boolean CheckAnagram(String str1,String str2)
	{
		int Count[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		if(str1.length()!= str2.length())
		{
			return false;
		}
		char arr[]=str1.toCharArray();
		char brr[]=str2.toCharArray();
		
		for(i=0;i<arr.length;i++)
		{
			Count[arr[i]-'a']++;
			Count[brr[i]-'a']--;
		}
		
		for(i=0; i<26;i++)
		{
			if(Count[i] != 0)
			{
				break;
			}
		}
		
		if(i==26)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
class Program209
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter string");
		String str1 = sobj.nextLine();
		
		System.out.println("Please enter string");
		String str2 = sobj.nextLine();
		
		StringX obj=new StringX();
		boolean bRet=obj.CheckAnagram(str1,str2);
		
		if(bRet==true)
			System.out.println("Strings Are Anagram");
		else
			System.out.println("Strings are not Anagram");
	}
}
