package com.jeesite.modules.tsgz.rdht.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.tsgz.rdht.entity.ViewYyrdRdhtphb;
import com.jeesite.modules.tsgz.rdht.dao.ViewYyrdRdhtphbDao;

/**
 * 态势感知-亚运热点-热点话题排行榜Service
 * @author admin
 * @version 2023-05-25
 */
@Service
public class ViewYyrdRdhtphbService extends CrudService<ViewYyrdRdhtphbDao, ViewYyrdRdhtphb> {
	
	/**
	 * 获取单条数据
	 * @param viewYyrdRdhtphb
	 * @return
	 */
	@Override
	public ViewYyrdRdhtphb get(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		return super.get(viewYyrdRdhtphb);
	}
	
	/**
	 * 查询分页数据
	 * @param viewYyrdRdhtphb 查询条件
	 * @param viewYyrdRdhtphb page 分页对象
	 * @return
	 */
	@Override
	public Page<ViewYyrdRdhtphb> findPage(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		return super.findPage(viewYyrdRdhtphb);
	}
	
	/**
	 * 查询列表数据
	 * @param viewYyrdRdhtphb
	 * @return
	 */
	@Override
	public List<ViewYyrdRdhtphb> findList(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		return super.findList(viewYyrdRdhtphb);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param viewYyrdRdhtphb
	 */
	@Override
	@Transactional
	public void save(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		super.save(viewYyrdRdhtphb);
	}
	
	/**
	 * 更新状态
	 * @param viewYyrdRdhtphb
	 */
	@Override
	@Transactional
	public void updateStatus(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		super.updateStatus(viewYyrdRdhtphb);
	}
	
	/**
	 * 删除数据
	 * @param viewYyrdRdhtphb
	 */
	@Override
	@Transactional
	public void delete(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		super.delete(viewYyrdRdhtphb);
	}
	
}