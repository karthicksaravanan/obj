package com.rags.manytoone;

public class TestInsertStudent {
	public static void main(String arg[]) {
		try {
			StudentDao m = new StudentDao();
			Address ad = new Address();
			ad.setCity("Coimbatore");
			ad.setState("TamilNadu");
			ad.setStreet("Othakalmadapam");
			ad.setZipcode("641021");

			Student c1 = new Student();

			c1.setStudentName("ABCD");
			c1.setStudentAddress(ad);

			Student c2 = new Student();

			c2.setStudentName("EFGH");
			c2.setStudentAddress(ad);

			m.insertStudent(c1);
			m.insertStudent(c2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
