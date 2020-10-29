import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="mother in law";
		String s2="hitler woman";
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		if(Arrays.equals(a1, a2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
		
	}

}
