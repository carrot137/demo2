package com.example.demo2.form;

import java.util.List;

public class Ex17QuestionnaireForm {
     private String name;
    private String email;
    private List<Integer>gender;
    private List<Integer>hobbyList;
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
    public List<Integer> getGender() {
        return gender;
    }
    public void setGender(List<Integer> gender) {
        this.gender = gender;
    }
    public List<Integer> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<Integer> hobbyList) {
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
    public Integer[] getGenderList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGenderList'");
    }

    

}
