
public class SumStringNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sfdg324 678m,jhj9832q";
		int sum=0;
		for(int i=0;i<=s.length()-1;i++) 
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				sum=sum+s.charAt(i)-48;	
			}
		}
		System.out.println(sum);
	}

}
