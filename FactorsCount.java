import java.util.Scanner;

public class FactorsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}

}
