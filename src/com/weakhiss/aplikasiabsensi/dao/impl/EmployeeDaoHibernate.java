/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.weakhiss.aplikasiabsensi.dao.impl;

import com.weakhiss.aplikasiabsensi.dao.EmployeeDao;
import com.weakhiss.aplikasiabsensi.model.Employee;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jeks
 */
@Repository("employeeDaoHibernate")
public class EmployeeDaoHibernate extends BaseDaoHibernate<Employee> implements EmployeeDao{

    public Employee getEmployee(Long id) {
        return (Employee) sessionFactory.getCurrentSession()
                .createQuery("from Employee p left join fetch p.group where p.id=?")
                .setParameter(0, id).uniqueResult();
    }
}
