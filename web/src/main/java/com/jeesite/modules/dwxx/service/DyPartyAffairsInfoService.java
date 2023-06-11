package com.jeesite.modules.dwxx.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.dwxx.entity.DyPartyAffairsInfo;
import com.jeesite.modules.dwxx.dao.DyPartyAffairsInfoDao;

/**
 * 党务信息管理Service
 * @author 申报
 * @version 2023-04-29
 */
@Service
public class DyPartyAffairsInfoService extends CrudService<DyPartyAffairsInfoDao, DyPartyAffairsInfo> {
	
	/**
	 * 获取单条数据
	 * @param dyPartyAffairsInfo
	 * @return
	 */
	@Override
	public DyPartyAffairsInfo get(DyPartyAffairsInfo dyPartyAffairsInfo) {
		return super.get(dyPartyAffairsInfo);
	}
	
	/**
	 * 查询分页数据
	 * @param dyPartyAffairsInfo 查询条件
	 * @param dyPartyAffairsInfo page 分页对象
	 * @return
	 */
	@Override
	public Page<DyPartyAffairsInfo> findPage(DyPartyAffairsInfo dyPartyAffairsInfo) {
		return super.findPage(dyPartyAffairsInfo);
	}
	
	/**
	 * 查询列表数据
	 * @param dyPartyAffairsInfo
	 * @return
	 */
	@Override
	public List<DyPartyAffairsInfo> findList(DyPartyAffairsInfo dyPartyAffairsInfo) {
		return super.findList(dyPartyAffairsInfo);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyPartyAffairsInfo
	 */
	@Override
	@Transactional
	public void save(DyPartyAffairsInfo dyPartyAffairsInfo) {
		super.save(dyPartyAffairsInfo);
	}
	
	/**
	 * 更新状态
	 * @param dyPartyAffairsInfo
	 */
	@Override
	@Transactional
	public void updateStatus(DyPartyAffairsInfo dyPartyAffairsInfo) {
		super.updateStatus(dyPartyAffairsInfo);
	}
	
	/**
	 * 删除数据
	 * @param dyPartyAffairsInfo
	 */
	@Override
	@Transactional
	public void delete(DyPartyAffairsInfo dyPartyAffairsInfo) {
		super.delete(dyPartyAffairsInfo);
	}
	
}