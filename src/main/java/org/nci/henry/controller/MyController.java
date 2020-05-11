package org.nci.henry.controller;
import org.nci.henry.service.IModifyService;
import org.nci.henry.service.IQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 公布接口url
 * @author Henry
 *
 */
@Controller
@RequestMapping("/web")
public class MyController {

	@Autowired
	IQueryService queryService;
	@Autowired
	IModifyService modifyService;

	@RequestMapping("/query")
	public ModelAndView query(HttpServletRequest request, HttpServletResponse response,
							  @RequestParam("name") String name){
		String result = queryService.query(name);
		return out(response,result);
	}
	
	@RequestMapping("/add*")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response,
							@RequestParam("name") String name, @RequestParam("addr") String addr){
		try {
			String result = modifyService.add(name, addr);
			return out(response,result);
		}catch (Throwable e){
			Map<String,String> model = new HashMap<String,String>();
			model.put("detail",e.getCause().getMessage());
			model.put("stackTrace", Arrays.toString(e.getStackTrace()));
			return new ModelAndView("500",model);
		}
	}
	
	@RequestMapping("/remove")
	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response,
								 @RequestParam("id") Integer id){
		String result = modifyService.remove(id);
		return out(response,result);
	}
	
	@RequestMapping("/edit")
	public ModelAndView edit(HttpServletRequest request,HttpServletResponse response,
			@RequestParam("id") Integer id,
			@RequestParam("name") String name){
		String result = modifyService.edit(id,name);
		return out(response,result);
	}
	
	
	
	private ModelAndView out(HttpServletResponse resp,String str){
		try {
			resp.getWriter().write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
