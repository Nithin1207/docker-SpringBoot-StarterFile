package com.putti.Spring_db;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents() {
        return repo.findAll();
    }
}
