package com.jeesite.modules.yhxx.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.yhxx.entity.DyUserInfo;
import com.jeesite.modules.yhxx.dao.DyUserInfoDao;

/**
 * 用户信息表Service
 * @author shenbao
 * @version 2023-04-26
 */
@Service
public class DyUserInfoService extends CrudService<DyUserInfoDao, DyUserInfo> {
	
	/**
	 * 获取单条数据
	 * @param dyUserInfo
	 * @return
	 */
	@Override
	public DyUserInfo get(DyUserInfo dyUserInfo) {
		return super.get(dyUserInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param dyUserInfo 查询条件
	 * @param dyUserInfo page 分页对象
	 * @return
	 */
	@Override
	public Page<DyUserInfo> findPage(DyUserInfo dyUserInfo) {
		return super.findPage(dyUserInfo);
	}
	
	/**
	 * 查询列表数据
	 * @param dyUserInfo
	 * @return
	 */
	@Override
	public List<DyUserInfo> findList(DyUserInfo dyUserInfo) {
		return super.findList(dyUserInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyUserInfo
	 */
	@Override
	@Transactional
	public void save(DyUserInfo dyUserInfo) {
		super.save(dyUserInfo);
	}
	
	/**
	 * 更新状态
	 * @param dyUserInfo
	 */
	@Override
	@Transactional
	public void updateStatus(DyUserInfo dyUserInfo) {
		super.updateStatus(dyUserInfo);
	}
	
	/**
	 * 删除数据
	 * @param dyUserInfo
	 */
	@Override
	@Transactional
	public void delete(DyUserInfo dyUserInfo) {
		super.delete(dyUserInfo);
	}
	
}