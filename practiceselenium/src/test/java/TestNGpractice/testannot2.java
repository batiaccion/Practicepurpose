package TestNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testannot2 {
	
	@BeforeSuite
	public void BS1()
	{
		System.out.println("in BS1");
	}
		
	@BeforeClass
	public void BC1()
	{
		System.out.println("in BC1");
	}
	
	@BeforeTest
	public void BT1()
	{
		System.out.println("in BT1");
	}
	
	@BeforeMethod
	public void BM1()
	{
		System.out.println("in BM1");
	}
	
	@Test
	public void T1()
	{
		System.out.println("in T11");
	}
	@AfterSuite
	public void AS1()
	{
		System.out.println("in AS1");
	}
	
	@AfterTest
	public void AT1()
	{
		System.out.println("in AT1");
	}
	
	@AfterClass
	public void AC1()
	{
		System.out.println("in AC1");
	}
	@AfterMethod
	public void AM1()
	{
		System.out.println("in AM1");
	}

}
