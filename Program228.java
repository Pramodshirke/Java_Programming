//Accept String From user and count words from it
import java.util.*;

class Program228
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		
	    String str=sobj.nextLine();
		String temp=str.trim();
		String arr[]=temp.split("\\s");
		System.out.println("Number Of Words Are:"+arr.length);
	}
	
}