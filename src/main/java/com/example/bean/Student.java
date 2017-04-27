package com.example.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by root on 2017/4/26.
 */
@Entity
@Table(name = "T_Student")
public class Student extends BaseEntity {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String school;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
