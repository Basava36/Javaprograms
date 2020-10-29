import java.util.Scanner;

public class ReverseString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter s string:");
		String s=sc.next();
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}

}
