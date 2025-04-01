import java.util.*;
class swap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Before swap");
		System.out.println("value of a "+ a+"value of b "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swap");
		System.out.println("value of a "+ a+"value of b "+b);
	}
}
