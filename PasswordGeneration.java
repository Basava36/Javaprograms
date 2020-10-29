import java.util.Scanner;

public class PasswordGeneration {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s="qwetyuiopasdfghjklzxcvbnm1234567890#$%^&*QWERTYUIOPASDFGHJKLZXCVBNM";
		String pwd="";
		System.out.println("Enter the length of password:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			int index=(int)(Math.random()*(s.length()));
			pwd=pwd+s.charAt(index);
		}
		System.out.println(pwd);
	}
}
