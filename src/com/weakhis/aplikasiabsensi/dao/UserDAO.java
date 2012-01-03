/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhis.aplikasiabsensi.dao;

import com.weakhis.aplikasiabsensi.model.User;

/**
 *
 * @author kojek
 */
public interface UserDAO extends BaseDao<User>   {
    
    public User getUser(Long id);
    
    public User getUser(String userName, String password);
    
}
