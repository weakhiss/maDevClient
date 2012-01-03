/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.weakhis.aplikasiabsensi.dao;

import com.weakhis.aplikasiabsensi.model.GroupWork;

/**
 *
 * @author Jeks
 */
public interface GroupWorkDao extends BaseDao<GroupWork> {
    
    public GroupWork getGroupWork(Long id);
}
