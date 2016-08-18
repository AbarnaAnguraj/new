import java.util.Scanner;


public class nonrepeatation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	int b = 0;
	for(int i=0;i<n;i++)
	{
		b^=a[i];
	}
	System.out.println(b);
}
}
