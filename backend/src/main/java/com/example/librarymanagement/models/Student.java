package com.example.librarymanagement.models;

public class Student {

    private String fullName;
    private String mobileNo;
    private String emailId;
    private String password;
    private int age;
    private String gender;
    private String course;
    private String hobbies;
    private String address;

    public Student() {
    }

    public Student(String fullName, String mobileNo, String emailId,
                   String password, int age, String gender,
                   String course, String hobbies, String address) {

        this.fullName = fullName;
        this.mobileNo = mobileNo;
        this.emailId = emailId;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.hobbies = hobbies;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}

   