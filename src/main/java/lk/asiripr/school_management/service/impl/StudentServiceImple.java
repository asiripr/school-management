package lk.asiripr.school_management.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lk.asiripr.school_management.entity.Student;
import lk.asiripr.school_management.repository.StudentRepository;
import lk.asiripr.school_management.service.StudentService;
@Service
public class StudentServiceImple implements StudentService {
	
	private StudentRepository studentRepository; // DI concept
	
	public StudentServiceImple(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student saveStudent(Student std) {
		// TODO Auto-generated method stub
		return studentRepository.save(std);
	}
}
