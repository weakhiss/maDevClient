/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhis.aplikasiabsensi.dao.impl;

import com.weakhis.aplikasiabsensi.dao.UserDAO;
import com.weakhis.aplikasiabsensi.model.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author kojek
 */
@Repository(value="userDaoHibernate")
public class UserDaoHibernate extends BaseDaoHibernate<User> implements UserDAO {

    public User getUser(Long id) {
        User user = (User) sessionFactory.getCurrentSession().get(User.class, id);        
        return user;
    }

    public User getUser(String userName, String password) {
        User user = (User) sessionFactory.getCurrentSession().createQuery("from User u " +
                "where u.name=:name " +
                "and u.password=:password")
                .setString("name", userName)
                .setString("password", password).uniqueResult();
        
        return user;
    }
    
}
