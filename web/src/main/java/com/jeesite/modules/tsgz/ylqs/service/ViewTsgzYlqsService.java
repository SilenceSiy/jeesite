package com.jeesite.modules.tsgz.ylqs.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.ylqs.entity.ViewTsgzYlqs;
import com.jeesite.modules.tsgz.ylqs.dao.ViewTsgzYlqsDao;

/**
 * 态势感知-言论趋势Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewTsgzYlqsService extends CrudService<ViewTsgzYlqsDao, ViewTsgzYlqs> {
	
	/**
	 * 获取单条数据
	 * @param viewTsgzYlqs
	 * @return
	 */
	@Override
	public ViewTsgzYlqs get(ViewTsgzYlqs viewTsgzYlqs) {
		return super.get(viewTsgzYlqs);
	}
	
	/**
	 * 查询分页数据
	 * @param viewTsgzYlqs 查询条件
	 * @param viewTsgzYlqs page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewTsgzYlqs> findPage(ViewTsgzYlqs viewTsgzYlqs) {
		return super.findPage(viewTsgzYlqs);
	}
	
	/**
	 * 查询列表数据
	 * @param viewTsgzYlqs
	 * @return
	 */
	@Override
	public List<ViewTsgzYlqs> findList(ViewTsgzYlqs viewTsgzYlqs) {
		return super.findList(viewTsgzYlqs);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewTsgzYlqs
	 */
	@Override
	@Transactional
	public void save(ViewTsgzYlqs viewTsgzYlqs) {
		super.save(viewTsgzYlqs);
	}
	
	/**
	 * 更新状态
	 * @param viewTsgzYlqs
	 */
	@Override
	@Transactional
	public void updateStatus(ViewTsgzYlqs viewTsgzYlqs) {
		super.updateStatus(viewTsgzYlqs);
	}
	
	/**
	 * 删除数据
	 * @param viewTsgzYlqs
	 */
	@Override
	@Transactional
	public void delete(ViewTsgzYlqs viewTsgzYlqs) {
		super.delete(viewTsgzYlqs);
	}
	
}