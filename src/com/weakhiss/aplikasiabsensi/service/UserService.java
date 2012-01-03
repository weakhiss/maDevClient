/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.weakhiss.aplikasiabsensi.service;

import com.weakhiss.aplikasiabsensi.model.Employee;
import com.weakhiss.aplikasiabsensi.model.User;
import java.util.List;

/**
 *
 * @author Jeks
 */
public interface UserService {

    public void save(Employee employee);
    public void delete(Employee employee);
    public Employee getEmployee(Long id);
    public List<Employee> getEmployees();    
    
    public User getUser(String userName, String password);
}
