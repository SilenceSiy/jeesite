package com.jeesite.modules.rdxx.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.rdxx.entity.DyJoinPartyInfo;

/**
 * 入党信息DAO接口
 * @author shenbao
 * @version 2023-04-26
 */
@MyBatisDao
public interface DyJoinPartyInfoDao extends CrudDao<DyJoinPartyInfo> {
	
}