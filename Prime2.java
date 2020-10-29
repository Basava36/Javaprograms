import java.util.Scanner;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting number:");
		int sn=s.nextInt();
		System.out.println("enter ending number:");
		int en=s.nextInt();
		Prime2 p=new Prime2();
		for(int i=sn;i<=en;i++)
		{
			p.isPermit(i);
		}
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
			System.out.print(k);
		}
	}

}
