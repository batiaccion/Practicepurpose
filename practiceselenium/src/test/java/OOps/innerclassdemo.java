package OOps;

class A
{
	int age;
	public void show()
	{
		System.out.println("in show mthod");
	}
	class B
	{
		public void config()
		{
			System.out.println("in config method");
		}
	}
}

public class innerclassdemo {

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		A.B obj1= obj.new B();
		obj1.config();
		
		
	}

}
