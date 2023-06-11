package com.jeesite.modules.zzsq.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.zzsq.entity.DyEmploymentConfirmationApplication;
import com.jeesite.modules.zzsq.dao.DyEmploymentConfirmationApplicationDao;

/**
 * 转正申请管理Service
 * @author shenbao
 * @version 2023-04-26
 */
@Service
public class DyEmploymentConfirmationApplicationService extends CrudService<DyEmploymentConfirmationApplicationDao, DyEmploymentConfirmationApplication> {
	
	/**
	 * 获取单条数据
	 * @param dyEmploymentConfirmationApplication
	 * @return
	 */
	@Override
	public DyEmploymentConfirmationApplication get(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		return super.get(dyEmploymentConfirmationApplication);
	}
	
	/**
	 * 查询分页数据
	 * @param dyEmploymentConfirmationApplication 查询条件
	 * @param dyEmploymentConfirmationApplication page 分页对象
	 * @return
	 */
	@Override
	public Page<DyEmploymentConfirmationApplication> findPage(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		return super.findPage(dyEmploymentConfirmationApplication);
	}
	
	/**
	 * 查询列表数据
	 * @param dyEmploymentConfirmationApplication
	 * @return
	 */
	@Override
	public List<DyEmploymentConfirmationApplication> findList(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		return super.findList(dyEmploymentConfirmationApplication);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyEmploymentConfirmationApplication
	 */
	@Override
	@Transactional
	public void save(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		super.save(dyEmploymentConfirmationApplication);
	}
	
	/**
	 * 更新状态
	 * @param dyEmploymentConfirmationApplication
	 */
	@Override
	@Transactional
	public void updateStatus(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		super.updateStatus(dyEmploymentConfirmationApplication);
	}
	
	/**
	 * 删除数据
	 * @param dyEmploymentConfirmationApplication
	 */
	@Override
	@Transactional
	public void delete(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		super.delete(dyEmploymentConfirmationApplication);
	}
	
}