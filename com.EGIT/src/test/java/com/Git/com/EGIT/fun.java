package com.Git.com.EGIT;

public class fun {
	
	public static boolean compare(String val1,String val2)
	{
		if(val1==null && val2==null)
		{
			return true;
		}

		else if(val1==null || val2==null){
			return false;
		}

		else if(val1.equals(val2)){
			return true;
		  	
		}
    return false;
	}
	
	public static boolean compare1(String val1,String val2)
	{
		if(val1==null && val2==null)
		{
			return true;
		}

		else if(val1==null || val2==null){
			return false;
		}

		else{
			boolean rc = val1.equals(val2);
			return true;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ab = "1123";
        String bc = "1123";
       System.out.println(compare(ab,bc)); 
       System.out.println(compare1(ab,bc)); 
       
	}

}
