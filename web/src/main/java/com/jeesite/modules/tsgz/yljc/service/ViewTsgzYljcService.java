package com.jeesite.modules.tsgz.yljc.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.yljc.entity.ViewTsgzYljc;
import com.jeesite.modules.tsgz.yljc.dao.ViewTsgzYljcDao;

/**
 * 态势感知-言论监测Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewTsgzYljcService extends CrudService<ViewTsgzYljcDao, ViewTsgzYljc> {
	
	/**
	 * 获取单条数据
	 * @param viewTsgzYljc
	 * @return
	 */
	@Override
	public ViewTsgzYljc get(ViewTsgzYljc viewTsgzYljc) {
		return super.get(viewTsgzYljc);
	}
	
	/**
	 * 查询分页数据
	 * @param viewTsgzYljc 查询条件
	 * @param viewTsgzYljc page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewTsgzYljc> findPage(ViewTsgzYljc viewTsgzYljc) {
		return super.findPage(viewTsgzYljc);
	}
	
	/**
	 * 查询列表数据
	 * @param viewTsgzYljc
	 * @return
	 */
	@Override
	public List<ViewTsgzYljc> findList(ViewTsgzYljc viewTsgzYljc) {
		return super.findList(viewTsgzYljc);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewTsgzYljc
	 */
	@Override
	@Transactional
	public void save(ViewTsgzYljc viewTsgzYljc) {
		super.save(viewTsgzYljc);
	}
	
	/**
	 * 更新状态
	 * @param viewTsgzYljc
	 */
	@Override
	@Transactional
	public void updateStatus(ViewTsgzYljc viewTsgzYljc) {
		super.updateStatus(viewTsgzYljc);
	}
	
	/**
	 * 删除数据
	 * @param viewTsgzYljc
	 */
	@Override
	@Transactional
	public void delete(ViewTsgzYljc viewTsgzYljc) {
		super.delete(viewTsgzYljc);
	}
	
}