/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.weakhiss.aplikasiabsensi.service.impl;

import com.weakhiss.aplikasiabsensi.dao.EmployeeDao;
import com.weakhiss.aplikasiabsensi.dao.UserDAO;
import com.weakhiss.aplikasiabsensi.dao.impl.EmployeeDaoHibernate;
import com.weakhiss.aplikasiabsensi.dao.impl.UserDaoHibernate;
import com.weakhiss.aplikasiabsensi.model.Employee;
import com.weakhiss.aplikasiabsensi.model.User;
import com.weakhiss.aplikasiabsensi.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Jeks
 */
@Repository("userService")
@Transactional(readOnly=true)
public class UserServiceImpl implements UserService{
    
    private EmployeeDao employeeDao;
    private UserDAO userDao;

    @Autowired
    public void setEmployeeDao(@Qualifier("employeeDaoHibernate")EmployeeDaoHibernate employeeDao) {
        this.employeeDao = employeeDao;
    }
    
    @Autowired
    public void setUserDAO(@Qualifier("userDaoHibernate")UserDaoHibernate userDao) {
        this.userDao = userDao;
    }
    
    @Transactional(readOnly=false,propagation=Propagation.REQUIRED)
    public void save(Employee employee) {
        employeeDao.save(employee);
    }

    @Transactional(readOnly=false,propagation=Propagation.REQUIRED)
    public void delete(Employee employee) {
        employeeDao.delete(employee);
    }

    public Employee getEmployee(Long id) {
        return employeeDao.getEmployee(id);
    }

    public List<Employee> getEmployees() {
        return employeeDao.getAll();
    }

    public User getUser(String userName, String password) {
        return userDao.getUser(userName, password);
    }

}
