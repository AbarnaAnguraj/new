import java.util.Scanner;


public class rev {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int m,rev=0;
		while(a!=0)
		{
			m=a%10;
			rev=rev*10+m;
			a=a/10;
		}
		System.out.println(rev);
	}
	

}
