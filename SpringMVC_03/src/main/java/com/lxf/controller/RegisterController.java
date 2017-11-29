package com.lxf.controller;

import com.lxf.dao.StudentDao;
import com.lxf.entity.Student;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class RegisterController {

    @RequestMapping("regist")
    public String regist(Student student, MultipartFile file, HttpServletRequest request){
        System.out.println(student);
        String path = request.getRealPath("/");
        File f = new File(path+"/"+file.getOriginalFilename());
        try{
            FileUtils.copyInputStreamToFile(file.getInputStream(),f);
        }catch (Exception e){
            System.out.println(e);
        }
        student.setSpictrue(file.getOriginalFilename());
        StudentDao studentDao = new StudentDao();
        int n = studentDao.regist(student);
        if(n > 0){
            return "login";
        }
        return "redirect:/regist.jsp";
    }

   /* @RequestMapping("regist")
    public String regist(Student student){
        System.out.println(student);
        StudentDao studentDao = new StudentDao();
        int n = studentDao.regist(student);
        if(n > 0){
            return "login";
        }
        return "redirect:/regist.jsp";
    }
*/

}
