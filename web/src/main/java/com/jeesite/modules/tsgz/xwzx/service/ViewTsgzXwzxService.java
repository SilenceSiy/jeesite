package com.jeesite.modules.tsgz.xwzx.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.xwzx.entity.ViewTsgzXwzx;
import com.jeesite.modules.tsgz.xwzx.dao.ViewTsgzXwzxDao;

/**
 * 态势感知-新闻资讯Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewTsgzXwzxService extends CrudService<ViewTsgzXwzxDao, ViewTsgzXwzx> {
	
	/**
	 * 获取单条数据
	 * @param viewTsgzXwzx
	 * @return
	 */
	@Override
	public ViewTsgzXwzx get(ViewTsgzXwzx viewTsgzXwzx) {
		return super.get(viewTsgzXwzx);
	}
	
	/**
	 * 查询分页数据
	 * @param viewTsgzXwzx 查询条件
	 * @param viewTsgzXwzx page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewTsgzXwzx> findPage(ViewTsgzXwzx viewTsgzXwzx) {
		return super.findPage(viewTsgzXwzx);
	}
	
	/**
	 * 查询列表数据
	 * @param viewTsgzXwzx
	 * @return
	 */
	@Override
	public List<ViewTsgzXwzx> findList(ViewTsgzXwzx viewTsgzXwzx) {
		return super.findList(viewTsgzXwzx);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewTsgzXwzx
	 */
	@Override
	@Transactional
	public void save(ViewTsgzXwzx viewTsgzXwzx) {
		super.save(viewTsgzXwzx);
	}
	
	/**
	 * 更新状态
	 * @param viewTsgzXwzx
	 */
	@Override
	@Transactional
	public void updateStatus(ViewTsgzXwzx viewTsgzXwzx) {
		super.updateStatus(viewTsgzXwzx);
	}
	
	/**
	 * 删除数据
	 * @param viewTsgzXwzx
	 */
	@Override
	@Transactional
	public void delete(ViewTsgzXwzx viewTsgzXwzx) {
		super.delete(viewTsgzXwzx);
	}
	
}