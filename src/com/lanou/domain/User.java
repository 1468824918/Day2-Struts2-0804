package com.lanou.domain;

/**
 * Created by dllo on 17/10/24.
 */
public class User {
    private String username;
    private String password;
    private String affirm;
    private String gender;
    private String hobbies;
    private String email;

    public User() {
    }

    public User(String username, String password, String affirm, String gender, String hobbies, String email) {
        this.username = username;
        this.password = password;
        this.affirm = affirm;
        this.gender = gender;
        this.hobbies = hobbies;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", affirm='" + affirm + '\'' +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAffirm() {
        return affirm;
    }

    public void setAffirm(String affirm) {
        this.affirm = affirm;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }
}
