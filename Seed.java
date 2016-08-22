import java.util.Scanner;


public class Seed {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int n=x,m=0,p=1;
		while(n!=0)
		{
		m=n%10;
		p*=m;
		n=n/10;
		}
		if(y==(x*p))
		{
			System.out.println(x+" is the seed of "+y);
		}else
		{
			System.out.println(x+" is not the seed of "+y);
		}

	}

}
