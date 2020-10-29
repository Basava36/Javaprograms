
public class CapitalFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aPPlE";
		String fh=s.substring(0, 1);
		String sh=s.substring(1);
		fh=fh.toUpperCase();
		sh=sh.toLowerCase();
		System.out.println(fh+sh);
	}

}
