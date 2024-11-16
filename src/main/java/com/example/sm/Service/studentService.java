package com.example.sm.Service;

import java.util.List;

import com.example.sm.api.Student;
import com.example.sm.api.StudentDTO;

public interface studentService {
	
	List<Student> loadStudents();
	void saveStudentRecord(Student studentDTOObj);
	Student gettingStudentInfo(int id);
	void updateRecord(Student studentDTOObj);
	void deleteStudent(int id);
	


}
