package com.rahul;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {

	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}

	@GetMapping("/student")
	public String getStudent(Model mav) {
		mav.addAttribute("stu", new Student(101, "Rahul", "rahul.gmail.com"));
		return "index";
	}

	@GetMapping(path = { "/showAll", "/" })
	public String showAll(Model model) {
		List<Student> students = service.getAllStudent();
		model.addAttribute("students", students);
		return "index";

	}

	@GetMapping(path = { "/addNew" })
	public String addNewStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "update";

	}

	@PostMapping(path = { "/save" })
	public String saveStudent(@ModelAttribute("student") Student student) {
		service.saveStudent(student);
		return "redirect:/";

	}

	@GetMapping("/showFormUpdate/{id}")
	public String update(@PathVariable int id, Model model) {
		Student student = service.getStudentById(id);
		model.addAttribute("student", student);
		return "update";

	}
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable int id, Model model) {
		service.deleteStudentById(id);
		return "redirect:/";

	}
}
