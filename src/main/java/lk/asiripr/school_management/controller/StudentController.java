package lk.asiripr.school_management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lk.asiripr.school_management.entity.Student;
import lk.asiripr.school_management.service.StudentService;


@Controller
public class StudentController {
	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	//handler method to handle list of students and return model and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm(Model model) {
		// create student object to hold data
		Student std = new Student();
		model.addAttribute(std);
		return "create_student";
	}

	
	
	
}
