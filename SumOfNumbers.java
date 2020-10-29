
public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4127;
		int res=sum(n);
		System.out.println(res);
	}
	static int sum(int n)
	{
		if(n==0) {
			return 0;
		}
		else
		{ 
			return n%10+sum(n/10);
		}
	}

}
