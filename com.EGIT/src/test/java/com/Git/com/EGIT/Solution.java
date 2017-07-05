package com.Git.com.EGIT;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        SortedSet<String> hs=new TreeSet<String>();
        System.out.println(s.length());
       for(int i=0;i<=s.length()-k;i++)
       {
    	   
    	   hs.add(s.substring(i,i+k).trim());
       }
    
       smallest=hs.first();
       largest=hs.last();
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        String s = scan.next()"welcometojava";
        int k = scan.nextInt()3;
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));*/
    	
    	        
    	        Scanner sc=new Scanner(System.in);
    	       // String A="appa";
    	        /*int j =A.length();
   	         boolean go=false;
   	         Enter your code here. Print output to STDOUT. 
   	if(A.length()>1) {
          for(int i =0;i<j/2;i++)
   	        {
   	          go =  A.charAt(i)==A.charAt((A.length()-1)-i);
   	        } 
       }
   	else if(A.length()==1)
   	{
   		go=true;
   	}
      else
      {
          go=false;
      }
   	        if(go)
               {
                   System.out.println("Yes");
               }
              else{
                  System.out.println("No");
              }     
    	 */  
    	       // System.out.println( A.equals( new StringBuilder(A).reverse().toString())  ? "Yes" : "No" );
    	        
    	            
    	               /*String s ="";
    	              s=  s.trim();
    	                if(s.length()==0)
    	                {
    	                   System.out.println(s.length()) ;
    	                }
    	            	  else{
    	                    String[]  sum = s.split("\\s*[^a-zA-Z]+\\s*");
    	            	       System.out.println(sum.length);
    	            	       for(String st :sum)
    	            	       {
    	            	    	   System.out.println(st);
    	            	    	   
    	            	       }  
    	                  }  
    	            }*/
    	       
    	       // int testCases = Integer.parseInt(in.nextLine());
//    	        for(int i=0;i<testCases;i++)
//    	        {
    	            try
    	            {
    	           String pattern = "([A-Z])(.+)";
    	           Pattern.compile(pattern);
    	           System.out.println("Valid");
    	            }

    	               catch (PatternSyntaxException pse)
    	                    {
    	            System.out.println("Invalid");
    	               //Write your code
    	        }
    	      //}  	        
}     
}