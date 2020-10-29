
public class KthSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abcdefghij";
		int k=4;
		for(int i=0;i<=s.length()-k;i++)
		{
			System.out.println(s.substring(i, i+k));
		}
	}

}
