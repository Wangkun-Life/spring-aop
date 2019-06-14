package com.spring.aop.entry;

public class User {

    private String userId;

    private String userName;

    private String occupation;

    private String sex;

    private Integer age;

    public User() {
    }

    public User(String userId, String userName, String occupation, String sex, Integer age) {
        this.userId = userId;
        this.userName = userName;
        this.occupation = occupation;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", occupation='" + occupation + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
