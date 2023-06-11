package com.jeesite.modules.dyhd.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dyhd.entity.DyPartyNumberActivities;
import com.jeesite.modules.dyhd.dao.DyPartyNumberActivitiesDao;

/**
 * 党员活动管理Service
 * @author shenbao
 * @version 2023-04-29
 */
@Service
public class DyPartyNumberActivitiesService extends CrudService<DyPartyNumberActivitiesDao, DyPartyNumberActivities> {
	
	/**
	 * 获取单条数据
	 * @param dyPartyNumberActivities
	 * @return
	 */
	@Override
	public DyPartyNumberActivities get(DyPartyNumberActivities dyPartyNumberActivities) {
		return super.get(dyPartyNumberActivities);
	}
	
	/**
	 * 查询分页数据
	 * @param dyPartyNumberActivities 查询条件
	 * @param dyPartyNumberActivities page 分页对象
	 * @return
	 */
	@Override
	public Page<DyPartyNumberActivities> findPage(DyPartyNumberActivities dyPartyNumberActivities) {
		return super.findPage(dyPartyNumberActivities);
	}
	
	/**
	 * 查询列表数据
	 * @param dyPartyNumberActivities
	 * @return
	 */
	@Override
	public List<DyPartyNumberActivities> findList(DyPartyNumberActivities dyPartyNumberActivities) {
		return super.findList(dyPartyNumberActivities);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyPartyNumberActivities
	 */
	@Override
	@Transactional
	public void save(DyPartyNumberActivities dyPartyNumberActivities) {
		super.save(dyPartyNumberActivities);
	}
	
	/**
	 * 更新状态
	 * @param dyPartyNumberActivities
	 */
	@Override
	@Transactional
	public void updateStatus(DyPartyNumberActivities dyPartyNumberActivities) {
		super.updateStatus(dyPartyNumberActivities);
	}
	
	/**
	 * 删除数据
	 * @param dyPartyNumberActivities
	 */
	@Override
	@Transactional
	public void delete(DyPartyNumberActivities dyPartyNumberActivities) {
		super.delete(dyPartyNumberActivities);
	}
	
}