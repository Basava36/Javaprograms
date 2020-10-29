import java.util.Scanner;

public class LeftRotationNumberOfTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of rotations:");
		int n=s.nextInt();
		int a[]= {1,2,3,4};
		n=n%a.length;
		for(int k=0;k<n;k++)
		{
			int temp=a[0];
			for(int i=1;i<a.length;i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1]=temp;
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}

}
