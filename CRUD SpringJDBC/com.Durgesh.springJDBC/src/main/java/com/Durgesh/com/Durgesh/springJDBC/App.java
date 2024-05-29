package com.Durgesh.com.Durgesh.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.Durgesh.com.Durgesh.springJDBC.dao.StudentDaoImpl;
import com.Durgesh.com.Durgesh.springJDBC.dao.StudnetDao;
import com.Durgesh.com.Durgesh.springJDBC.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //when we need to perform the operations on Spring JDBC then we need the object of JDBCTemplate class
        //as we already given all the configuration of that class inside the Config.xml file 
        //we only need to get that object from spring. 
      
        ApplicationContext context = new ClassPathXmlApplicationContext("com/Durgesh/com/Durgesh/springJDBC/config.xml");
        StudnetDao  studentDao = context.getBean("studentDao1",StudnetDao.class);
        
        //new way inserction: -------
//        Student student= new Student();
//        student.setId(4556);
//        student.setName("parikshit");
//        student.setCity("delhi");
//        
//        int result = studentDao.insert(student);
//        System.out.println(result);
        
        
        //update: - 
//        Student student = new Student();
//        student.setId(123);
//        student.setName("Parikshit Arekar");
//        student.setCity("Delhi");
//        
//        
//        int change = studentDao.change(student);
//        System.out.println(change);
        
        
        
        //delete
        
        int delete = studentDao.delete(123);
        System.out.println(delete);
       
        
        
        
        
        //this wass the old way of inserting the data 
//        JdbcTemplate template = context.getBean("jdbcTemplate",JdbcTemplate.class);
//        String query = "insert into student (id,name,city) values (?,?,?)";
//        int result = template.update(query,123,"mithesh kumar","lucknow");
//        System.out.println("number of records inserted....."+result);
    }
}
