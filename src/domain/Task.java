/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author Filip
 */
public class Task implements DomainObject {

    private String title;
    private String description;
    private AppUser appUser;
    private LocalDate startDate;
    private LocalDate endDate;
    private TaskStatus taskStatus;

    public Task() {
    }

    public Task(String title, String description, AppUser appUser, LocalDate startDate, LocalDate endDate, TaskStatus taskStatus) {
        this.title = title;
        this.description = description;
        this.appUser = appUser;
        this.startDate = startDate;
        this.endDate = endDate;
        this.taskStatus = taskStatus;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTitle() {
        return title;
    }

    public Task setTitle(String title) {
        this.title = title;

        return this;
    }

    public String getDescription() {
        return description;
    }

    public Task setDescription(String description) {
        this.description = description;

        return this;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public Task setAppUser(AppUser appUser) {
        this.appUser = appUser;

        return this;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public Task setStartDate(LocalDate startDate) {
        this.startDate = startDate;

        return this;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public Task setEndDate(LocalDate endDate) {
        this.endDate = endDate;

        return this;
    }

    @Override
    public String toString() {
        return "Task{ " + title + " }";
    }

    
}
