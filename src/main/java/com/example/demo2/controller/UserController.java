package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo2.domain.User;
import com.example.demo2.form.UserForm;
import com.example.demo2.servis.UserServis;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("")
    public String index(Model model){
        Map<Integer,String>hobbyMap=new LinkedHashMap<>();
        hobbyMap.put(1,"野球");
        hobbyMap.put(2,"サッカー");
        hobbyMap.put(3,"テニス");
        hobbyMap.put(4,"陸上");

        model.addAttribute("hobbyMap",hobbyMap);
        return "user/input";
    }
    @RequestMapping("/create")
    public String create(
        UserForm form,RedirectAttributes redirectAttributes
    ){
        User user=new User();
        BeanUtils.copyProperties(form, user);

        List<String>hobbyList=new ArrayList<>();
        for(Integer hobbyCode : form.getHobbyList()){
            switch(hobbyCode){
                case 1:
                hobbyList.add("野球");
                break;
                case 2:
                hobbyList.add("サッカー");
                break;
                case 3:
                hobbyList.add("テニス");
                break;
                case 4:
                hobbyList.add("陸上");
                break;
            }
        }
        user.setHobbyList(hobbyList);
        UserServis userServis =new UserServis();
        user=userServis.save(user);

        redirectAttributes.addFlashAttribute("user",user);
        return "redirect:/user/toresult";
        
    }
    @RequestMapping("/toresult")
    public String toresult(){
        return "user/result";
    }

}
