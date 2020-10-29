
public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aebzabezazz";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(t.contains(""+s.charAt(i)))
			{
				
			}
			else
			{
				t=t+s.charAt(i);
			}
		}
		System.out.print(t);
	}

}
