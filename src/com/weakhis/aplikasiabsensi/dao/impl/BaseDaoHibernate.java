/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhis.aplikasiabsensi.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author kojek
 */
public class BaseDaoHibernate<T> {

    @SuppressWarnings("unchecked")
    protected Class domainClass;
    
    @Autowired protected SessionFactory sessionFactory;
    

    @SuppressWarnings("unchecked")
    public BaseDaoHibernate() {
        this.domainClass = (Class) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public void save(T domain) {
        sessionFactory.getCurrentSession().saveOrUpdate(domain);
    }

    public void merge(T domain) {
        sessionFactory.getCurrentSession().merge(domain);
    }

    public void delete(T domain) {
            sessionFactory.getCurrentSession().delete(domain);
    }

    @SuppressWarnings("unchecked")
    public Long countAll() {
        List list = sessionFactory.getCurrentSession().createQuery(
                "select count(*) from " + domainClass.getName() + " x").list();
        Long count = (Long) list.get(0);
        return count;
    }

    @SuppressWarnings("unchecked")
    public List<T> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName()).list();
    }

}
