
public class NumberToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		String t="";
		while(n>0)
		{
			int r=n%2;
			t=r+t;
			n=n/2;
		}
		System.out.println(t);
	}

}
