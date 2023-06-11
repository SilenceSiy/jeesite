package com.jeesite.modules.tsgz.xwzx.entity;

import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 态势感知-新闻资讯Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_tsgz_xwzx", alias="a", label="态势感知-新闻资讯信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="xwzx", attrName="xwzx", label="新闻资讯", isUpdateForce=true),
		@Column(name="xwzxadd", attrName="xwzxadd", label="今日新增", isUpdateForce=true),
		@Column(name="ltzx", attrName="ltzx", label="论坛资讯", isUpdateForce=true),
		@Column(name="ltzxadd", attrName="ltzxadd", label="今日新增", isUpdateForce=true),
		@Column(name="bdmt", attrName="bdmt", label="报道媒体", isUpdateForce=true),
		@Column(name="bdmtadd", attrName="bdmtadd", label="今日新增", isUpdateForce=true),
		@Column(name="cyzh", attrName="cyzh", label="参与账号", isUpdateForce=true),
		@Column(name="cyzhadd", attrName="cyzhadd", label="今日新增", isUpdateForce=true),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class ViewTsgzXwzx extends DataEntity<ViewTsgzXwzx> {
	
	private static final long serialVersionUID = 1L;
	private Long xwzx;		// 新闻资讯
	private Long xwzxadd;		// 今日新增
	private Long ltzx;		// 论坛资讯
	private Long ltzxadd;		// 今日新增
	private Long bdmt;		// 报道媒体
	private Long bdmtadd;		// 今日新增
	private Long cyzh;		// 参与账号
	private Long cyzhadd;		// 今日新增
	private Date createtime;		// 创建时间
	private Date updatetime;		// 更新时间

	public ViewTsgzXwzx() {
		this(null);
	}
	
	public ViewTsgzXwzx(String id){
		super(id);
	}
	
	public Long getXwzx() {
		return xwzx;
	}

	public void setXwzx(Long xwzx) {
		this.xwzx = xwzx;
	}
	
	public Long getXwzxadd() {
		return xwzxadd;
	}

	public void setXwzxadd(Long xwzxadd) {
		this.xwzxadd = xwzxadd;
	}
	
	public Long getLtzx() {
		return ltzx;
	}

	public void setLtzx(Long ltzx) {
		this.ltzx = ltzx;
	}
	
	public Long getLtzxadd() {
		return ltzxadd;
	}

	public void setLtzxadd(Long ltzxadd) {
		this.ltzxadd = ltzxadd;
	}
	
	public Long getBdmt() {
		return bdmt;
	}

	public void setBdmt(Long bdmt) {
		this.bdmt = bdmt;
	}
	
	public Long getBdmtadd() {
		return bdmtadd;
	}

	public void setBdmtadd(Long bdmtadd) {
		this.bdmtadd = bdmtadd;
	}
	
	public Long getCyzh() {
		return cyzh;
	}

	public void setCyzh(Long cyzh) {
		this.cyzh = cyzh;
	}
	
	public Long getCyzhadd() {
		return cyzhadd;
	}

	public void setCyzhadd(Long cyzhadd) {
		this.cyzhadd = cyzhadd;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}