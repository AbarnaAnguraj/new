import java.util.*;
public class maxocc {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(s.nextInt());
		}
	      int curr = 0;
	      Set<Integer> unique = new HashSet<Integer>(al);

	          for (Integer key : unique) {
	                curr = Collections.frequency(al, key);
	                if(curr>1)
	                {
	                	System.out.println(key);
	                }
	            }

	          
	}

}
