import java.util.*;

class Mathematics
{
	int Addition(int x,int y)
	{
		return x+y;
	}
}
class Program197
{
	public static void main(String args[])
	{
		int iNo1,iNo2,ans;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter First Number\n");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter Second Number\n");
		iNo2 = sobj.nextInt();
		
		Mathematics mobj=new Mathematics();
		ans = mobj.Addition(iNo1,iNo2);
		
		System.out.println("Addtion is : "+ans);
	}
}