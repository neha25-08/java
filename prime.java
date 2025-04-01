import java.util.*;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==1||a==0)
		{
			System.out.println("Given no. is not prime");
			return;
		}
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("Given no. is not prime");
				return;
			}
		}
		
			System.out.println("Given no. is prime");
	}
}
