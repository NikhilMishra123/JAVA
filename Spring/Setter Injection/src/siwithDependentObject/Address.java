package siwithDependentObject;

public class Address {
	
	int id ;
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return id+" "+city;
	}
}
