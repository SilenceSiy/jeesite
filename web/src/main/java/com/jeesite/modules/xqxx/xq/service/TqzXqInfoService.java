package com.jeesite.modules.xqxx.xq.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jeesite.common.entity.Page;
import com.jeesite.common.service.CrudService;
import com.jeesite.modules.xqxx.xq.entity.TqzXqInfo;
import com.jeesite.modules.xqxx.xq.dao.TqzXqInfoDao;
import com.jeesite.modules.file.utils.FileUploadUtils;
import com.jeesite.modules.xqxx.xq.entity.TqzXqHx;
import com.jeesite.modules.xqxx.xq.dao.TqzXqHxDao;
import com.jeesite.modules.xqxx.xq.entity.TqzXqLd;
import com.jeesite.modules.xqxx.xq.dao.TqzXqLdDao;

/**
 * 小区信息Service
 * @author admin
 * @version 2023-06-11
 */
@Service
public class TqzXqInfoService extends CrudService<TqzXqInfoDao, TqzXqInfo> {
	
	@Autowired
	private TqzXqHxDao tqzXqHxDao;
	
	@Autowired
	private TqzXqLdDao tqzXqLdDao;
	
	/**
	 * 获取单条数据
	 * @param tqzXqInfo
	 * @return
	 */
	@Override
	public TqzXqInfo get(TqzXqInfo tqzXqInfo) {
		TqzXqInfo entity = super.get(tqzXqInfo);
		if (entity != null){
			TqzXqHx tqzXqHx = new TqzXqHx(entity);
			tqzXqHx.setStatus(TqzXqHx.STATUS_NORMAL);
			entity.setTqzXqHxList(tqzXqHxDao.findList(tqzXqHx));
			TqzXqLd tqzXqLd = new TqzXqLd(entity);
			tqzXqLd.setStatus(TqzXqLd.STATUS_NORMAL);
			entity.setTqzXqLdList(tqzXqLdDao.findList(tqzXqLd));
		}
		return entity;
	}
	
	/**
	 * 查询分页数据
	 * @param tqzXqInfo 查询条件
	 * @param tqzXqInfo page 分页对象
	 * @return
	 */
	@Override
	public Page<TqzXqInfo> findPage(TqzXqInfo tqzXqInfo) {
		return super.findPage(tqzXqInfo);
	}
	
	/**
	 * 查询列表数据
	 * @param tqzXqInfo
	 * @return
	 */
	@Override
	public List<TqzXqInfo> findList(TqzXqInfo tqzXqInfo) {
		return super.findList(tqzXqInfo);
	}
	
	/**
	 * 查询子表分页数据
	 * @param tqzXqHx
	 * @param tqzXqHx page 分页对象
	 * @return
	 */
	public Page<TqzXqHx> findSubPage(TqzXqHx tqzXqHx) {
		Page<TqzXqHx> page = tqzXqHx.getPage();
		page.setList(tqzXqHxDao.findList(tqzXqHx));
		return page;
	}
	
	/**
	 * 查询子表分页数据
	 * @param tqzXqLd
	 * @param tqzXqLd page 分页对象
	 * @return
	 */
	public Page<TqzXqLd> findSubPage(TqzXqLd tqzXqLd) {
		Page<TqzXqLd> page = tqzXqLd.getPage();
		page.setList(tqzXqLdDao.findList(tqzXqLd));
		return page;
	}
	
	/**
	 * 保存数据（插入或更新）
	 * @param tqzXqInfo
	 */
	@Override
	@Transactional
	public void save(TqzXqInfo tqzXqInfo) {
		super.save(tqzXqInfo);
		// 保存上传图片
		FileUploadUtils.saveFileUpload(tqzXqInfo, tqzXqInfo.getId(), "tqzXqInfo_image");
		// 保存 TqzXqInfo子表
		for (TqzXqHx tqzXqHx : tqzXqInfo.getTqzXqHxList()){
			if (!TqzXqHx.STATUS_DELETE.equals(tqzXqHx.getStatus())){
				tqzXqHx.setXqId(tqzXqInfo);
				if (tqzXqHx.getIsNewRecord()){
					tqzXqHxDao.insert(tqzXqHx);
				}else{
					tqzXqHxDao.update(tqzXqHx);
				}
			}else{
				tqzXqHxDao.delete(tqzXqHx);
			}
		}
		// 保存 TqzXqInfo子表
		for (TqzXqLd tqzXqLd : tqzXqInfo.getTqzXqLdList()){
			if (!TqzXqLd.STATUS_DELETE.equals(tqzXqLd.getStatus())){
				tqzXqLd.setXqId(tqzXqInfo);
				if (tqzXqLd.getIsNewRecord()){
					tqzXqLdDao.insert(tqzXqLd);
				}else{
					tqzXqLdDao.update(tqzXqLd);
				}
			}else{
				tqzXqLdDao.delete(tqzXqLd);
			}
		}
	}
	
	/**
	 * 更新状态
	 * @param tqzXqInfo
	 */
	@Override
	@Transactional
	public void updateStatus(TqzXqInfo tqzXqInfo) {
		super.updateStatus(tqzXqInfo);
	}
	
	/**
	 * 删除数据
	 * @param tqzXqInfo
	 */
	@Override
	@Transactional
	public void delete(TqzXqInfo tqzXqInfo) {
		super.delete(tqzXqInfo);
		TqzXqHx tqzXqHx = new TqzXqHx();
		tqzXqHx.setXqId(tqzXqInfo);
		tqzXqHxDao.deleteByEntity(tqzXqHx);
		TqzXqLd tqzXqLd = new TqzXqLd();
		tqzXqLd.setXqId(tqzXqInfo);
		tqzXqLdDao.deleteByEntity(tqzXqLd);
	}
	
}