
public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i love my friends. Because of they are my friends";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)==' ')
			{
				
			}
			else
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
