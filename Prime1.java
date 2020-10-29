import java.util.Scanner;

public class Prime1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=97;
		Prime1 p=new Prime1();
		p.isPermit(n);
	}
	void isPermit(int k)
	{
		int c=0;
		for(int i=1;i<=k;i++)
		{
			if(k%i==0)
			{
				c=c+1;
			}
		}
		if(c==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
