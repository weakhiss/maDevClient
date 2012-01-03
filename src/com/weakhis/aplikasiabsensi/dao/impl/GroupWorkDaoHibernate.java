/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.weakhis.aplikasiabsensi.dao.impl;

import com.weakhis.aplikasiabsensi.dao.GroupWorkDao;
import com.weakhis.aplikasiabsensi.model.GroupWork;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jeks
 */
@Repository("groupDaoHibernate")
public class GroupWorkDaoHibernate extends BaseDaoHibernate<GroupWork> implements GroupWorkDao{    

    public GroupWork getGroupWork(Long id) {
        GroupWork groupWork = 
                (GroupWork) sessionFactory.getCurrentSession()
                .createQuery("from GroupWork g left join fetch g.employees where g.id=?")
                .setParameter(0, id).uniqueResult();
        return groupWork;
    }

}
