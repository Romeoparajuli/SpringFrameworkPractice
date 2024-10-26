package com.conInjecetion;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserCon {
	int id;
	String nameString;
	List<String> anStrings;
	Map<String, String> answers;

//	
//	
//	 public UserCon(int id, String nameString, List<String> anStrings) {
//		super();
//		this.id = id;
//		this.nameString = nameString;
//		this.anStrings = anStrings;
//	}
//

	public void show() {
		System.out.println(id + " " + nameString);
		System.out.println("answer are :");
		Iterator<String> iiIterator = anStrings.iterator();
		while (iiIterator.hasNext()) {
			System.out.println(iiIterator.next());
		}
		
		 System.out.println("Answers....");  
		    Set<Entry<String, String>> set=answers.entrySet();  
		    Iterator<Entry<String, String>> itr=set.iterator();  
		    while(itr.hasNext()){  
		        Entry<String,String> entry=itr.next();  
		        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
		    }  

	}

	public UserCon(int id, String nameString, List<String> anStrings, Map<String, String> answers) {
		super();
		this.id = id;
		this.nameString = nameString;
		this.anStrings = anStrings;
		this.answers = answers;
	}
	
	
	

}
