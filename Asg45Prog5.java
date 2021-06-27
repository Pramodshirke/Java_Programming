import java.util.*;

class Digits
{
	int MultDigit(int iNo)
	{ 
		int iSum1=0,iSum2=0;
		
		while(iNo>0)
		{
			if((iNo%10)%2==0)
			{
				iSum1=iSum1+(iNo%10);
			}
			else
			{
				iSum2=iSum2+(iNo%10);
			}
			iNo=iNo/10;
		}
		return iSum1-iSum2;
	}
}

class Asg45Prog5
{
	public static void main(String args[])
	{
		int iNo,ret;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter Number:");
		iNo = sobj.nextInt();
		
		Digits dobj=new Digits();
		ret=dobj.MultDigit(iNo);
		
		System.out.println("Sum is:"+ret);
	}
}