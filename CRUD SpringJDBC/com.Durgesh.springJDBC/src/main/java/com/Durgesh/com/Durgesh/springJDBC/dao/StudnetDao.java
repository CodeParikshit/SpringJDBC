package com.Durgesh.com.Durgesh.springJDBC.dao;

import com.Durgesh.com.Durgesh.springJDBC.entities.Student;

public interface StudnetDao {
	public int insert(Student student);
	public int change (Student student);
	public int delete (int studentId);
}
