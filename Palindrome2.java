
public class Palindrome2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		if(s.contentEquals(sb))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
