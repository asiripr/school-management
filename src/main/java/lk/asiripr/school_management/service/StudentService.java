package lk.asiripr.school_management.service;

import java.util.List;

import lk.asiripr.school_management.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();
	Student saveStudent(Student std);

}
