package cicollectionwithobject;

public class Answer {

	public int id ;
	String name , by;
	
	public Answer() { }
	public Answer(int id , String name , String by ) 
	{
		this.id = id ;
		this.name = name ;
		this.by = by ;
	}
	
	public String toString()
	{
		return id+" "+name+" ::::" +by;
	}
}
