package org.imesh.sample.employee.web;
import org.imesh.sample.employee.domain.Employee;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/employees")
@Controller
@RooWebScaffold(path = "employees", formBackingObject = Employee.class)
public class EmployeeController {
}
