
public class DeleteSpaceLeftRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int si=0;
		int ei=0;
		String t="";
		String s="----I---love-you.----";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='-')
			{
				
			}
			else
			{
				si=i;
				break;
			}
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)=='-')
			{
				
			}
			else
			{
				ei=i;
				break;
			}
		}
		for(int i=si;i<=ei;i++)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}

}
