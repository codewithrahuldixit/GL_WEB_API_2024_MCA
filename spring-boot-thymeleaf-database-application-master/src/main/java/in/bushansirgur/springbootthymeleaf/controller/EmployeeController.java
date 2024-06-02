 package in.bushansirgur.springbootthymeleaf.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.bushansirgur.springbootthymeleaf.dao.EmployeeRepository;
import in.bushansirgur.springbootthymeleaf.entity.Employee;

@Controller
public class EmployeeController {
	Logger logger = LoggerFactory.getLogger(getClass());
	@Autowired
	private EmployeeRepository eRepo;
	
	@GetMapping({"/list", "/"})
	public ModelAndView getAllEmployees() {
		ModelAndView mav = new ModelAndView("list-employees");
		mav.addObject("employees", eRepo.findAll());
		logger.info("get all of Controller");
		return mav;
	}
	
	@GetMapping("/addEmployeeForm")
	public ModelAndView addEmployeeForm() {
		ModelAndView mav = new ModelAndView("add-employee-form");
		Employee newEmployee = new Employee();
		mav.addObject("employee", newEmployee);
		logger.info("Add Employee Controller");
		return mav;
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute Employee employee) {
		eRepo.save(employee);
		logger.info("save Employee Controller");
		return "redirect:/list";
	}
	
	@GetMapping("/showUpdateForm")
	public ModelAndView showUpdateForm(@RequestParam Long employeeId) {
		ModelAndView mav = new ModelAndView("add-employee-form");
		Employee employee = eRepo.findById(employeeId).get();
		mav.addObject("employee", employee);
		logger.info("show update form Controller");
		return mav;
	}
	
	@GetMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam Long employeeId) {
		eRepo.deleteById(employeeId);
		logger.info("delete Employee Controller");
		//throw new RuntimeException();
		return "redirect:/list";
	}
}
