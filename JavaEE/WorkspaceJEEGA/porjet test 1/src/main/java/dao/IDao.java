package dao;

import java.util.List;

public interface IDao {
	
	 public void addStudent(Student st);
	 public List<Student> getAllStudent() ;
	 public Student getStudentById(int id);
	 public void deleteStudent(int id);
	 public void updateStudent (int id , Student st);

}
