package com.rags.onetomany;

import java.util.Iterator;
import java.util.Set;

public class GetStudent {
	public static void main(String arg[]) {
		Dao ms = new Dao();

		Student st = ms.getStudent(2);
		Set<Phone> sts = st.getStudentPhone();
		System.out.println(st.getStudentName());

		Iterator<Phone> co = sts.iterator();
		while (co.hasNext()) {
			Phone cr = (Phone) co.next();
			System.out.println(cr.getPhoneNumber());
			System.out.println(cr.getPhoneType());
		}

	}

}
