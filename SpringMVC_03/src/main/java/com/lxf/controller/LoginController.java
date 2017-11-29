package com.lxf.controller;

import com.lxf.dao.StudentDao;
import com.lxf.entity.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @RequestMapping("login")
    public String login(Student student) {

        StudentDao studentDao = new StudentDao();
        int n = studentDao.login(student);
        if(n > 0){
            return "index";
        }
        return "login";
    }
}
