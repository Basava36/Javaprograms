import java.util.Arrays;

public class CheckTwoArraysEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,2,1,3,4};
		int b[]=a.clone();
		if(Arrays.equals(a, b))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}

}
