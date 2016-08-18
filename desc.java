

import java.util.*;

public class desc {

	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     ArrayList a=new ArrayList();
     for(int i=0;i<n;i++)
     {
    	 a.add(s.nextInt());
     }
     Collections.sort(a,Collections.reverseOrder());
     java.util.Iterator it =a.iterator();
     while(it.hasNext())
     {
    	 System.out.println(it.next());
     }
	}

}
