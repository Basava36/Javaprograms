import java.util.Scanner;

public class Prime3 {
	static int pc=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter starting number:");
		int sn=s.nextInt();
		System.out.println("enter range:");
		int rn=s.nextInt();
		Prime3 p=new Prime3();
		for(int i=sn;pc<=rn;i++)
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
			pc++;
		}
	}

}
