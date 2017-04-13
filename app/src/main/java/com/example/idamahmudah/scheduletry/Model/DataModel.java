package com.example.idamahmudah.scheduletry.Model;

/**
 * Created by lenovo on 05/04/2017.
 */

public class DataModel {
    private String classRoom, faculty, id_user, major, name, nim, role;

    public DataModel() {
    }

    public DataModel(String classRoom, String faculty, String id_user, String major, String name, String nim, String role) {
        this.classRoom = classRoom;
        this.faculty = faculty;
        this.id_user = id_user;
        this.major = major;
        this.name = name;
        this.nim = nim;
        this.role = role;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getId_user() {
        return id_user;
    }

    public void setId(String id_user) {
        this.id_user = id_user;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
