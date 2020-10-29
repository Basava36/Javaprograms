
public class SubArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,2,3,4,5,6};
		for(int k=1;k<=a.length;k++)
		{
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

}
