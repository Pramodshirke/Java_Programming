import java.util.*;

class Demo
{
	public void CharacterFrequency(String str)
	{
		char Arr[] = str.toCharArray();
		HashMap <Character,Integer> hobj = new HashMap<Character,Integer>();
		for(char ch : Arr)
		{
			if(hobj.containsKey(ch))
			{
				hobj.put(ch,hobj.get(ch)+1);
			}
			else
			{
				hobj.put(ch,1);
			}
		}
		System.out.println(hobj);
	}
}
class Program238
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		
		Demo obj= new Demo();
		obj.CharacterFrequency(str);
	}
}