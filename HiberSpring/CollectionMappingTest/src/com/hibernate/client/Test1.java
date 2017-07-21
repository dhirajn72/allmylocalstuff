package com.hibernate.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.hibernate.dao.DAOFactory;
import com.hibernate.dao.StudentDAO;
import com.hibernate.persistence.Student;

public class Test1 {
	public static void main(String[] args) {

		StudentDAO dao = DAOFactory.getStudentDAO();

		String[] arr = { "X", "XII", "BCA", "MCA" };

		List<String> phones = new ArrayList<String>();
		phones.add("9743854499");
		phones.add("9743855599");
		phones.add("9743856699");

		Set<String> emails = new HashSet<String>();
		emails.add("dk@gmail.com");
		emails.add("mk@gmail.com");
		emails.add("pk@gmail.com");

		Map<String, Object> refs = new HashMap<String, Object>();
		refs.put("DK", "SSE");
		refs.put("RK", "TL");
		refs.put("AK", "SE");

		Student student = new Student("DK", "dk@gmail.com", arr, phones,
				emails, refs);
		dao.addStudent(student);
		Student student2 = new Student("singh", "singh@gmail.com", arr, phones,
				emails, refs);
		dao.addStudent(student2);
		Student student3 = new Student("kumar", "kumar@gmail.com", arr, phones,
				emails, refs);
		dao.addStudent(student3);

	}
}
