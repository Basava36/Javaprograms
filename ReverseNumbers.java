
public class ReverseNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		String s=""+n;
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		System.out.println(t);
	}

}
