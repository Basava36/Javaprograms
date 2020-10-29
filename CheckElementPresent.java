import java.util.Arrays;

public class CheckElementPresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,60,70,80,100};
		int index=Arrays.binarySearch(a, 50);
		System.out.println(index);
	}

}
