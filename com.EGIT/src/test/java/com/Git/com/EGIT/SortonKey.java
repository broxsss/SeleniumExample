package com.Git.com.EGIT;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;
import java.util.TimeZone;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.List;

class SortonKey {
	static Map<String, ArrayList<Object>> hashMap = new TreeMap<String, ArrayList<Object>>();

	public static void main(String... arg) throws ParseException {
		   // Add data with duplicate keys
		   addValues("76888", "b");
		   addValues("76888", "a1");
		   addValues("76885", "2");
		   addValues("76888", "b");
		   addValues("76888", "a1");
		   addValues("76885", "a2");
		   addValues("76888", "b");
		   addValues("76888", "a1");
		   addValues("76885", "a2");
		   addValues("76888", "b");
		   addValues("76888", "a1");
		   addValues("76885", "a2");
		  
		   // View data.
//		   Iterator it = hashMap.keySet().iterator();
//		   ArrayList tempList = null;
            
		   String firstKey = (String) hashMap.keySet().toArray()[0];
			ArrayList valueForFirstKey =  hashMap.get(firstKey);
		   
			System.out.println("hello 1:"+firstKey);
			System.out.println("hello 2:"+valueForFirstKey);
			System.out.println("hello 2:"+valueForFirstKey.toArray()[0]);
			
		  /* while (it.hasNext()) {
		      String key = it.next().toString();             
		      tempList = hashMap.get(key);
		      if (tempList != null) {
		         for (Object value: tempList) {
		            System.out.println("Key : "+key+ " , Value : "+value);*/
		         //}
		     // }
		  // }
			String str = "Jun 13 2003 23:11:52.454 UTC";
		    SimpleDateFormat df = new SimpleDateFormat("MMM dd yyyy HH:mm:ss.SSS zzz");
		    Date date = df.parse(str);
		    long epoch = date.getTime();
		    System.out.println(epoch); 
		    
		    String dates = "2017-05-02T02:56:18.000Z";
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
			Date datess = dateFormat.parse(dates);        
			DateFormat converter = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");
			converter.setTimeZone(TimeZone.getTimeZone("GMT"));
			System.out.println("time in GMT : " + converter.format(datess));
		    
		    String str1 = "2017-05-02T02:56:18.000Z";
		    SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		    Date date2 = df1.parse(str1);
		    long epoch3 = date2.getTime();
		    System.out.println(epoch3); 
		    Date date4= new Date(epoch3);
		     DateFormat format4 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		     format4.setTimeZone(TimeZone.getTimeZone("IST"));
		     String formatted4 = format4.format(date4);
		     System.out.println("Date for the linelastupdate:"+formatted4);
		    
			long epoch1 = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse("2017-05-02T02:56:18.000Z").getTime() / 1000;
			System.out.println("Time in second for above record :"+epoch1);
			Date date1 = new Date(epoch1 * 1000L);
			  DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			  format.setTimeZone(TimeZone.getTimeZone("IST"));
			  String formatted = format.format(date1);
			  System.out.println(formatted);
		}
	private static void addValues(String key, String value) {
		   ArrayList tempList = null;
		   if (hashMap.containsKey(key)) {
		      tempList = hashMap.get(key);
		      if(tempList == null)
		         tempList = new ArrayList();
		      tempList.add(value);  
		   } else {
		      tempList = new ArrayList();
		      tempList.add(value);               
		   }
		   hashMap.put(key,tempList);
		}
  /* HashMap<String,String> hm = new HashMap<String,String>();
   hm.put("3","three");
   hm.put("1","one");
   hm.put("4","four");
   hm.put("2","two");
   printMap(hm);
   Map<String, String> treeMap = new TreeMap<String, String>(hm);
   printMap(treeMap);*/
	
	/*Map<List, String> mat = new TreeMap<List,String>();
	List<String> list = new ArrayList<String>();
	list.add("A");
	list.add("A");
	list.add("B");
	list.add("C");
	mat.put(list, value);*/
	
/*	 TreeMap<String, String> hm = new TreeMap<String, String>(new MyComp());
    //add key-value pair to TreeMap
    hm.put("java", "language");
    hm.put("india", "machine");
    hm.put("india","country");
    hm.put("mango","fruit");
    System.out.println(hm);*/
    
    
	
//main

}
class MyComp implements Comparator<String>{
	 
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
     


public static void printMap(Map<String,String> map) {
    Set s = map.entrySet();
    Iterator it = s.iterator();
    while ( it.hasNext() ) {
       Map.Entry entry = (Map.Entry) it.next();
       String key = (String) entry.getKey();
       String value = (String) entry.getValue();
       System.out.println(key + " => " + value);
    }//while
    System.out.println("========================");
}//printMap
} 
