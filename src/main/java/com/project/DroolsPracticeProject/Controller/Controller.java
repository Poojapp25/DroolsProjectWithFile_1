package com.project.DroolsPracticeProject.Controller;

import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.DroolsPracticeProject.Entity.Employee;

@RestController
@RequestMapping("/employee")
public class Controller {

	@Autowired
	private KieSession session;
	
	@PostMapping("/floor")
	public Employee getEmployeeFloorNumber(@RequestBody Employee emp) {
		session.insert(emp);
		session.fireAllRules();
		return emp;
	}
}
