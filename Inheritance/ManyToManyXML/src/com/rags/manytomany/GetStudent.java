package com.rags.manytomany;
import java.util.Iterator;
import java.util.Set;
public class GetStudent {
	public static void main(String arg[])
	{  
		DAO ms=new DAO();		
		Student st=ms.getStudents(3);
		Set<Course> sts=st.getCourses();
		System.out.println(st.getStudentName());

		Iterator<Course>co=sts.iterator();
		while(co.hasNext())
		{
			Course cr=(Course)co.next();
			System.out.println(cr.getCourseName());
		}	
				
	}

}
