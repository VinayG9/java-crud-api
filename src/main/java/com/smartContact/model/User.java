package com.smartContact.model;
import javax.persistence.*;



@Entity
@Table(name = "USER")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "User_id")
    private int id;
    @Column(name = "User_name")
    private String name;

    @Column(name = "User_Email", unique = true)
    private String email;

    @Column(name = "User_Password")
    private String password;
    @Column(name = "User_Role")
    private String role;
    @Column(name = "User_About", length = 500)
    private String about;




    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }


}
