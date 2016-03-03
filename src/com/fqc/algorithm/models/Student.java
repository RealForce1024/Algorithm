package com.fqc.algorithm.models;

/**
 * Created by fqc on 2016/3/3.
 */
public class Student {
    private String username;
    private Integer age;

    public Student() {
    }

    public Student(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }
}
