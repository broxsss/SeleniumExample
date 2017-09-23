package SeleniumExamples;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Ordering;

public class fun {
	
	public static boolean isSorted(int[] a){
	    boolean isSorted = true;
	    boolean isAscending = a[1] > a[0];
	    if(isAscending) {
	        for (int i = 0; i < a.length-1; i++) {
	            if(a[i] > a[i+1]) {
	                isSorted = false;
	                break;
	            }           
	        }
	    } else {//descending
	        for (int i = 0; i < a.length-1; i++) {
	            if(a[i] < a[i+1]) {
	                isSorted = false;
	                break;
	            }           
	        }  
	    }    
	    return isSorted;
	}
	public static void main(String[] args)
	{
	          int ar[] = {5,6,300,1010};
	          System.out.println(ar[0]+" "+ar[1]+" "+ ar[2]);
	          isSorted(ar);
	          System.out.println(isSorted(ar)); 
	          List<Integer> list = new ArrayList<Integer>();
	          list.add(2);
	          list.add(6);
	          list.add(8);
	          list.add(10);
	          list.add(12);
	          list.add(100);
	          list.add(122);
	          list.add(130);
	          list.add(null);
	          System.out.println(list); 
	        //  boolean sorted = Ordering.natural().isOrdered(list);
	        //  System.out.println(sorted);
	          boolean sorted1=   Ordering.natural().nullsLast().isOrdered(list);
	          System.out.println(sorted1);
	          boolean sorted2= Ordering.natural().reverse().isOrdered(list);
	          System.out.println(sorted2);
	}

}
