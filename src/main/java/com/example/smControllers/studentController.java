package com.example.smControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sm.Service.studentService;
import com.example.sm.api.Student;

@Controller
public class studentController {
	
//	@Autowired
//	private StudentDAO studRepo;
	
	@Autowired
	studentService studService;
	
	
	@GetMapping("/show")
	@ResponseBody
	public String testing(Model model)
	{
	
		return "testing done successfully!!!";
	}
	
	
	@GetMapping("/showAll")
	public String showAllStudents(Model model)
	{
		
		List<Student> studentList = studService.loadStudents();
		
		model.addAttribute("students", studentList);
		
		return "student-list";
	}
	
	
	@GetMapping("/addStudent")
	public String addingStudent(Model model)
	{
		//captured the user submitted data from front-end.
		
		//StudentDTO obj = new StudentDTO();
		model.addAttribute("student", new Student());
		
		return "add-student";
	}
	
	
	@PostMapping("/save-student")
	//@ResponseBody   -- Be careful with this.
	// It was not redirecting to thankyou getmapping URL, instead its just printing "redirect:/thankyou"
	public String savingStudent(Student studentDTOObj)
	{
		// implementing logic to save/insert the student record into the DB
		if(studentDTOObj.getId()==0)
		{
		studService.saveStudentRecord(studentDTOObj);
		}
		else
		{
			studService.updateRecord(studentDTOObj);
		}
		
		
		
		//return "redirect:/thankyou";  -- instead of this separate URL redirecting, we can 
		//just redirect to showAll url  -- that would be best.
		
		return "redirect:/showAll";
	}
	
//	@GetMapping("/thankyou")
//	@ResponseBody
//	public String thankingYou()
//	{
//		return "Student details has been successfully added!!!";
//	}
	
	@GetMapping("/updateStudent")
	public String updatingStudent( @RequestParam("userId") int Id, @ModelAttribute("student") Student stud)
	{
	
		
//		StudentDTO stud=new StudentDTO();
//		
//		model.addAttribute("student", stud);
		
		// Instead of writing the above lines, we can make use of annotation
		// @ModelAttribute and we can directly bind the object and its data.
		
		
		
		// ok, we should have to capture the id of a student that the user has been clicked on page.
		// that can be done by setting some url(path query from student list page(refer the update line))
		
		// we need to capture that userId value by using @RequestParam annotation now.
		
	
		Student studentInfo = studService.gettingStudentInfo(Id);
		System.out.println("Update request submitted for the below record: "+ studentInfo);
		
		//Now we have to bind this retrieved object's data to the model like below lines:
		stud.setId(Id);
		stud.setName(studentInfo.getName());
		stud.setCountry(studentInfo.getCountry());
		stud.setMobile(studentInfo.getMobile());
		
		
		
		
		
		// or we can also directly bind this data using Model class
		// model.addAttribute("student", studentInfo);
		//we are directly making use of freshly retrieved student object and sending this 
		//object as studentDTO to the add-student page with the modelAttribute="student"
		
		
		
		
		return "add-student";
	}
	
	
	
	@GetMapping("/deleteStudent")
	public String deletingStudent( @RequestParam("userId") int Id)
	{
	
		studService.deleteStudent(Id);
	
		return "redirect:/showAll";
	}
	
	

}
