
public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
