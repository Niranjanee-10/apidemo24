package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class StudController {
@Autowired
private StudService stuservice;

@GetMapping ("/getStud")
public List<Stud>getDetails()
{
return stuservice.getAllDetails();
}
@PostMapping("/addStud")
public Stud postDetails (@RequestBody Stud s)
{
return stuservice.addDetails(s);

}
@PutMapping("/putStud/{id}")
public Stud putDetails (@PathVariable("id") int id,@RequestBody Stud s)
{
return stuservice.changeDetails(id,s);
}

@DeleteMapping("/delStud/{id}")
public void deletedetails(@PathVariable("id") int id)
{
stuservice.deleteDepartmentById(id);
}
}
