package git.gaozhanghappy.controller;

import git.gaozhanghappy.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 123456 on 2019/6/2.
 */
@RestController
public class StudentController {
    @Autowired
    private Student student;
    @RequestMapping("/student")
    public Object student(){
        return student.getName()+"__________"+student.getAge();
    }
}
