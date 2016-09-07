import java.util.*;
class factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=fact(a);
System.out.println(b);
}
public static int fact(int m)
{
if(m==1)
return 1;
else
return m*fact(m-1);
}
}
