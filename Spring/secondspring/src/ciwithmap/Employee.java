package ciwithmap;

import cidependentobject.Address;

public class Employee {
	public int id ;
	public  String name ;
	public Address address;
	
	
	public Employee(int id , String name) {
		this.name= name ;
		this.id = id ;
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id , String name , Address address ) {
		// TODO Auto-generated constructor stub
		this.address= address;
		this.id = id ;
		this.name	}

}
