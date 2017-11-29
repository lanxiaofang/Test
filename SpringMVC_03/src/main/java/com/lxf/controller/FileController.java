package com.lxf.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

@Controller
public class FileController {

    @RequestMapping("test")
    public String test(MultipartFile file, HttpServletRequest request){
        System.out.println("miaomiao");
        System.out.println(file.getOriginalFilename());
        System.out.println(file.getContentType());
        String path = request.getRealPath("/");
        System.out.println(path);
        File f = new File(path+"/"+file.getOriginalFilename());
        try{
            FileUtils.copyInputStreamToFile(file.getInputStream(),f);
        }catch (Exception e){
            System.out.println(e);
        }
        return "index";
    }
}
