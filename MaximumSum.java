
public class MaximumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int sum=0;
		int a[]= {9,5,7,2,4,1,8,6,3};
		for(int k=1;k<=a.length;k++)
		{
			for(int i=0;i<=a.length-k;i++)
			{
				for(int j=i;j<i+k;j++)
				{
					sum=sum+a[j];
				}
				if(sum>max)
				{
					max=sum;
				}
				sum=0;
			}
		}
		System.out.println(max);
	}

}
