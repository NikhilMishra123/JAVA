package intro;

public class A {
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public A() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor of A");
	}
	public void print()
	{
		System.out.println("from A"+id);
	}
}
