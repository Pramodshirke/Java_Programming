import java.util.*;
class IPPackUnpack
{
	public int Packing(int no1,int no2,int no3,int no4)
	{
		return (no1<<24) | (no2<<16) | (no3<<8) | (no4);
	}
	public void Unpacking(int no)
	{
		int no1,no2,no3,no4;
		
		no1 = no & 0x000000ff;
		no2=no>>8;
		no2 = no2 & 0x000000ff;
		no3=no>>16;
		no3 = no3 & 0x000000ff;
		no4=no>>24;
		System.out.println("First Number:"+no1);
		System.out.println("Second Number:"+no2);
		System.out.println("Third Number:"+no3);
		System.out.println("Fourth Number:"+no4);
	}
}
class Program212
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
		
		obj.Unpacking(ret);
	}
}