package org.nci.henry.service.impl;

import org.nci.henry.service.IModifyService;
import org.springframework.stereotype.Service;

/**
 * 增删改业务
 * @author Henry
 *
 */
@Service
public class ModifyService implements IModifyService {

	/**
	 * 增加
	 */
	@Override
	public String add(String name, String addr) throws Exception{
		throw new Exception("这是Henry故意抛出来的异常");

//		return "modifyService add,name=" + name + ",addr=" + addr;
	}

	/**
	 * 修改
	 */
	@Override
	public String edit(Integer id, String name) {
		return "modifyService edit,id=" + id + ",name=" + name;
	}

	/**
	 * 删除
	 */
	@Override
	public String remove(Integer id) {
		return "modifyService id=" + id;
	}
	
}
