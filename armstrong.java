import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=a;
		int sum=0;
		while(b!=0)
		{
			int rem=b%10;
			sum+=rem*rem*rem;
			b=b/10;
		}
		if(sum==a)
			System.out.println("Given no. is armstrong");
		else
			System.out.println("Given no. is not armstrong");

		
	}
}
