package abstractiontest;

public class interfaceimplements implements interfacetest {

	public void m1()
	{
		System.out.println("implementiong m1 method");
	}
	
	public void m2()
	{
		System.out.println("implementiong m2 method");
	}
	public void m3()
	{
		System.out.println("implementiong m3 method");
	}

	public static void main(String[] args)
	{
		
//		interfaceimplements obj =new interfaceimplements();
//		
//		obj.m1();
//		obj.m2();
//		obj.m3();
//		obj.rectangle();
//		interfacetest.square();
		
		interfacetest obj1 = new interfaceimplements();
		
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.rectangle();
		interfacetest.square();
		
		
		
}
}
