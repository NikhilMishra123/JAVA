package cicollectionwithobject;

import java.util.Iterator;
import java.util.List;

public class Question {
	String name ;
	int id ;
	public List<Answer> ans ;
	
	public Question() {
		// TODO Auto-generated constructor stub
	}
	
	public Question(int id , String name , List<Answer> ans )
	{
		this.id = id ;
		this.name = name ;
		this.ans = ans ;
	}
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("Answers are:");  
	    Iterator<Answer> itr=ans.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    }  
	}  
}
