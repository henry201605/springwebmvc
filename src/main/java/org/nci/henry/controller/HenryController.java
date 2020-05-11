package org.nci.henry.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * 公布接口url
 * @author Henry
 *
 */
@Slf4j
@RestController
@RequestMapping("/henry")
public class HenryController {

	@RequestMapping("/select1")
	public Map<String,Object> query1(HttpServletRequest request, HttpServletResponse response,
									 @RequestParam("name") String name, @RequestParam("age") Integer age){
		Map<String,Object> m = new HashMap<>();
		m.put("name", name);
		m.put("age", age);
		log.info("打印-->{}", m);
		return m;
	}

	@RequestMapping("/select")
	public String query(HttpServletRequest request, HttpServletResponse response,
						  @RequestParam("name") String name, @RequestParam("age") Integer age){
		Map<String,Object> m = new HashMap<>();
		m.put("name", name);
		m.put("age", age);
		log.info("打印-->{}", m);
		return "sfsafdaf";
	}
}
