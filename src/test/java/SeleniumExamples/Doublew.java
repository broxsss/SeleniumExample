package SeleniumExamples;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class Doublew {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Double d = new Double(4.9090067E7);
		int i = d.intValue();
		System.out.println(i);
		
		String date_s = "Wed Jun 01 05:30:00 IST 2005";

        // *** note that it's "yyyy-MM-dd hh:mm:ss" not "yyyy-mm-dd hh:mm:ss"  
		SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
        Date date = dateFormat.parse(date_s);
        System.out.println(date);
        SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dt1.format(date));
        
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
        	format.setTimeZone(TimeZone.getTimeZone("UTC"));
        	String dat = "2017-06-05T08:07:34.000Z";
        	Date datesss = format.parse(dat);
        	DateFormat converters = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
            converters.setTimeZone(TimeZone.getTimeZone("GMT"));
            System.out.println("time in GMT : " + converters.format(datesss));
        
        //Date localTime = new Date(); 
      //  SimpleDateFormat dateFormat1 = new SimpleDateFormat("YYYY-MM-DDThh:mm:ssTZD");
        
        String dates = "Tue Apr 13 02:40:25 IST 2021";
        Date datess = dateFormat.parse(dates);        
        DateFormat converter = new SimpleDateFormat("yyyy-MM-dd");
        converter.setTimeZone(TimeZone.getTimeZone("GMT"));
        System.out.println("time in GMT : " + converter.format(datess));
      //  SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
       // System.out.println(dt1.format(datess));
        
        Collection<String> listOne = Arrays.asList("milan","iga",
                "dingo","iga",
                "elpha","iga",
                "hafil","iga",
                "meat","iga", 
                "neeta.peeta","iga");

Collection<String> listTwo = Arrays.asList("hafil",
                 "iga",
                 "binga", 
                 "mike", 
                 "dingo","dingo","dingo");

Collection<String> similar = new HashSet<String>( listOne );
System.out.println(similar);
Collection<String> different = new HashSet<String>();
different.addAll( listOne );
different.addAll( listTwo );

System.out.println(different);

similar.retainAll( listTwo );
different.removeAll( similar );


System.out.printf("One:%s%nTwo:%s%nSimilar:%s%nDifferent:%s%n", listOne, listTwo, similar, different);

SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
String inputString1 = "2008-05-07";
String inputString2 = "2021-04-12";

try {
    Date date1 = myFormat.parse(inputString1);
    Date date2 = myFormat.parse(inputString2);
    long diff = date2.getTime() - date1.getTime();
    System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
} catch (ParseException e) {
    e.printStackTrace();
}

        
        
   
        
	}

}
