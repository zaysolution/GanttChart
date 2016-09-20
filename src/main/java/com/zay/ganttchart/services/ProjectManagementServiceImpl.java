package com.zay.ganttchart.services;

import com.zay.ganttchart.dao.DaoImpl;

/**
 * Created by kibrom on 9/20/16.
 */
public class ProjectManagementServiceImpl implements ProjectManagementService {

    DaoImpl dao;

    public void setDao(DaoImpl dao) {this.dao = dao;}
}
