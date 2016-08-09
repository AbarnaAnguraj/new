import java.util.Scanner;


public class isalphab {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if(((int)a>65)&&((int)a<123))
		{
			System.out.println("Alphabet");
		}else
		{
			System.out.println("Not Alphabet");
		}
	}

}
