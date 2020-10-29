
public class StringSplitReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="this is my class room";
		String a[]=s.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}

}
