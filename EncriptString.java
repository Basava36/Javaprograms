import java.util.Scanner;

public class EncriptString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter a key:");
		int k=s1.nextInt();
		k=k%26;
		s1.nextLine();
		System.out.println("Enter a string:");
		String s=s1.nextLine();
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				if(s.charAt(i)+k<=122)
				{
					System.out.print((char)(s.charAt(i)+k));
				}
				else
				{
					System.out.print((char)(s.charAt(i)+k-26));
				}
			}
			else if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				if(s.charAt(i)+k<=90)
				{
					System.out.print((char)(s.charAt(i)+k));
				}
				else
				{
					System.out.print((char)(s.charAt(i)+k-26));
				}
			}
			else
			{
				System.out.print(s.charAt(i));
			}
		}
		System.out.println();
	}

}
