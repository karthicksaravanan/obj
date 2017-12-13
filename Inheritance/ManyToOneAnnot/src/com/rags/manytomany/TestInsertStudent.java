package com.rags.manytomany;

public class TestInsertStudent {
	public static void main(String arg[]) {
		try {
			StudentDao m = new StudentDao();
			Address ad = new Address();
			ad.setCity("chennai");
			ad.setState("TN");
			ad.setStreet("middle");
			ad.setZipcode("123456");
			Student s = new Student();
			Student s1 = new Student();
			s.setStudentName("sylandirababu");
			s1.setStudentName("sivaraman");
			s.setStudentAddress(ad);
			s1.setStudentAddress(ad);
			m.insertStudent(s);
			m.insertStudent(s1);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
