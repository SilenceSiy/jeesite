package com.jeesite.modules.tsgz.ylqs.entity;

import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 态势感知-言论趋势Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_tsgz_ylqs", alias="a", label="态势感知-言论趋势信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="sj", attrName="sj", label="日期", isUpdateForce=true),
		@Column(name="type", attrName="type", label="类型"),
		@Column(name="sl", attrName="sl", label="数量", isUpdateForce=true),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class ViewTsgzYlqs extends DataEntity<ViewTsgzYlqs> {
	
	private static final long serialVersionUID = 1L;
	private Date sj;		// 日期
	private String type;		// 类型
	private Long sl;		// 数量
	private Date createtime;		// 创建时间
	private Date updatetime;		// 更新时间

	public ViewTsgzYlqs() {
		this(null);
	}
	
	public ViewTsgzYlqs(String id){
		super(id);
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSj() {
		return sj;
	}

	public void setSj(Date sj) {
		this.sj = sj;
	}
	
	@Size(min=0, max=30, message="类型长度不能超过 30 个字符")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public Long getSl() {
		return sl;
	}

	public void setSl(Long sl) {
		this.sl = sl;
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