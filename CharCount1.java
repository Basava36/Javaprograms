
public class CharCount1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String s="Hello world";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='l')
			{
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
