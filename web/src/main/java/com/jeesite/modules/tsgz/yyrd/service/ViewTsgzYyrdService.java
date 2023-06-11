package com.jeesite.modules.tsgz.yyrd.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.yyrd.entity.ViewTsgzYyrd;
import com.jeesite.modules.tsgz.yyrd.dao.ViewTsgzYyrdDao;

/**
 * 态势感知-亚运热点Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewTsgzYyrdService extends CrudService<ViewTsgzYyrdDao, ViewTsgzYyrd> {
	
	/**
	 * 获取单条数据
	 * @param viewTsgzYyrd
	 * @return
	 */
	@Override
	public ViewTsgzYyrd get(ViewTsgzYyrd viewTsgzYyrd) {
		return super.get(viewTsgzYyrd);
	}
	
	/**
	 * 查询分页数据
	 * @param viewTsgzYyrd 查询条件
	 * @param viewTsgzYyrd page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewTsgzYyrd> findPage(ViewTsgzYyrd viewTsgzYyrd) {
		return super.findPage(viewTsgzYyrd);
	}
	
	/**
	 * 查询列表数据
	 * @param viewTsgzYyrd
	 * @return
	 */
	@Override
	public List<ViewTsgzYyrd> findList(ViewTsgzYyrd viewTsgzYyrd) {
		return super.findList(viewTsgzYyrd);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewTsgzYyrd
	 */
	@Override
	@Transactional
	public void save(ViewTsgzYyrd viewTsgzYyrd) {
		super.save(viewTsgzYyrd);
	}
	
	/**
	 * 更新状态
	 * @param viewTsgzYyrd
	 */
	@Override
	@Transactional
	public void updateStatus(ViewTsgzYyrd viewTsgzYyrd) {
		super.updateStatus(viewTsgzYyrd);
	}
	
	/**
	 * 删除数据
	 * @param viewTsgzYyrd
	 */
	@Override
	@Transactional
	public void delete(ViewTsgzYyrd viewTsgzYyrd) {
		super.delete(viewTsgzYyrd);
	}
	
}