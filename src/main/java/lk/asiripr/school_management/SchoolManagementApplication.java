package lk.asiripr.school_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lk.asiripr.school_management.entity.Student;
import lk.asiripr.school_management.repository.StudentRepository;

@SpringBootApplication
public class SchoolManagementApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Autowired // Dependency Injection with @Autowired
	private StudentRepository studentRepository; // Inject the StudentRepository bean into this class.

	@Override
	public void run(String... args) throws Exception{
//		Student s1 = new Student("Thalatha","Athukorala","tathu@gmail.com");
//		studentRepository.save(s1);
//		Student s2 = new Student("Pawithra","Wanniarachchi","pawi@gmail.com");
//		studentRepository.save(s2);
//		Student s3 = new Student("Thissa","Kuttiarachchi","tkutti@gmail.com");
//		studentRepository.save(s3);
		
		
	}

}
