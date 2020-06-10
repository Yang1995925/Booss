package com.Boos.entity;

public class Users {
    private Integer id;

    private String icon;

    private String nickname;

    private String password;

    private String gender;

    private String brithday;

    private String highesteducation;

    private String graduateschool;

    private String phone;

    private String email;

    private String account;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBrithday() {
        return brithday;
    }

    public void setBrithday(String brithday) {
        this.brithday = brithday == null ? null : brithday.trim();
    }

    public String getHighesteducation() {
        return highesteducation;
    }

    public void setHighesteducation(String highesteducation) {
        this.highesteducation = highesteducation == null ? null : highesteducation.trim();
    }

    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool == null ? null : graduateschool.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }
}