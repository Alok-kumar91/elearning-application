package in.alokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.alokit.entity.StudentDetail;
import in.alokit.service.StudentDetailService;

@Controller
public class StudentDetailController {
	@Autowired
	private StudentDetailService sds;
	private String aa;
	
	@GetMapping("/")
	public String openForm(Model model) {
		StudentDetail sd=new StudentDetail();
		model.addAttribute("student",sd);
		return "index";
	}
	@PostMapping("/register")
	public String registerForm(StudentDetail sd,Model model) {
		sds.saveStudent(sd);
		model.addAttribute("msg","student data saved");
		return "success";
	}
	@GetMapping("/allStudents")
	public String allStudents(Model model) {
		List<StudentDetail> allStudent = sds.getAllStudent();
		model.addAttribute("stud",allStudent);
		return "students";
	}

}
