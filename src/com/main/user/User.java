package com.main.user;

import java.time.LocalDate;

public class User {

    private String login;

    private String name;

    private String surname;

    private final LocalDate dateOfRegistration;

    public User(String login, String name, String surname, LocalDate dateOfRegistration) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }
}
