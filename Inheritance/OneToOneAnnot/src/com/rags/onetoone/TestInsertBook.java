package com.rags.onetoone;

public class TestInsertBook {
	public static void main(String arg[]) {
		try {
			StudentDao m = new StudentDao();
			Address ad = new Address();
			ad.setCity("chennai");
			ad.setState("TN");
			ad.setStreet("middle");
			ad.setZipcode("123456");
			Student s = new Student();
			s.setStudentName("babu");
			s.setStudentAddress(ad);
			m.insertStudent(s);

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
