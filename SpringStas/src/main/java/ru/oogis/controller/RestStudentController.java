package ru.oogis.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.oogis.model.Student;
import ru.oogis.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/restStudent")
public class RestStudentController {

    private final StudentService studentService;

    @Autowired
    public RestStudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping()
    public List<Student> getIdStudent() {
        return studentService.getStudents();

    }
}
