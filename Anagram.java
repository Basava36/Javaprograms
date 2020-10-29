import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="listen";
		String s2="silent";
		s1=s1.replaceAll(" ", "");
		s2=s2.replaceAll(" ", "");
		if(s1.length()==s2.length())
		{
			s1=s1.toUpperCase();
			s2=s2.toUpperCase();
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			s1=new String(c1);
			s2=new String(c2);
			if(s1.equals(s2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not anagram");
			}
		}
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}
