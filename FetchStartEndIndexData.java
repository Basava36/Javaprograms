import java.util.Arrays;

public class FetchStartEndIndexData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int b[]=Arrays.copyOfRange(a, 3,a.length);
		for(int e:b)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}

}
