import java.util.Scanner;

public class Balanced {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		String b[]=a.split(" ");
		int count = 0,d = 0;
		for(String c:b)
		{String e=c;
			c=c.replaceAll("[n-zN-Z]", "!");
			d=c.replace("!", "").length();
			count=c.length()-d;
			if(d==count)
			{
				System.out.println(e+" Balanced");
			}else
				System.out.println(e+" UnBalanced");
		}
		
	}

}
