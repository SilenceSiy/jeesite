package com.jeesite.modules.dyhd.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.dyhd.entity.DyPartyMemberActivities;

/**
 * 党员活动管理DAO接口
 * @author shenbao
 * @version 2023-04-26
 */
@MyBatisDao
public interface DyPartyMemberActivitiesDao extends CrudDao<DyPartyMemberActivities> {
	
}