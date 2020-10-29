import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s string:");
		String s=sc.next();
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			t=s.charAt(i)+t;
		}
		System.out.println(t);
	}

}
