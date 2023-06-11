package com.jeesite.modules.tsgz.ylrd.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.ylrd.entity.ViewTsgzYlrd;
import com.jeesite.modules.tsgz.ylrd.dao.ViewTsgzYlrdDao;

/**
 * 态势感知,舆论热点Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewTsgzYlrdService extends CrudService<ViewTsgzYlrdDao, ViewTsgzYlrd> {
	
	/**
	 * 获取单条数据
	 * @param viewTsgzYlrd
	 * @return
	 */
	@Override
	public ViewTsgzYlrd get(ViewTsgzYlrd viewTsgzYlrd) {
		return super.get(viewTsgzYlrd);
	}
	
	/**
	 * 查询分页数据
	 * @param viewTsgzYlrd 查询条件
	 * @param viewTsgzYlrd page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewTsgzYlrd> findPage(ViewTsgzYlrd viewTsgzYlrd) {
		return super.findPage(viewTsgzYlrd);
	}
	
	/**
	 * 查询列表数据
	 * @param viewTsgzYlrd
	 * @return
	 */
	@Override
	public List<ViewTsgzYlrd> findList(ViewTsgzYlrd viewTsgzYlrd) {
		return super.findList(viewTsgzYlrd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewTsgzYlrd
	 */
	@Override
	@Transactional
	public void save(ViewTsgzYlrd viewTsgzYlrd) {
		super.save(viewTsgzYlrd);
	}
	
	/**
	 * 更新状态
	 * @param viewTsgzYlrd
	 */
	@Override
	@Transactional
	public void updateStatus(ViewTsgzYlrd viewTsgzYlrd) {
		super.updateStatus(viewTsgzYlrd);
	}
	
	/**
	 * 删除数据
	 * @param viewTsgzYlrd
	 */
	@Override
	@Transactional
	public void delete(ViewTsgzYlrd viewTsgzYlrd) {
		super.delete(viewTsgzYlrd);
	}
	
}