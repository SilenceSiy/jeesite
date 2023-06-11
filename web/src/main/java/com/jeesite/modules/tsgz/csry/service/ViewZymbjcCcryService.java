package com.jeesite.modules.tsgz.csry.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.csry.entity.ViewZymbjcCcry;
import com.jeesite.modules.tsgz.csry.dao.ViewZymbjcCcryDao;

/**
 * 态势感知-主要目标监测-参赛人员Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewZymbjcCcryService extends CrudService<ViewZymbjcCcryDao, ViewZymbjcCcry> {
	
	/**
	 * 获取单条数据
	 * @param viewZymbjcCcry
	 * @return
	 */
	@Override
	public ViewZymbjcCcry get(ViewZymbjcCcry viewZymbjcCcry) {
		return super.get(viewZymbjcCcry);
	}
	
	/**
	 * 查询分页数据
	 * @param viewZymbjcCcry 查询条件
	 * @param viewZymbjcCcry page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewZymbjcCcry> findPage(ViewZymbjcCcry viewZymbjcCcry) {
		return super.findPage(viewZymbjcCcry);
	}
	
	/**
	 * 查询列表数据
	 * @param viewZymbjcCcry
	 * @return
	 */
	@Override
	public List<ViewZymbjcCcry> findList(ViewZymbjcCcry viewZymbjcCcry) {
		return super.findList(viewZymbjcCcry);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewZymbjcCcry
	 */
	@Override
	@Transactional
	public void save(ViewZymbjcCcry viewZymbjcCcry) {
		super.save(viewZymbjcCcry);
	}
	
	/**
	 * 更新状态
	 * @param viewZymbjcCcry
	 */
	@Override
	@Transactional
	public void updateStatus(ViewZymbjcCcry viewZymbjcCcry) {
		super.updateStatus(viewZymbjcCcry);
	}
	
	/**
	 * 删除数据
	 * @param viewZymbjcCcry
	 */
	@Override
	@Transactional
	public void delete(ViewZymbjcCcry viewZymbjcCcry) {
		super.delete(viewZymbjcCcry);
	}
	
}