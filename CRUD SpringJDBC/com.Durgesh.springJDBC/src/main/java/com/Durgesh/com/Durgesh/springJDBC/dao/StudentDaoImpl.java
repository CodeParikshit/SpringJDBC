package com.Durgesh.com.Durgesh.springJDBC.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.Durgesh.com.Durgesh.springJDBC.entities.Student;

public class StudentDaoImpl implements StudnetDao{
	
	private JdbcTemplate jdbcTemplatenew;
	@Override
	public int insert(Student student) {
		//insert query
		String query = "insert into student (id,name,city) values (?,?,?)";
		int r = this.jdbcTemplatenew.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	@Override
	public int change(Student student) {
		// update query
		String query = "update student set name=?, city=? where id=?";
		int r = this.jdbcTemplatenew.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	@Override
	public int delete(int studentId) {
		// delete query
		String query = "delete from student where id=?";
		int r = this.jdbcTemplatenew.update(query,studentId);
		return r;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplatenew;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplatenew = jdbcTemplate;
	}
	
}
