/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.settings;

import domain.user.AppUser;
import java.time.LocalDate;

/**
 *
 * @author Filip
 */
public class UserSettings implements domain.DomainObject {

    private GeneralSettings generalSettings;
    private AppUser appUser;
    private String value;
    private LocalDate date;

    public GeneralSettings getGeneralSettings() {
        return generalSettings;
    }

    public void setGeneralSettings(GeneralSettings generalSettings) {
        this.generalSettings = generalSettings;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

}
