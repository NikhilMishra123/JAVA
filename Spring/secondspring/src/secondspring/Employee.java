package secondspring;

public class Employee {

	public int id ;
	public String name ;
		public Employee(int id ) {
			// TODO Auto-generated constructor stub
			this.id=id;
		}
		public Employee(String name) {
			// TODO Auto-generated constructor stub
			this.name=name;
		}
		public Employee(int id ,String name) {
			// TODO Auto-generated constructor stub
			this.id = id ;
			this.name=name;
		}
		
		void show()
		{
			System.out.println(id+" "+name);
		}
}
