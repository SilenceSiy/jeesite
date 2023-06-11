package com.jeesite.modules.rdxx.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.rdxx.entity.DyJoinPartyInfo;
import com.jeesite.modules.rdxx.dao.DyJoinPartyInfoDao;

/**
 * 入党信息Service
 * @author shenbao
 * @version 2023-04-26
 */
@Service
public class DyJoinPartyInfoService extends CrudService<DyJoinPartyInfoDao, DyJoinPartyInfo> {
	
	/**
	 * 获取单条数据
	 * @param dyJoinPartyInfo
	 * @return
	 */
	@Override
	public DyJoinPartyInfo get(DyJoinPartyInfo dyJoinPartyInfo) {
		return super.get(dyJoinPartyInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param dyJoinPartyInfo 查询条件
	 * @param dyJoinPartyInfo page 分页对象
	 * @return
	 */
	@Override
	public Page<DyJoinPartyInfo> findPage(DyJoinPartyInfo dyJoinPartyInfo) {
		return super.findPage(dyJoinPartyInfo);
	}
	
	/**
	 * 查询列表数据
	 * @param dyJoinPartyInfo
	 * @return
	 */
	@Override
	public List<DyJoinPartyInfo> findList(DyJoinPartyInfo dyJoinPartyInfo) {
		return super.findList(dyJoinPartyInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyJoinPartyInfo
	 */
	@Override
	@Transactional
	public void save(DyJoinPartyInfo dyJoinPartyInfo) {
		super.save(dyJoinPartyInfo);
	}
	
	/**
	 * 更新状态
	 * @param dyJoinPartyInfo
	 */
	@Override
	@Transactional
	public void updateStatus(DyJoinPartyInfo dyJoinPartyInfo) {
		super.updateStatus(dyJoinPartyInfo);
	}
	
	/**
	 * 删除数据
	 * @param dyJoinPartyInfo
	 */
	@Override
	@Transactional
	public void delete(DyJoinPartyInfo dyJoinPartyInfo) {
		super.delete(dyJoinPartyInfo);
	}
	
}