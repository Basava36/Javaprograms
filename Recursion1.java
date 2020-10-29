
public class Recursion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print(1);
	}
	static void print(int i)
	{
		if(i<=10)
		{
			System.out.print(i+" ");
			print(i+1);
		}
	}

}
