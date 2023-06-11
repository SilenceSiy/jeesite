package com.jeesite.modules.sxhb.service;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.sxhb.entity.DyIdeologicalReport;
import com.jeesite.modules.sxhb.dao.DyIdeologicalReportDao;

/**
 * 思想汇报管理Service
 * @author shenbao
 * @version 2023-04-26
 */
@Service
public class DyIdeologicalReportService extends CrudService<DyIdeologicalReportDao, DyIdeologicalReport> {
	
	/**
	 * 获取单条数据
	 * @param dyIdeologicalReport
	 * @return
	 */
	@Override
	public DyIdeologicalReport get(DyIdeologicalReport dyIdeologicalReport) {
		return super.get(dyIdeologicalReport);
	}
	
	/**
	 * 查询分页数据
	 * @param dyIdeologicalReport 查询条件
	 * @param dyIdeologicalReport page 分页对象
	 * @return
	 */
	@Override
	public Page<DyIdeologicalReport> findPage(DyIdeologicalReport dyIdeologicalReport) {
		return super.findPage(dyIdeologicalReport);
	}
	
	/**
	 * 查询列表数据
	 * @param dyIdeologicalReport
	 * @return
	 */
	@Override
	public List<DyIdeologicalReport> findList(DyIdeologicalReport dyIdeologicalReport) {
		return super.findList(dyIdeologicalReport);
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param dyIdeologicalReport
	 */
	@Override
	@Transactional
	public void save(DyIdeologicalReport dyIdeologicalReport) {
		super.save(dyIdeologicalReport);
	}
	
	/**
	 * 更新状态
	 * @param dyIdeologicalReport
	 */
	@Override
	@Transactional
	public void updateStatus(DyIdeologicalReport dyIdeologicalReport) {
		super.updateStatus(dyIdeologicalReport);
	}
	
	/**
	 * 删除数据
	 * @param dyIdeologicalReport
	 */
	@Override
	@Transactional
	public void delete(DyIdeologicalReport dyIdeologicalReport) {
		super.delete(dyIdeologicalReport);
	}
	
}