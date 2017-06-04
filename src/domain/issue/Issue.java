/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.issue;

import domain.DomainObject;
import java.time.LocalDate;

/**
 *
 * @author Nikola
 */
public class Issue implements DomainObject {

    private String title;
    private String description;
    private String helpText;
    private String userMail;
    private LocalDate createdAt;
    private IssueStatus issueStatus;
    private LocalDate resolvedAt;

    public String getTitle() {
        return title;
    }

    public Issue setTitle(String title) {
        this.title = title;

        return this;
    }

    public String getDescription() {
        return description;
    }

    public Issue setDescription(String description) {
        this.description = description;

        return this;
    }

    public String getHelpText() {
        return helpText;
    }

    public Issue setHelpText(String helpText) {
        this.helpText = helpText;

        return this;
    }

    public String getUserMail() {
        return userMail;
    }

    public Issue setUserMail(String userMail) {
        this.userMail = userMail;

        return this;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public Issue setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;

        return this;
    }

    public IssueStatus getIssueStatus() {
        return issueStatus;
    }

    public Issue setIssueStatus(IssueStatus issueStatus) {
        this.issueStatus = issueStatus;

        return this;
    }

    public LocalDate getResolvedAt() {
        return resolvedAt;
    }

    public Issue setResolvedAt(LocalDate resolvedAt) {
        this.resolvedAt = resolvedAt;

        return this;
    }

}
