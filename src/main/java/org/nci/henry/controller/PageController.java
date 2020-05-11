package org.nci.henry.controller;


import org.nci.henry.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * 公布接口url
 * @author Henry
 *
 */
@Controller
@RequestMapping("/page")
public class PageController {

    @Autowired
    IQueryService queryService;

    @RequestMapping("/first")
    public ModelAndView query(@RequestParam("teacher") String teacher){
        String result = queryService.query(teacher);
        Map<String,Object> model = new HashMap<String,Object>();
        model.put("teacher", teacher);
        model.put("data", result);
        model.put("token", "123456");
        return new ModelAndView("first.html",model);
    }

}
