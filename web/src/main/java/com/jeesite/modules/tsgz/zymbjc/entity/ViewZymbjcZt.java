package com.jeesite.modules.tsgz.zymbjc.entity;

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
 * 态势感知-重要目标监测Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_zymbjc_zt", alias="a", label="态势感知-重要目标监测信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="jcmbzs", attrName="jcmbzs", label="监测目标总数"),
		@Column(name="mbftzs", attrName="mbftzs", label="目标发帖总数"),
		@Column(name="shylzs", attrName="shylzs", label="涉华言论数量"),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class ViewZymbjcZt extends DataEntity<ViewZymbjcZt> {
	
	private static final long serialVersionUID = 1L;
	private String jcmbzs;		// 监测目标总数
	private String mbftzs;		// 目标发帖总数
	private String shylzs;		// 涉华言论数量
	private Date createtime;		// 创建时间
	private Date updatetime;		// 更新时间

	public ViewZymbjcZt() {
		this(null);
	}
	
	public ViewZymbjcZt(String id){
		super(id);
	}
	
	@Size(min=0, max=32, message="监测目标总数长度不能超过 32 个字符")
	public String getJcmbzs() {
		return jcmbzs;
	}

	public void setJcmbzs(String jcmbzs) {
		this.jcmbzs = jcmbzs;
	}
	
	@Size(min=0, max=32, message="目标发帖总数长度不能超过 32 个字符")
	public String getMbftzs() {
		return mbftzs;
	}

	public void setMbftzs(String mbftzs) {
		this.mbftzs = mbftzs;
	}
	
	@Size(min=0, max=32, message="涉华言论数量长度不能超过 32 个字符")
	public String getShylzs() {
		return shylzs;
	}

	public void setShylzs(String shylzs) {
		this.shylzs = shylzs;
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