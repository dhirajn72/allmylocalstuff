package com.spring.persistence.dao;

import com.spring.to.StudentTO;

public interface StudentDAO {
	StudentTO getStudentBySid(String sid);

}
