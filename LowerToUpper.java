
public class LowerToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I love YOU my SON ";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				t=t+(char)(s.charAt(i)+32);
			}
			else if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				t=t+(char)(s.charAt(i)-32);
			}
			else
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
