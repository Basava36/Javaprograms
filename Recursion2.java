
public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		print(n);
	}
	static void print(int k)
	{
		if(k>=1)
		{
			System.out.print(k+" ");
			print(k-1);
		}
	}

}
