package com.jeesite.modules.xqxx.xq.entity;

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
 * 小区信息Entity
 * @author admin
 * @version 2023-06-11
 */
@Table(name="tqz_xq_hx", alias="a", label="小区信息信息", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="xq_id", attrName="xqId.id", label="小区id"),
		@Column(name="xq_name", attrName="xqName", label="小区名称", queryType=QueryType.LIKE),
		@Column(name="hx", attrName="hx", label="户型"),
		@Column(name="area", attrName="area", label="面积"),
		@Column(name="create_time", attrName="createTime", label="录入时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id ASC"
)
public class TqzXqHx extends DataEntity<TqzXqHx> {
	
	private static final long serialVersionUID = 1L;
	private TqzXqInfo xqId;		// 小区id 父类
	private String xqName;		// 小区名称
	private String hx;		// 户型
	private String area;		// 面积
	private Date createTime;		// 录入时间
	private Date updateTime;		// 更新时间

	public TqzXqHx() {
		this(null);
	}

	public TqzXqHx(TqzXqInfo xqId){
		this.xqId = xqId;
	}
	
	public TqzXqInfo getXqId() {
		return xqId;
	}

	public void setXqId(TqzXqInfo xqId) {
		this.xqId = xqId;
	}
	
	@Size(min=0, max=64, message="小区名称长度不能超过 64 个字符")
	public String getXqName() {
		return xqName;
	}

	public void setXqName(String xqName) {
		this.xqName = xqName;
	}
	
	@Size(min=0, max=255, message="户型长度不能超过 255 个字符")
	public String getHx() {
		return hx;
	}

	public void setHx(String hx) {
		this.hx = hx;
	}
	
	@Size(min=0, max=64, message="面积长度不能超过 64 个字符")
	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
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