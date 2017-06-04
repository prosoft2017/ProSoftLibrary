/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.user;

import domain.DomainObject;

/**
 *
 * @author Filip
 */
public class Country implements DomainObject{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Country setName(String name) {
        this.name = name;
        
        return this;
    }
    
    
}
