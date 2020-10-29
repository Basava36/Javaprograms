
public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12;
		int b=20;
		for(int i=a;i>=1;i--)
		{
			if(a%i==0&&b%i==0)
			{
				System.out.println(i);
				break; 
			}
		}
	}

}
