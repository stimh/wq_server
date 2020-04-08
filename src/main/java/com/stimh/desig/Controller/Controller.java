package com.stimh.desig.Controller;


import com.stimh.desig.Interface.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private UserInterface userInterface;

    @RequestMapping("/")
    public String first(){
        return "my first springboot";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }


    @RequestMapping("/getuserlist")
    public List getUserlist(){
        List list =  userInterface.findbyid(1);
        return list;
    }

    @GetMapping("/findid/{id}")
    public List getUserList_m(@PathVariable("id") int id){
        List list =  userInterface.findbyid(id);
        return list;
    }

    @GetMapping("/list/pagenum/{id}")
    public List getlist(@PathVariable("id") int id){
        List list =  userInterface.pageList(id,2);
        return list;
    }

}
