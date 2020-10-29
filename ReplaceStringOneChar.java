
public class ReplaceStringOneChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="my name is ram";
		String a[]=s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			String t=a[i];
			char c=t.charAt(t.length()-1);
			System.out.print(c+t.substring(1)+" ");
		}
	}

}
