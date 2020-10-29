import java.util.Arrays;

public class SortArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="meena mamatha reshma shilpa swetha bhavana kavitha gayathri gamya meghana Anusha Keerthana";
		String a[]=s.split(" ");
		Arrays.sort(a);
		for(String e:a)
		{
			System.out.println(e);
		}
	}
}
