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

import com.example.demo2.domain.Questionnaire;
import com.example.demo2.form.Ex17QuestionnaireForm;





@Controller
@RequestMapping("/questionnaire")
public class Ex17QuestionnaireController {
    
    @RequestMapping("")
    public String index(Model model){
        Map<Integer,String>genderMap=new LinkedHashMap<>();
        genderMap.put(1, "男性");
        genderMap.put(2, "女性");
        model.addAttribute("genderMap", genderMap);

        Map<Integer,String>hobbyMap=new LinkedHashMap<>();
        hobbyMap.put(1,"野球");
        hobbyMap.put(2,"サッカー");
        model.addAttribute("hobbyMap",hobbyMap);
        Map<Integer,String>langMap=new LinkedHashMap<>();
        langMap.put(1, "Java");
        langMap.put(2, "Python");
        langMap.put(3, "Ruby");
        langMap.put(4, "C");
        model.addAttribute("langMap",langMap);
        return "user/ex-17-input";  
    }
    @RequestMapping("/create")
    public String create(
        Ex17QuestionnaireForm form,RedirectAttributes redirectAttributes
    ){
        Questionnaire ex17=new Questionnaire();
        BeanUtils.copyProperties(form, ex17);

        List<String>genderList=new ArrayList<>();
        for(Integer genderCode:form.getGenderList()){
            switch(genderCode){
                case 1:
                genderList.add("男性");
                break;
                case 2:
                genderList.add("女性");
                break;
            }
        }
        ex17.setGenderList(genderList);
        List<String>hobbyList=new ArrayList<>();
        for(Integer hobbyCode : form.getHobbyList()){
            switch(hobbyCode){
                case 1:
                hobbyList.add("野球");
                break;
                case 2:
                hobbyList.add("サッカー");
                break;
        }
    } 
    ex17.setHobbyList(hobbyList);
    List<String>langList=new ArrayList<>();
        for(Integer langCode : form.getLangList()){
            switch(langCode){
                case 1:
                langList.add("Java");
                break;
                case 2:
                langList.add("Python");
                break;
                case 3:
                langList.add("Ruby");
                break;
                case 4:
                langList.add("C");
                break;
        }
    } 
    ex17.setLangList(langList);
    //？？
    redirectAttributes.addFlashAttribute("Ex17", ex17);
    return "redirect:/questionnaire/toresult";
}
    @RequestMapping("/toresult")
    public String toresult(){
        return "user/ex-17-result";
    }

        
}

