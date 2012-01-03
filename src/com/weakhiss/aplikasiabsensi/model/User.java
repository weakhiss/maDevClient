/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhiss.aplikasiabsensi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author kojek
 */
@Entity
@Table(name="T_USER")
public class User {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="ID_USER")
    private long id;
    
    @Column(name="NAME",nullable=false,unique=true,length=100)
    private String name;
    
    @Column(name="PASSWORD",nullable=false,length=100)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
