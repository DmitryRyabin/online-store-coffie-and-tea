package ru.store.online.model;

import ru.store.online.model.enums.Role;

public class User {

    private String name;

    private String surname;

    private String phone;

    private String email;

    private String login;

    private String password;

    private Role role;

    public User(String name, String phone, String login, String password, Role role) {
        this.name = name;
        this.phone = phone;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public String getPhone() {
        return phone;
    }
    public String getEmail() {
        return email;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public Role getRole() {
        return role;
    }
}
