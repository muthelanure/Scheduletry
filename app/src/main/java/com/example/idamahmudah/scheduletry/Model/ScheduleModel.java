package com.example.idamahmudah.scheduletry.Model;

/**
 * Created by lenovo on 05/04/2017.
 */

public class ScheduleModel {
    private String schedule_id, classRoom, class_location, day, key, time;

    public ScheduleModel() {
    }

    public ScheduleModel(String schedule_id, String classRoom, String class_location, String day, String key, String time) {
        this.schedule_id = schedule_id;
        this.classRoom = classRoom;
        this.class_location = class_location;
        this.day = day;
        this.key = key;
        this.time = time;
    }

    public String getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(String schedule_id) {
        this.schedule_id = schedule_id;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getClass_location() {
        return class_location;
    }

    public void setClass_location(String class_location) {
        this.class_location = class_location;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
