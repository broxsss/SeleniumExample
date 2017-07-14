package com.Git.com.EGIT;
import java.io.IOException;

public class Testproperties extends Testprop {

	
	public static void main(String[] args) throws IOException {
		
     String abc = getdata("Name");
     System.out.println(abc +"    "+getdata("WIM")+"    "+getdata("Place"));
	}

}
