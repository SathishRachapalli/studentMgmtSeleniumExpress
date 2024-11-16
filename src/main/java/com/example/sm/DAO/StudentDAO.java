package com.example.sm.DAO;

import java.util.List;

import com.example.sm.api.Student;
import com.example.sm.api.StudentDTO;

public interface StudentDAO {
	
	
	List<Student> loadStudents();

	void saveStudentRecord(Student studentDTOObj);

	Student getStudentInfo(int Id);

	void updatingStudentInfo(Student studentDTOObj);

	void deletingStudent(int id);
	
	

}
