package Javademo;

abstract class x
{
	abstract void m();
	abstract void n();
	void z()
	{
		System.out.println("in z method");
	}
}

class y extends x
{
	void m()
	{
		System.out.println("in method m");
	}
	void n()
	{
		System.out.println("in method n");
	}
}

public class absrademo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		y y1 =new y();
		y1.m();
		y1.n();
		y1.z();
	}

}
