package com.example.idamahmudah.scheduletry.Model;

/**
 * Created by lenovo on 13/04/2017.
 */

public class SignUpEmailModel {
    private String email, password;

    public SignUpEmailModel() {
    }

    public SignUpEmailModel(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
