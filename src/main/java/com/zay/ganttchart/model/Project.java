package com.zay.ganttchart.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kibrom on 9/20/16.
 */
@Entity
@Table(name="project")
public class Project {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="startDate")
    private Date startDate;

    @Column(name="durationStep")
    private String durationStep;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDurationStep() {
        return durationStep;
    }

    public void setDurationStep(String durationStep) {
        this.durationStep = durationStep;
    }
}
