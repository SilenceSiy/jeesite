package com.jeesite.modules.dyhd.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dyhd.entity.DyPartyMemberActivities;
import com.jeesite.modules.dyhd.dao.DyPartyMemberActivitiesDao;

/**
 * 党员活动管理Service
 * @author shenbao
 * @version 2023-04-26
 */
@Service
public class DyPartyMemberActivitiesService extends CrudService<DyPartyMemberActivitiesDao, DyPartyMemberActivities> {
	
	/**
	 * 获取单条数据
	 * @param dyPartyMemberActivities
	 * @return
	 */
	@Override
	public DyPartyMemberActivities get(DyPartyMemberActivities dyPartyMemberActivities) {
		return super.get(dyPartyMemberActivities);
	}
	
	/**
	 * 查询分页数据
	 * @param dyPartyMemberActivities 查询条件
	 * @param dyPartyMemberActivities page 分页对象
	 * @return
	 */
	@Override
	public Page<DyPartyMemberActivities> findPage(DyPartyMemberActivities dyPartyMemberActivities) {
		return super.findPage(dyPartyMemberActivities);
	}
	
	/**
	 * 查询列表数据
	 * @param dyPartyMemberActivities
	 * @return
	 */
	@Override
	public List<DyPartyMemberActivities> findList(DyPartyMemberActivities dyPartyMemberActivities) {
		return super.findList(dyPartyMemberActivities);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyPartyMemberActivities
	 */
	@Override
	@Transactional
	public void save(DyPartyMemberActivities dyPartyMemberActivities) {
		super.save(dyPartyMemberActivities);
	}
	
	/**
	 * 更新状态
	 * @param dyPartyMemberActivities
	 */
	@Override
	@Transactional
	public void updateStatus(DyPartyMemberActivities dyPartyMemberActivities) {
		super.updateStatus(dyPartyMemberActivities);
	}
	
	/**
	 * 删除数据
	 * @param dyPartyMemberActivities
	 */
	@Override
	@Transactional
	public void delete(DyPartyMemberActivities dyPartyMemberActivities) {
		super.delete(dyPartyMemberActivities);
	}
	
}