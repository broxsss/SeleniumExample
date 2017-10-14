package SeleniumExamples;

import java.util.Arrays;

import org.testng.annotations.Test;

public class distinctarray {

	@Test
	public void distinct()
	{
		int[] a = {2,3,2,5,6,7,6,5,4,5};
		Arrays.sort(a);
		
		for(int i=0;i<a.length;i++)
		{
			boolean isflag=false;
			for(int j=0;j<i;j++)
			{
			if(a[i]==a[j])
			{
				isflag=true;
				break;
			}
			}
			if(!isflag)
			{
			System.out.print(a[i]+"  ");
			}
		}
	}
}
