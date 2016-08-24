import java.util.Scanner;


public class lcp {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b[]=a.split(" ");
		int min=a.length();
		String d="";StringBuffer e=new StringBuffer("");
		for(String c:b)
		{if(min>c.length())
		{
			d=c;
		}
			min=Math.min(min, c.length());
		}
		for(String c:b)
		{
			if(!c.substring(0,min).equals(d))
			{
				e=new StringBuffer(d);
				System.out.println(d);
				System.out.println(d.length()-1);
				e=e.deleteCharAt(d.length()-1);
				d=e.toString();
				min--;
			}
		}
		System.out.println(d);

	}

}
