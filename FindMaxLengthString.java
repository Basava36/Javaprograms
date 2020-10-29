
public class FindMaxLengthString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ab a  abc abcd";
		String a[]=s.split(" ");
		int max=a[0].length();
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i].length()>max)
			{
				max=a[i].length();
			}
		}
		System.out.println(max);
	}

}
