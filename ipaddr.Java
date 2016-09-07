import java.util.Scanner;


public class ipaddr {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		a=a.replaceAll("(\\d{3})", "$1.");
		System.out.println(a);
	}

}
