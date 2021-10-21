package com.fishpro.thymeleaf.controller;

import com.fishpro.thymeleaf.dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**作用：模拟了一组数据，返回给/index/student
 * @author 86171
 */
@Controller
public class StudentController {
        @RequestMapping("/student")
        public String student(Model model){
            List<Student> studentList =  new ArrayList<>();
            studentList.add(new Student(111,"foo",new Date(),"music","3-101"));
            studentList.add(new Student(112,"bar",new Date(),"english","5-102"));
            studentList.add(new Student(113,"foo",new Date(),"computer","5-103"));
            studentList.add(new Student(114,"foo",new Date(),"chemistry","4-101"));
        model.addAttribute("studentList",studentList);
        return "/index/student";
    }

    public Student getStudentData(){
        Student student2 =new Student(111,"zhangsan",new Date(),"music","4-555");
        return student2;
    }
}
