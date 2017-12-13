package com.rags.onetomany;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
public class TestGetStudent {
	public static void main(String arg[])
	{  
		StudentDao ms=new StudentDao();
		long s=2;
		 List<Student> list=ms.getStudent(s) ;
	      
		    Iterator<Student> itr=list.iterator();  
		    while(itr.hasNext()){  
		    	Student q=itr.next();  
		        System.out.println("Student Name: "+q.getStudentName());  
		        Set<Phone> list2=q.getStudentPhoneNumbers(); 
		        Iterator<Phone> itr2=list2.iterator();  
		        while(itr2.hasNext()){  
		           Phone cs=itr2.next();
		           System.out.println( cs.getPhoneNumber());
		           System.out.println(cs.getPhoneType());
		            
		        }  
		          
		    }  
		
		
				
	}

}
