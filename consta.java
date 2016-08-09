import java.util.Scanner;


public class consta {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char a=s.next().charAt(0);
		if((int)a<97)
		{
			a=(char)((int)a+32);
		}
		if((a=='a')||(a=='e')||(a=='i')||(a=='o')||(a=='u'))
		{
		System.out.println("Vowels");	
		}
		else	
		System.out.println("consonant");

	}

}
