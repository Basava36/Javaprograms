
public class StringSplitReverseChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is my class room";
		String a[]=s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			StringBuffer sb=new StringBuffer(a[i]);
			System.out.print(sb.length()+""+sb.reverse()+" ");
		}
		System.out.println();
	}

}
