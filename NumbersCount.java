
public class NumbersCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sdfgh4567 mngn7823ghj n09";
		int c=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
