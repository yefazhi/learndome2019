package com.relaxam.lanhai.service;

import com.relaxam.lanhai.bean.BaseAttrInfo;
import com.relaxam.lanhai.bean.BaseCatalog1;
import com.relaxam.lanhai.bean.BaseCatalog2;
import com.relaxam.lanhai.bean.BaseCatalog3;

import java.util.List;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/4 12:31
 */
public interface ManageService {

    public List<BaseCatalog1> getCatalog1();

    public List<BaseCatalog2> getCatalog2(String catalog1Id);

    public List<BaseCatalog3> getCatalog3(String catalog2Id);

    public List<BaseAttrInfo> getAttrList(String catalog3Id);

    public void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    BaseAttrInfo getAttrInfo(String attrId);
}
