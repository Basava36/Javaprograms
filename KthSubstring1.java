
public class KthSubstring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1234";
		for(int k=1;k<=s.length();k++)
		{
			for(int i=0;i<=s.length()-k;i++)
			{
				System.out.println(s.substring(i, i+k));
			}
		}
	}

}
