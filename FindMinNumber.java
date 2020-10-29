
public class FindMinNumber {
	public static void main(String args[])
	{
		int a[]= {3,5,1,4,2,0,-1};
		int min=a[0];
		for(int i=1;i<=a.length-1;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
}
