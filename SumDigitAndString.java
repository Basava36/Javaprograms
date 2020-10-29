
public class SumDigitAndString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sfdg324 678mms sajhj9832 q21fggf";
		int sum=0;
		String t="";
		for(int i=0;i<=s.length()-1;i++) 
		{
			if(s.charAt(i)>=48&&s.charAt(i)<=57)
			{
				sum=sum+s.charAt(i)-48;	
			}
			else if(s.charAt(i)>=97&&s.charAt(i)<=122)
			{
				t=t+s.charAt(i);
			}
		}
		System.out.println(sum+" "+t);
	}

}
