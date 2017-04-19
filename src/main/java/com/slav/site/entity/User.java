package com.slav.site.entity;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    private long id;

    private String username;
    private String firstName;
    private String lastName;

    //Temporary -> password encryption to be implemented in the future
    private String password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Id
    @Column(name = "Userid")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
