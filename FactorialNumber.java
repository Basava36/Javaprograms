import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=s.nextInt();
		int res=factorial(n);
		System.out.println(res);
	}
	static int factorial(int n)
	{
		if(n==0)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
		
	}

}
