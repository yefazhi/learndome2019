package com.relaxam.lanhai.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @author: yefazhi
 * @create:2019/10/3 16:53
 */
@Controller
public class ManageController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }

    @RequestMapping("attrListPage")
    public String attrListPage(){
        return "attrListPage";
    }

    @RequestMapping("spuListPage")
    public String getSpuListPage(){
        return "spuListPage";
    }
}
