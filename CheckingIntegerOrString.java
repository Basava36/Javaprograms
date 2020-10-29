
public class CheckingIntegerOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		String s="1abc 35cxbfzb";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				c++;
			}
		}
		if(c==s.length())
		{
			System.out.println("Integer");
		}
		else
		{
			System.out.println("String");
		}
	}

}
