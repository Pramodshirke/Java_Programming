import java.util.*;
// 927 -> 18 ->9

class Digits
{
	boolean Armstrong(int iNo)
	{ 
		int temp=iNo,iCnt=0,iDigit=0,iSum=0,iPower=1;
		
		while(temp != 0)
		{
			temp=temp/10;
			iCnt++;
		}
		temp=iNo;
		
		while(temp != 0)
		{
			iDigit=temp%10;
			
			for(int i=1;i<=iCnt;i++)
			{
				iPower=iPower*iDigit;
			}
			iSum = iSum+iPower;
			iPower=1;
			temp=temp/10;
		}
		if(iSum==iNo)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Program200
{
	public static void main(String args[])
	{
		int iNo;
		boolean bret;
		
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter Number:");
		iNo = sobj.nextInt();
		
		Digits dobj=new Digits();
		bret=dobj.Armstrong(iNo);
		
		if(bret== true)
		{
			System.out.println("Number is Armstrong");
		}
		else
		{
			System.out.println("Number is not Armstrong");
		}
		
	}
}