package com.relaxam.lanhai.bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/4 12:16
 */
public class BaseAttrInfo implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName;
    @Column
    private String catalog3Id;

    @Transient
    private List<BaseAttrValue> attrValueList;

    public String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName( String attrName) {
        this.attrName = attrName;
    }

    public String getCatalog3Id() {
        return catalog3Id;
    }

    public void setCatalog3Id( String catalog3Id) {
        this.catalog3Id = catalog3Id;
    }

    public List<BaseAttrValue> getAttrValueList() {
        return attrValueList;
    }

    public void setAttrValueList( List<BaseAttrValue> attrValueList) {
        this.attrValueList = attrValueList;
    }
}
