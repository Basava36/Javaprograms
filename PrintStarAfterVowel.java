
public class PrintStarAfterVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love my daughter";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				t=t+s.charAt(i)+"*";
			}
		}
		System.out.println(t);
	}

}
