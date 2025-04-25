package OOps;

class human
{
	private int age;
	private String name;


public int getage()
{
	return age;
}

public void setage(int a)
{
	age=a;
}

public void setname(String n)

{
	name=n;
}
public String getname()
{
	return name;
}

}

public class encapsulationdemo {

	public static void main(String[] args) {

		
		human obj = new human();
		
		obj.setage(30);
		obj.setname("Bati");
		
		System.out.println(obj.getage() + ":"  + obj.getname());
	}

}
