package lk.asiripr.school_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import lk.asiripr.school_management.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{


}
