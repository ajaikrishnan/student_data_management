package net.kichu.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.kichu.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}