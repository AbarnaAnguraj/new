import java.util.Scanner;


public class happy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int m,sum=0,n=a;
		while(a>9)
		{
		while(a!=0)
		{
			m=a%10;
		   sum=sum+m*m;
			a=a/10;
		}
		a=sum;
		sum=0;
		}
		if(a==1)
		{
		System.out.println(n+" is happy number");
		}else
			System.out.println(n+" is not happy number");
		}

}
