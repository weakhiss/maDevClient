/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhiss.aplikasiabsensi.dao;

import com.weakhiss.aplikasiabsensi.model.Employee;

/**
 *
 * @author Jeks
 */
public interface EmployeeDao extends BaseDao<Employee> {

    public Employee getEmployee(Long id);
}
