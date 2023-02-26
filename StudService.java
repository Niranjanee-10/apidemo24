package com.example.demo;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;;
@Service
public class StudService {
@Autowired
private StudRepo stu;
public Stud addDetails(Stud s)
{
return stu.save(s);
}
public List<Stud>getAllDetails()
{

return stu.findAll();
}
public Stud changeDetails(int id,Stud s)
{
Stud ss=stu.findById(id).orElse(null);

ss.setStudentName(s.getStudentName());
ss.setDepartmmentName(s.getDepartmmentName());
ss.setMailid(s.getMailid());
return stu.save(ss);
}
public void deleteDepartmentById(int id)
{
stu.deleteById(id);
}
}
