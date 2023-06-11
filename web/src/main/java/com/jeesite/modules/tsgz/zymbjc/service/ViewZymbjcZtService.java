package com.jeesite.modules.tsgz.zymbjc.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.zymbjc.entity.ViewZymbjcZt;
import com.jeesite.modules.tsgz.zymbjc.dao.ViewZymbjcZtDao;

/**
 * 态势感知-重要目标监测Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewZymbjcZtService extends CrudService<ViewZymbjcZtDao, ViewZymbjcZt> {
	
	/**
	 * 获取单条数据
	 * @param viewZymbjcZt
	 * @return
	 */
	@Override
	public ViewZymbjcZt get(ViewZymbjcZt viewZymbjcZt) {
		return super.get(viewZymbjcZt);
	}
	
	/**
	 * 查询分页数据
	 * @param viewZymbjcZt 查询条件
	 * @param viewZymbjcZt page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewZymbjcZt> findPage(ViewZymbjcZt viewZymbjcZt) {
		return super.findPage(viewZymbjcZt);
	}
	
	/**
	 * 查询列表数据
	 * @param viewZymbjcZt
	 * @return
	 */
	@Override
	public List<ViewZymbjcZt> findList(ViewZymbjcZt viewZymbjcZt) {
		return super.findList(viewZymbjcZt);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewZymbjcZt
	 */
	@Override
	@Transactional
	public void save(ViewZymbjcZt viewZymbjcZt) {
		super.save(viewZymbjcZt);
	}
	
	/**
	 * 更新状态
	 * @param viewZymbjcZt
	 */
	@Override
	@Transactional
	public void updateStatus(ViewZymbjcZt viewZymbjcZt) {
		super.updateStatus(viewZymbjcZt);
	}
	
	/**
	 * 删除数据
	 * @param viewZymbjcZt
	 */
	@Override
	@Transactional
	public void delete(ViewZymbjcZt viewZymbjcZt) {
		super.delete(viewZymbjcZt);
	}
	
}