package TestNGpractice;

import org.testng.annotations.Test;

public class invocationcounttest {

	
	@Test(invocationCount=5)
	
	public void inv()
	{
		System.out.println("test invocation");
	}
}
