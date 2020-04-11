package intro;

public class B {
	A a;
	public B() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor of B");
	}
	
	public A getA() {
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
	
	public void printB()
	{
		System.out.println("from B");
		a.print();
	}
	
}
