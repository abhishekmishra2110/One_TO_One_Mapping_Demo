package com.mapping;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mapping.entity.Laptop;
import com.mapping.entity.Student;
import com.mapping.repository.StudentRepository;

@SpringBootTest
class OneToOneMappingApplicationTests {
	@Autowired
	private StudentRepository studentRepository;
	
    @Test
	public void saveStudent() {
		
		Student student=new Student();
		student.setStudentName("mayank Jha");
		student.setAbout("I am a software Enginner");
		student.setStudentId(4);
		
		Laptop laptop=new Laptop();
		laptop.setModelNumber("2353283");
		laptop.setBrand("HP");
		laptop.setLaptopId(2);
		
		 student.setLaptop(laptop);
		 laptop.setStudent(student);
		
		
		studentRepository.save(student);
		
	}
    @Test
    public void findById() {
    	Optional<Student> findById = studentRepository.findById(3);	
    	if(findById.isPresent()) {
    		Student student = findById.get();
    		System.out.println(student.getStudentName());
    		System.out.println(student.getStudentId());
    		System.out.println(student.getAbout());
    		
    		Laptop laptop = student.getLaptop();
    		System.out.println(laptop.getBrand()); 
    		System.out.println(laptop.getModelNumber());
    		System.out.println(laptop.getLaptopId());
    		
    	}
    	else {
    		System.out.println("Id does not exist");
    	}
    	
    }

}
