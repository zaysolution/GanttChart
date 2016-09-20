package com.zay.ganttchart.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by kibrom on 7/8/16.
 */
public interface Dao {

    public <T> Serializable insert(final T entity);

    public <T> T update(final T entity);

    public <T> void delete(final T entity);

    public <T> List findAll(String query);

    public <T> List<T> findAll(Class<T> entityClass);

    <T> T findById(Serializable id,Class<T> entityClass);

}
