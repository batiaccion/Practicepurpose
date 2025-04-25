package TestNGpractice;

import org.testng.annotations.Test;

public class dependson {
	
	@Test(dependsOnMethods="m2")
	
	public void m1()
	{
		System.out.println("in test method)");
	}




@Test
public void m2()
{
	System.out.println("in method 2");
}
}