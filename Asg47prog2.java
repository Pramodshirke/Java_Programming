import java.util.*;

class Digits
{
	int CountOdd(int iNo)
	{ 
		int iCnt=0,iDigit=0;
		
		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2 != 0)
			{
				iCnt++;
			}
			iNo=iNo/10;
		}
		return iCnt;
	}
}

class Asg47Prog2
{
	public static void main(String args[])
	{
		int iNo,ret;
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter Number:");
		iNo = sobj.nextInt();
		
		Digits dobj=new Digits();
		ret=dobj.CountOdd(iNo);
		
		System.out.println(ret);
	}
}