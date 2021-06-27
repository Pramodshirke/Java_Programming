import java.util.*;

class Demo
{
	public String ConcatX(String str1,String str2,int iNo)
	{
		String Output=str1+" ";
		char Brr[] = str2.toCharArray();
		int i=0;
		
		for(i=0;i<=iNo;i++)
		{
			Output=Output+Brr[i];
		}
		return Output;
	}
}
class Asg49Prog1
{
	public static void main(String strword[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter Stirng");
		String str1=sobj.nextLine();
		
		System.out.println("Enter Stirng");
		String str2=sobj.nextLine();
		
		System.out.println("Enter Number of letters to Concat");
		int No=sobj.nextInt();
		
		Demo obj= new Demo();
		String ret=obj.ConcatX(str1,str2,No);
		
		System.out.println("Concated String is:"+ret);
	}
}