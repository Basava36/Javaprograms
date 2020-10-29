
public class SortArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {7,4,2,6,5,1,3};
		for(int i=0;i<=a.length-2;i++)
		{
			for(int j=i+1;j<=a.length-1;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int e:a)
		{
			System.out.print(e);
		}
	}

}
