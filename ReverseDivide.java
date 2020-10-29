
public class ReverseDivide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=1234;
		int n2=6789;
		String s=""+n1;
		String t=""+n2;
		String s1="";
		String s2="";
		for(int i=s.length()-1;i>=0;i--)
		{
			s1=s1+s.charAt(i);
		}
		for(int i=t.length()-1;i>=0;i--)
		{
			s2=s2+t.charAt(i);
		}
		int a=Integer.valueOf(s1);
		int b=Integer.valueOf(s2);
		System.out.println(b-a);
	}

}
