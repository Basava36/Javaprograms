
public class ReverseString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123";
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		int n=Integer.valueOf(""+sb);
		System.out.println(n+1);
	}

}
