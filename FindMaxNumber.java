
public class FindMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={4,3,2,1001,5,1,10,100};
		int max=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
	}

}
