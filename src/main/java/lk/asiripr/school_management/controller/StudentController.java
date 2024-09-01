package lk.asiripr.school_management.controller;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lk.asiripr.school_management.entity.Student;
import lk.asiripr.school_management.service.StudentService;

@Controller
public class StudentController {

	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}

	// handler method to handle list of students and return model and view

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

	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student std) {
		studentService.saveStudent(std);
		return "redirect:/students";

	}

	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		Student student = studentService.getStudentbyId(id);
		if (student == null) {
	        throw new NoSuchElementException("Student not found");
	    }
	    model.addAttribute("student", student);
	    return "edit_student";
	}

	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {

//		get student from database by id
		Student existingStd = studentService.getStudentbyId(id);
			
		existingStd.setId(id);		
		existingStd.setFirstName(student.getFirstName());
		existingStd.setLastName(student.getLastName());
		existingStd.setEmail(student.getEmail());
		
//		save updated student
		studentService.updateStudent(existingStd);
		return "redirect:/students";
		
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}

}
