package abstractiontest;

public interface interfacetest {
	
	int length = 10; // final and static
	int width = 20; // final and static
	
	void m1(); //public abstract methods
	void m2(); //public abstract methods
	void m3(); //public abstract methods
	
	default void rectangle()
	{
		System.out.println(" this is default method");
	}

	static void square()
	{
		System.out.println(" this is square method");
	}
}

