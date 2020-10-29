
public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7,count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		if (count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
	}

}
