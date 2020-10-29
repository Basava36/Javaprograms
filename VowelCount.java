
public class VowelCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Raja rammohan roy";
		int c=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				c=c+1;
			}
		}
		System.out.println(c);
	}

}
