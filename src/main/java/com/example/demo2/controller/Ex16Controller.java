package com.example.demo2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo2.domain.User2;

import jakarta.servlet.ServletContext;

@Controller
@RequestMapping("/ex16")
public class Ex16Controller {
     @Autowired
    private ServletContext application;

    @RequestMapping("")
    public String index() {
        @SuppressWarnings("unchecked")
        List<User2> userList = (List<User2>) application.getAttribute("userList"); //Listは標準パッケージ　
        if (userList == null) {                                                       //Userはクラス userListは変数
            userList = new ArrayList<>();
            application.setAttribute("userList", userList);
        }
        return "ex-16";
    }

    @RequestMapping("/post")
    public String post(String name, String comment) {
        @SuppressWarnings("unchecked")
        List<User2> userList = (List<User2>) application.getAttribute("userList");
        userList.add(0, new User2(name, comment));
        return "ex-16";
    }
}

   
