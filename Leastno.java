import java.util.*;
public class Leastno {
public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		String a=String.valueOf(n);
	    char[] b=a.toCharArray();
	    Arrays.sort(b);
	    a=new String(b);
	    StringBuffer sb=new StringBuffer(a);
	    int c=a.length()-k;
	    sb.delete(c, a.length());
	    a=sb.toString();
	    n=Integer.parseInt(a);
	    System.out.println(n);
	}
}
