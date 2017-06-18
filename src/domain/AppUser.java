/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nikola
 */
public class AppUser implements DomainObject{

    private String firstname;
    private String lastname;
    private String username;
    private String email;
    private StatusType status;
    private boolean baned;
    private String imagePath;
    private String password;
    private Address address;
    private LocalDate lastActive;
    private List<Task> allTasks = new ArrayList<>();

    public AppUser() {
    }

    public AppUser(String firstname, String lastname, String username, String email, StatusType status, boolean baned, String imagePath, String password, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.email = email;
        this.status = status;
        this.baned = baned;
        this.imagePath = imagePath;
        this.address = address;
        this.password = password;
    }
    
    public List<Task> getAllTasks() {
        return allTasks;
    }

    public void setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;
    }

    public LocalDate getLastActive() {
        return lastActive;
    }

    public void setLastActive(LocalDate lastActive) {
        this.lastActive = lastActive;
    }

    public String getFirstname() {
        return firstname;
    }

    public AppUser setFirstname(String firstname) {
        this.firstname = firstname;

        return this;
    }

    public String getLastname() {
        return lastname;
    }

    public AppUser setLastname(String lastname) {
        this.lastname = lastname;

        return this;
    }

    public String getUsername() {
        return username;
    }

    public AppUser setUsername(String username) {
        this.username = username;

        return this;
    }

    public String getEmail() {
        return email;
    }

    public AppUser setEmail(String email) {
        this.email = email;

        return this;
    }

    public StatusType getStatus() {
        return status;
    }

    public AppUser setStatus(StatusType status) {
        this.status = status;

        return this;
    }

    public boolean isBaned() {
        return baned;
    }

    public AppUser setBaned(boolean baned) {
        this.baned = baned;

        return this;
    }

    public String getImagePath() {
        return imagePath;
    }

    public AppUser setImagePath(String imagePath) {
        this.imagePath = imagePath;

        return this;
    }

    public String getPassword() {
        return password;
    }

    public AppUser setPassword(String password) {
        this.password = password;

        return this;
    }

    public Address getAddress() {
        return address;
    }

    public AppUser setAddress(Address address) {
        this.address = address;

        return this;
    }

    @Override
    public String toString() {
        return lastname + " " + firstname;
    }

    
}
