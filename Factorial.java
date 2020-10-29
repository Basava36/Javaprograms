import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mul=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a num:");
		int n=s.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			mul=mul*i;
		}
		System.out.println(mul);
	}

}
