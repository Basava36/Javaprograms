
public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			t=s.charAt(i)+t;
		}
		if(t.equals(s))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
