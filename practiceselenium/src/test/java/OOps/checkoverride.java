package OOps;

public class checkoverride extends methodoverride{

	int m1(int x,int y,int z)
	{
		int t=x*y*z;
		System.out.println(t);
		return t;
		
	}
	public static void main(String[] args) {

		checkoverride obj =new checkoverride();
		methodoverride obj1  = new methodoverride();
		
		obj1.m1(10, 20, 30);
		obj.m1(10, 20, 30);
		

	}

}
