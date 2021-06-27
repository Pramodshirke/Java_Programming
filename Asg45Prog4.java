import java.util.*;

class Digits
{
	int MultDigit(int iNo)
	{ 
		int iMult=1;
		
		while(iNo>0)
		{
			if((iNo%10)!=0)
			{
				iMult=iMult*(iNo%10);
			}
			iNo=iNo/10;
		}
		return iMult;
	}
}

class Asg45Prog4
{
	public static void main(String args[])
	{
		int iNo,ret;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter Number:");
		iNo = sobj.nextInt();
		
		Digits dobj=new Digits();
		ret=dobj.MultDigit(iNo);
		
		System.out.println("Multiplication Of All Digits:"+ret);
	}
}