package com.example.demo2.domain;

import java.util.List;

public class Questionnaire {

    private String name;
    private String email;
    private List<String>genderList;
    private List<String>hobbyList;
    private List<String>langList;
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
    public List<String> getGenderList() {
        return genderList;
    }
    public void setGenderList(List<String> genderList) {
        this.genderList = genderList;
    }
    public List<String> getHobbyList() {
        return hobbyList;
    }
    public void setHobbyList(List<String> hobbyList) {
        this.hobbyList = hobbyList;
    }
    public List<String> getLangList() {
        return langList;
    }
    public void setLangList(List<String> langList) {
        this.langList = langList;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
