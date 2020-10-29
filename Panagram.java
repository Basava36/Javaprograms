
public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="QWERTYUIOPASDFGHJKLZXCVBNM";
		int c=1;
		for(char i='A';i<='Z';i++)
		{
			if(s.contains(""+i))
			{
				
			}
			else
			{
				c++;
			}
		}
		if(c==1)
		{
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not a panagram");
		}
	}

}
