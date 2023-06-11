package com.jeesite.modules.yhxx.entity;

import javax.validation.constraints.Size;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 用户信息表Entity
 * @author shenbao
 * @version 2023-04-26
 */
@Table(name="dy_user_info", alias="a", label="用户信息表信息", columns={
		@Column(name="id", attrName="id", label="学生id", isPK=true),
		@Column(name="xh", attrName="xh", label="学号"),
		@Column(name="xsxm", attrName="xsxm", label="学生姓名"),
		@Column(name="bjmc", attrName="bjmc", label="班级名称"),
		@Column(name="shzt", attrName="shzt", label="审核状态"),
		@Column(name="zntj", attrName="zntj", label="智能推荐", isUpdateForce=true),
		@Column(name="yhid", attrName="yhid", label="用户id", isUpdateForce=true),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class DyUserInfo extends DataEntity<DyUserInfo> {
	
	private static final long serialVersionUID = 1L;
	private String xh;		// 学号
	private String xsxm;		// 学生姓名
	private String bjmc;		// 班级名称
	private String shzt;		// 审核状态
	private Long zntj;		// 智能推荐
	private Long yhid;		// 用户id
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间

	public DyUserInfo() {
		this(null);
	}
	
	public DyUserInfo(String id){
		super(id);
	}
	
	@Size(min=0, max=64, message="学号长度不能超过 64 个字符")
	public String getXh() {
		return xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}
	
	@Size(min=0, max=64, message="学生姓名长度不能超过 64 个字符")
	public String getXsxm() {
		return xsxm;
	}

	public void setXsxm(String xsxm) {
		this.xsxm = xsxm;
	}
	
	@Size(min=0, max=64, message="班级名称长度不能超过 64 个字符")
	public String getBjmc() {
		return bjmc;
	}

	public void setBjmc(String bjmc) {
		this.bjmc = bjmc;
	}
	
	@Size(min=0, max=16, message="审核状态长度不能超过 16 个字符")
	public String getShzt() {
		return shzt;
	}

	public void setShzt(String shzt) {
		this.shzt = shzt;
	}
	
	public Long getZntj() {
		return zntj;
	}

	public void setZntj(Long zntj) {
		this.zntj = zntj;
	}
	
	public Long getYhid() {
		return yhid;
	}

	public void setYhid(Long yhid) {
		this.yhid = yhid;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
}