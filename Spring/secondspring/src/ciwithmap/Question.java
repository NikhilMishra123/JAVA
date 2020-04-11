package ciwithmap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	public int id ;
	public String name ;
	public Map<String , String > mp;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	public Question(int id , String name , Map<String, String> mp)
	{
		this.id = id ;
		this.name= name ;
		this.mp =mp;
	}
	
	public void displayInfo()
	{
		System.out.println(id+" "+ name);
		System.out.println("Answer is :- ");
		 System.out.println("Answers....");  
		    Set<Entry<String, String>> set=mp.entrySet();  
		    Iterator<Entry<String, String>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        Entry<String,String> entry=itr.next();  
		        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
		    }    
	}
}
