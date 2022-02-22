package com.code.manage.controller;


import com.code.manage.entity.Address;
import com.code.manage.entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {

    @RequestMapping(value = {"/", "index", "home"})
    public String showHome(){
        return "index";
    }

    @GetMapping("new")
    public String addForm(Model model){
        Employee employee =new Employee();
        Address address = new Address();
        model.addAttribute("emp", employee);
        model.addAttribute("address", address);
        return "add_employee";
    }

    @PostMapping("insert")
    public String saveEmployee(@ModelAttribute Employee employee, @ModelAttribute Address address, Model model){
        employee.setAddress(address);
        model.addAttribute("emp_name", employee.getFirstName());
        return "employeedetails";
    }
}
