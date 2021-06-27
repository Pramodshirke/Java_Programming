import java.util.*;

class ArrayDemo
{
	public void Display(int Arr[],int iStart,int iEnd)
	{
		int i=0;
		
		for(i=Arr.length-1;i>0;i--)
		{
			if((Arr[i]>iStart) && (Arr[i]<iEnd))
			{
				System.out.println(Arr[i]);
			}
		}
		
	}
}
class Asg48Prog4
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		int iSize=0;
		
		System.out.println("Enter Number Of Elememts");
		iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		System.out.println("Enter Elements");
		
		for(int i=0;i<Arr.length;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter Number To Find Frequency");
		int No1=sobj.nextInt();
		
		System.out.println("Enter Number To Find Frequency");
		int No2=sobj.nextInt();
		
		ArrayDemo obj = new ArrayDemo();
		
		System.out.println("Numbers from"+No1+"and"+No2+"are");
		
		obj.Display(Arr,No1,No2);
	}

}