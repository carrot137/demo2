package com.example.demo2.form;

import java.util.List;

public class Ex17QuestionnaireForm {
     private String name;
    private String email;
    private List<Integer>genderList;
    private List<Integer>hobbyList;
    private List<Integer>langList;
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
    public List<Integer> getGenderList() {
        return genderList;
    }
    public void setGenderList(List<Integer> genderList) {
        this.genderList = genderList;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<Integer> getLangList() {
        return langList;
    }
    public void setLangList(List<Integer> langList) {
        this.langList = langList;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    
}