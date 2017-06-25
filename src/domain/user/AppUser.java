/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.user;

import domain.DomainObject;
import domain.task.Task;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AppUser implements DomainObject, Cloneable {

    private int id;
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
    private UserTitle title;
    private List<Task> allTasks = new ArrayList<>();

    public UserTitle getTitle() {
        return title;
    }

    public AppUser setTitle(UserTitle title) {
        this.title = title;

        return this;
    }

    public int getId() {
        return id;
    }

    public AppUser setId(int id) {
        this.id = id;

        return this;
    }

    public LocalDate getLastActive() {
        return lastActive;
    }

    public AppUser setLastActive(LocalDate lastActive) {
        this.lastActive = lastActive;

        return this;
    }

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

    public AppUser setAllTasks(List<Task> allTasks) {
        this.allTasks = allTasks;

        return this;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new AppUser()
                .setId(id)
                .setUsername(username)
                .setFirstname(firstname)
                .setLastname(lastname)
                .setLastActive(lastActive)
                .setEmail(email)
                .setAddress((Address) address.clone())
                .setBaned(baned)
                .setTitle(title)
                .setAllTasks(allTasks)
                .setStatus(status);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.username);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AppUser other = (AppUser) obj;
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

}
