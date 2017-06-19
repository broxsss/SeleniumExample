package com.Git.com.EGIT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;

public class HashMapSorting{

public static void main(String[] args) throws ParseException {

  //  HashMap<Integer, String> hmap = new HashMap<Integer, String>();
    HashMap<Date, String> hmap = new HashMap<Date, String>();
  /*  hmap.put(5, "A");
    hmap.put(11, "C");
    hmap.put(4, "Z");
    hmap.put(662, "Y");
    hmap.put(9, "P");
    hmap.put(661, "Q");
    hmap.put(0, "R");*/
    
    Date date = new Date();
    
    SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
	//format.setTimeZone(TimeZone.getTimeZone("UTC"));
	String dat = "2017-06-05T08:07:34.000Z";
	String dats = "2017-06-05T21:07:34.012Z";
	Date datesss = ft.parse(dat);
	Date da = ft.parse(dats);
	System.out.println("ok fine :"+ft.format(datesss));
    hmap.put(datesss,"u");
    hmap.put(da,"l");

    System.out.println("Before Sorting:");
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
          Map.Entry me = (Map.Entry)iterator.next();
          System.out.print(me.getKey() + ": ");
          System.out.println(me.getValue());
    }
    Map<Date, String> map = new TreeMap<Date, String>(hmap); 
   String ab = map.get(map.keySet().toArray()[0]);

/*Date firstKey = (Date) map.keySet().toArray()[0];
String valueForFirstKey = map.get(firstKey);
   System.out.println(firstKey);
    System.out.println(valueForFirstKey);*/
    System.out.println("After Sorting:");
    Set set2 = map.entrySet();
    Iterator iterator2 = set2.iterator();
    while(iterator2.hasNext()) {
         Map.Entry me2 = (Map.Entry)iterator2.next();
         System.out.print(me2.getKey() + ": ");
         System.out.println(me2.getValue());
    }
    System.out.println("#######################################################");
  /*  Map<Date, String> mat = new TreeMap<Date, String>(new Comparator<Date>() {
        public int compare(Date d1, Date d2) {
            return d1.after(d2) ? 1 : -1;
        }
    });*/
    
    Map<Long, String> mat = new TreeMap<Long, String>();
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
    Date d1 = dateFormat.parse("2017-06-05T08:07:34.000Z");
    Date d2 = dateFormat.parse("2017-06-05T21:07:34.000Z");
    Date d3 = dateFormat.parse("2021-04-12T21:10:25.000Z");
 
//    String firstKey = (String) mat.keySet().toArray()[0];
//	String valueForFirstKey = (String) mat.get(firstKey);
	long epocha = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2017-06-05T08:07:34.000Z").getTime() / 1000;
	long epochb = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2008-06-05T21:07:34.000Z").getTime() / 1000;
	long epochc = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2015-01-07T20:57:40.000Z").getTime() / 1000;
	long epochd = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2015-01-30T00:32:20.000Z").getTime() / 1000;
	
	mat.put(epocha, "s2");
    mat.put(epochb, "s1");
    mat.put(epochc, "s3");
    mat.put(epochd,"s4");
	
	System.out.println("epoch:"+epocha);
	System.out.println("epocha:"+epochb);
	System.out.println("epochc:"+epochc);
	System.out.println("epochd:"+epochd);
//	System.out.println(firstKey);
//	System.out.println(valueForFirstKey);
    
    System.out.println(mat );
    
    
    
    
   /* System.out.println(map.size());
    int firstKey1 = (Integer) map.keySet().toArray()[6];
    System.out.println("firstKey1:"+firstKey1);
	String valueForFirstKey2 = (String) map.get(firstKey1);
	System.out.println("valueForFirstKey2 :"+valueForFirstKey2);*/
}
}

