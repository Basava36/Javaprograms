import java.util.Arrays;

public class SortStartEndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,9,3,2,1,8,4,6,7,5};
		Arrays.sort(a,2,a.length);
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}

}
