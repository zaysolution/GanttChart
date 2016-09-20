package com.zay.ganttchart.dao;

import org.hibernate.SessionFactory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kibrom on 7/8/16.
 */
public class DaoImpl implements Dao {

    SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public <T> Serializable insert(T entity) {

        return sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public <T> T update(T entity) {

        sessionFactory.getCurrentSession().update(entity);

        return entity;
    }

    @Override
    public <T> void delete(T entity) {

        sessionFactory.getCurrentSession().delete(entity);

    }
    @Override
    public <T> List findAll(String query) {

        return sessionFactory.getCurrentSession().createSQLQuery(query).list();
    }

    @Override
    public <T> List<T> findAll(Class<T> entityClass){
        return sessionFactory.getCurrentSession().createQuery("From" +entityClass).list();
    }

    @Override
    public <T> T findById(Serializable id,Class<T> entityClass) {
        return (T)sessionFactory.getCurrentSession().get(entityClass,id);
    }

}
