
public class PrintStarBeforeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="--I-LIKE----APPLES";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='-')
			{
				t=t+"*"+s.charAt(i);
			}
			else
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(t);
	}

}
