package com.example.demo.entity;

public class User {
    private String name;
    private String birthdate;

    User(){}

    User(String name,String date){
        this.name=name;
        this.birthdate=date;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getBirthdate(){
        return this.birthdate;
    }
    public void setBirthdate(String date){
        this.birthdate=date;
    }
}
