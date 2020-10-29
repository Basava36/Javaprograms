
public class AlphabetCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="zxcvb4567!@# FSDGHCVBN^%&*345609";
		int c=0;
		int k=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>=65&&s.charAt(i)<=90)
			{
				c=c+1;
			}
			else if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				k=k+1;
				
			}
		}
		System.out.println("C :"+c+" S :"+k);
	}

}
