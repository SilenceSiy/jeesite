package com.jeesite.modules.dyhd.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.dyhd.entity.DyPartyNumberActivities;

/**
 * 党员活动管理DAO接口
 * @author shenbao
 * @version 2023-04-29
 */
@MyBatisDao
public interface DyPartyNumberActivitiesDao extends CrudDao<DyPartyNumberActivities> {
	
}