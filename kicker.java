import java.util.Scanner;


public class kicker {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean b = false;
		int a=(int)Math.sqrt(n);
		if(a*a==n)
		{
			b=true;
		}
		System.out.println(b);
	}

}
