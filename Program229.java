//Accept String From user and count words from it
import java.util.*;

class Program229
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		System.out.println("String Length is:"+str.length());
		String temp=str.trim().replaceAll("[ ]{2,}"," ");
		System.out.println("New Stirng After Removing Space:"+temp.length());
		System.out.println("MOdified String is:"+temp);
	}
}