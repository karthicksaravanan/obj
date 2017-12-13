package com.rags.onetomany;
import java.util.HashSet;
import java.util.Set;

//package com.candidjava.hibernate;
public class TestInsertStudent {
	public static void main(String arg[])
	{
		try
		{
		StudentDao m=new StudentDao();
		Set<Phone>cor=new HashSet<Phone>();
		cor.add(new Phone("9898989892","mobile"));
		cor.add(new Phone("23456788","house"));
		Student st=new Student("sivaraman",cor);
	    st.setStudentPhoneNumbers(cor);
	    m.insertStudent(st);	    
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
