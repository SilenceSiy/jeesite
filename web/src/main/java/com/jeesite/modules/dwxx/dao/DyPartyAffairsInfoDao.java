package com.jeesite.modules.dwxx.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.dwxx.entity.DyPartyAffairsInfo;

/**
 * 党务信息管理DAO接口
 * @author 申报
 * @version 2023-04-29
 */
@MyBatisDao
public interface DyPartyAffairsInfoDao extends CrudDao<DyPartyAffairsInfo> {
	
}