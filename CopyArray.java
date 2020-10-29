
public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,2,1,4};
		int b[]=new int[a.length];
		for(int i=0;i<=a.length-1;i++)
		{
			b[i]=a[i];
		}
		for(int e:b)
		{
			System.out.print(e+" ");
		}
	}

}
