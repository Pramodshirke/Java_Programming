//Accept String From user and count words from it
import java.util.*;

class Program225
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		System.out.println("String length is:"+str.length());
		String temp=str.trim();
		System.out.println("New String is:"+temp);
		System.out.println("String length is:"+temp.length());
		String temp2=temp.replaceAll("\\s","");
		System.out.println("New String is:"+temp2);
	}
	
}