package com.jeesite.modules.jfgl.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.jfgl.entity.DyRewardPunishManage;
import com.jeesite.modules.jfgl.dao.DyRewardPunishManageDao;

/**
 * 奖罚管理Service
 * @author shenbao
 * @version 2023-04-29
 */
@Service
public class DyRewardPunishManageService extends CrudService<DyRewardPunishManageDao, DyRewardPunishManage> {
	
	/**
	 * 获取单条数据
	 * @param dyRewardPunishManage
	 * @return
	 */
	@Override
	public DyRewardPunishManage get(DyRewardPunishManage dyRewardPunishManage) {
		return super.get(dyRewardPunishManage);
	}
	
	/**
	 * 查询分页数据
	 * @param dyRewardPunishManage 查询条件
	 * @param dyRewardPunishManage page 分页对象
	 * @return
	 */
	@Override
	public Page<DyRewardPunishManage> findPage(DyRewardPunishManage dyRewardPunishManage) {
		return super.findPage(dyRewardPunishManage);
	}
	
	/**
	 * 查询列表数据
	 * @param dyRewardPunishManage
	 * @return
	 */
	@Override
	public List<DyRewardPunishManage> findList(DyRewardPunishManage dyRewardPunishManage) {
		return super.findList(dyRewardPunishManage);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyRewardPunishManage
	 */
	@Override
	@Transactional
	public void save(DyRewardPunishManage dyRewardPunishManage) {
		super.save(dyRewardPunishManage);
	}
	
	/**
	 * 更新状态
	 * @param dyRewardPunishManage
	 */
	@Override
	@Transactional
	public void updateStatus(DyRewardPunishManage dyRewardPunishManage) {
		super.updateStatus(dyRewardPunishManage);
	}
	
	/**
	 * 删除数据
	 * @param dyRewardPunishManage
	 */
	@Override
	@Transactional
	public void delete(DyRewardPunishManage dyRewardPunishManage) {
		super.delete(dyRewardPunishManage);
	}
	
}