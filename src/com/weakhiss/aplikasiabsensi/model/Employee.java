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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Jeks
 */
@Entity
@Table(name="T_EMPLOYEE")
public class Employee implements java.io.Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="ID_EMPLOYEE")
    private Long id;
    
    @Column(name="NAME",nullable=false,unique=true,length=100)
    private String name;

    @ManyToOne
    @JoinColumn(name="ID_GROUP_WORK")
    private GroupWork groupWork;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupWork getGroupWork() {
        return groupWork;
    }

    public void setGroupWork(GroupWork groupWork) {
        this.groupWork = groupWork;
    }

    
}
