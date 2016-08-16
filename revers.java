import java.util.*;
class revers
{

	public static void main(String[] args) throws java.lang.Exception
	{
		Scanner s=new Scanner(System.in);
		String a=s.next();
		StringBuffer sb=new StringBuffer(a);
		sb=sb.reverse();
a=sb.toString();	
System.out.println(a);
a=a.replaceAll("([aeiouAEIOU])","")	;
System.out.println(a);
	}

}
