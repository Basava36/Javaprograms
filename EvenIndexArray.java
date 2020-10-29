
public class EvenIndexArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,1,2,4,6,8};
		for(int i=0;i<=a.length-1;i++)
		{
			if(i%2==0)
			{
				System.out.println(a[i]);
			}
		}
	}

}
