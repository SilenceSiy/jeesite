package com.jeesite.modules.yhxx.dao;

import com.jeesite.common.dao.CrudDao;
import com.jeesite.common.mybatis.annotation.MyBatisDao;
import com.jeesite.modules.yhxx.entity.DyUserInfo;

/**
 * 用户信息表DAO接口
 * @author shenbao
 * @version 2023-04-26
 */
@MyBatisDao
public interface DyUserInfoDao extends CrudDao<DyUserInfo> {
	
}