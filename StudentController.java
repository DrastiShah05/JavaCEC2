package com.example.exam_studentinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.StudentModels;
import com.example.demo.repository.StudentRepository;

@RestController
public class StudentController {
	@Autowired
	StudentRepository sr;
	
	//INSERT STUDENT DATA
	@PostMapping("/add")
	public String AddStudent(StudentModels sm)
	{
		try
		{
			sr.save(sm);
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		return "Data Added";
	}
	
	//DELETE STUDENT DATA
	@GetMapping("/students/delete/{id}")
	public String deleteStu(@PathVariable("id")Integer id)
	{	
		students.deleteById(id);
		return "redirect:/student/display";
		
	}
	
	//EDIT STUDENT DATA
	@GetMapping("/students/edit/{id}")
	public String editstudent(@PathVariable("id")Integer id, Model model)
	{	
		Student student =	students.findById(id).get();
		
		model.addAttribute("student",student);
		return "edit";
	}
	@PostMapping("/students/edit")
	public String editStudent(Student student)
	{	
		Integer id=student.getId();
		String name=student.getName();
		Integer marks=student.getMarks();
		Student studentDB =	student.findById(id).get();
		
		studentDB.setName(name);
		studentDB.setMarks(marks);
		
		
		students.save(studentDB);
	
		
		return "redirect:/students/display";
		


}
