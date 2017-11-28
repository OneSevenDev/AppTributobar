package com.trujillodev.apptributobar.models;

/**
 * Created by Guarniz on 28/11/2017.
 */

public class Person {
    private String lastName;
    private String dni;
    private int age;
    private String status;
    private String name;
    private String origin;
    private String photo_profile;
    private String birthdate;

    public Person(String lastName, String dni, int age, String status, String name, String origin, String photo_profile, String birthdate) {
        this.lastName = lastName;
        this.dni = dni;
        this.age = age;
        this.status = status;
        this.name = name;
        this.origin = origin;
        this.photo_profile = photo_profile;
        this.birthdate = birthdate;
    }

    public Person() {
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getPhoto_profile() {
        return photo_profile;
    }

    public void setPhoto_profile(String photo_profile) {
        this.photo_profile = photo_profile;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
