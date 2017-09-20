package SeleniumExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.collections.MultiHashMap;

import com.google.common.collect.ListMultimap;
import com.google.common.collect.Multimaps;

public class maponmap {
	
	public static void main(String[] args) {
		 
	      MultiHashMap mp=new MultiHashMap();
	      mp.put("a", 19);
	      mp.put("a", 11);
	      mp.put("a", 12);
	      mp.put("b", 13);
	      mp.put("c", 14);
	      mp.put("e", 15);
	      List list = null;
          System.out.println(mp);
          
	      Set set = mp.entrySet();
	      Iterator i = set.iterator();
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         list=(List)mp.get(me.getKey());

	         for(int j=0;j<list.size();j++)
	         {
	          System.out.println(me.getKey()+": value :"+list.get(j));
	         }
	      }
	   }

	
}
