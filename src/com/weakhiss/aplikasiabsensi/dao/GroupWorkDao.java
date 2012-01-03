/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhiss.aplikasiabsensi.dao;

import com.weakhiss.aplikasiabsensi.model.GroupWork;

/**
 *
 * @author Jeks
 */
public interface GroupWorkDao extends BaseDao<GroupWork> {
    
    public GroupWork getGroupWork(Long id);
}
