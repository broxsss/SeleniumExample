package SeleniumExamples;

import java.util.Scanner;

public class stringmatching {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();
	        s.nextLine();
while(N>0)
{
	String m  =	s.nextLine();
	String[] a=m.split("");
	int icountA = 0;
	int icountE = 0;
	int icountI = 0;
	int icountO = 0;
	int icountU = 0;
	for(int i=0;i<m.length();i++)
	{
		if(a[i].equals("a") || a[i].equals("A"))
		{
			icountA++;
		}
		if(a[i].equals("e") || a[i].equals("E"))
		{
			icountE++;
		}
		if(a[i].equals("i") || a[i].equals("I"))
		{
			icountI++;
		}
		if(a[i].equals("o") || a[i].equals("O"))
		{
			icountO++;
		}
		if(a[i].equals("u") || a[i].equals("U"))
		{
			icountU++;
		}
	}
	//System.out.printf("A:%d%nE:%d%nI:%d%nO:%d%nU:%d%n",icountA,icountE,icountI,icountO,icountU);
	System.out.println(icountA+icountE+icountI+icountO+icountU);
N--;	
}
	}
}
