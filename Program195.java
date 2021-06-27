import java.util.*;

class Program195
{
	public static void main(String args[])
	{
		int iNo1,iNo2,ans;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter First Number\n");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter Second Number\n");
		iNo2 = sobj.nextInt();
		
		ans = iNo1 + iNo2;
		
		System.out.println("Addtion is : "+ans);
	}
}