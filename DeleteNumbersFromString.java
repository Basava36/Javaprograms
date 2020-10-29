
public class DeleteNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sg345 768nbmkl 98043 gjk094";
		String t="";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
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
