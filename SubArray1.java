
public class SubArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int a[]= {0,1,2,3,4,5,6};
		for(int i=0;i<=a.length-k;i++)
		{
			for(int j=i;j<i+k;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
