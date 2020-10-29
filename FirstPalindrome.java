
public class FirstPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="12112";
		for(int k=2;k<=s.length();k++)
		{
			for(int i=0;i<=s.length()-k;i++)
			{
				String t=s.substring(i, i+k);
				StringBuffer sb=new StringBuffer(t);
				if(t.equals(""+sb.reverse()))
				{
					System.out.println(t);
					System.exit(0);
				}
			}
		}
	}

}
