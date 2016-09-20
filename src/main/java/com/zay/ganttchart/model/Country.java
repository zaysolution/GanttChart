package com.zay.ganttchart.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by kibrom on 7/7/16.
 */
@Entity
@Table(name ="ppc_country")
public class Country implements Serializable {

    private static final long serialVersionUID = 8670372229906232622L;

    @Id
    @Column(name="code")
    private String code;

    @Column(name ="name")
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
