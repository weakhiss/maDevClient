/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhis.aplikasiabsensi.dao;

import java.util.List;

/**
 *
 * @author kojek
 */
public interface BaseDao<T> {
    
    public void save(T domain);

    public void delete(T domain);
    
    public void merge(T domain);
    
    public List<T> getAll();
    
    public Long countAll();
    
}
