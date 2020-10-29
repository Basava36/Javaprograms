
public class CapitalFirstCharInSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="thIs iS mY cLaSs rOoM";
		String t1="";
		String a[]=s.split(" ");
		for(int i=0;i<=a.length-1;i++)
		{
			String t=a[i];
			String fh=t.substring(0, 1);
			String sh=t.substring(1);
			fh=fh.toUpperCase();
			sh=sh.toLowerCase();
			t1=t1+fh+sh+" ";
		}
		System.out.println(t1);
	}

}
