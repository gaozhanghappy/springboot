package git.gaozhanghappy.controller;

import git.gaozhanghappy.dao.StudentDao;
import git.gaozhanghappy.model.TbStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 123456 on 2019/6/2.
 */
@RestController
public class TbStudentController {
    @Autowired
    private StudentDao studentDao;
    @GetMapping("/tbStudent")
    public Object getAllStudent(){
        return studentDao.findAll();
    }
    @PostMapping(value= "/tbStudent")
    public Object add(@RequestParam(value = "name",required = false) String name, @RequestParam(value = "age",required = false) String age){
        TbStudent tbStudent=new TbStudent();
        tbStudent.setName("大青蛙");
        tbStudent.setAge("14");
        return studentDao.save(tbStudent);
    }
    @GetMapping(value = "/tbStudent/{id}")
    public TbStudent tbStudentById(@PathVariable("id") Integer id){
        return studentDao.findOne(id);

    }
    @DeleteMapping("/tbStudent/{id}")
    public void deletById(@PathVariable("id") Integer id){
        studentDao.delete(id);
    }
    @PutMapping("/tbStudent/{id}")
    public TbStudent put(@PathVariable(value = "id",required = false) Integer id,
                         @PathVariable(value = "lisi",required = false) String name,
                         @PathVariable(value = "21",required = false) String age){
        TbStudent tbStudent=new TbStudent();
        tbStudent.setId(id);
        tbStudent.setName("修改");
        tbStudent.setAge("121");
        return studentDao.save(tbStudent);
    }

}
