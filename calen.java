
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;


public class calen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		SimpleDateFormat myFormat = new SimpleDateFormat("dd mm yyyy");
		String is1 = s.nextLine();
		String is2 = s.nextLine();

		try {
		    Date date1 = myFormat.parse(is1);
		    Date date2 = myFormat.parse(is2);
		    long diff = date2.getTime() - date1.getTime();
		    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (ParseException e) {
		    e.printStackTrace();
		}

		  }
	}

