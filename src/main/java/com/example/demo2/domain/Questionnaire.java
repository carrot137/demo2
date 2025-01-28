package com.example.demo2.domain;

import java.util.List;

public class Questionnaire {

    private String name;
    private String email;
    private List<String>gender;
    private List<String>hobbyList;
    private String lang;
    private String comment;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<String> getGender() {
        return gender;
    }
    public void setGender(List<String> gender) {
        this.gender = gender;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
}
