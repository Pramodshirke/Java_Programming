import java.util.*;
// 927 -> 18 ->9

class Digits
{
	int GenRoot(int iNo)
	{ 
		int iSum=iNo;
		while(iSum > 9)
		{
			iNo=iSum;
			iSum=0;
			while(iNo!=0)
			{
				iSum=iSum+(iNo%10);
				iNo=iNo/10;
			}
		}
		return iSum;
	}
}

class Program199
{
	public static void main(String args[])
	{
		int iNo,ret;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter Number:");
		iNo = sobj.nextInt();
		
		Digits dobj=new Digits();
		ret=dobj.GenRoot(iNo);
		
		System.out.println(ret);
	}
}