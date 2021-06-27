import java.util.*;
class IPPackUnpack
{
	public int Packing(int no1,int no2,int no3,int no4)
	{
		return (no1<<24) | (no2<<16) | (no3<<8) | (no4);
	}
}
class Program211
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Please enter First number\n");
		int iNo1 = sobj.nextInt();
		
		System.out.println("Please enter Second Number\n");
		int iNo2 = sobj.nextInt();
		
		System.out.println("Please enter Third number\n");
		int iNo3 = sobj.nextInt();
		
		System.out.println("Please enter Fourth Number\n");
		int iNo4 = sobj.nextInt();
		
		IPPackUnpack obj=new IPPackUnpack();
		
		int ret=obj.Packing(iNo1,iNo2,iNo3,iNo4);
		
		System.out.println("Packed Number:"+ret);
	}
}