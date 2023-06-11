package com.jeesite.modules.tsgz.yyrd.entity;

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
 * 态势感知-亚运热点Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_tsgz_yyrd", alias="a", label="态势感知-亚运热点信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="yyzt", attrName="yyzt", label="亚运专题"),
		@Column(name="cbz", attrName="cbz", label="传播者"),
		@Column(name="mgyl", attrName="mgyl", label="敏感言论"),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class ViewTsgzYyrd extends DataEntity<ViewTsgzYyrd> {
	
	private static final long serialVersionUID = 1L;
	private String yyzt;		// 亚运专题
	private String cbz;		// 传播者
	private String mgyl;		// 敏感言论
	private Date createtime;		// 创建时间
	private Date updatetime;		// 更新时间

	public ViewTsgzYyrd() {
		this(null);
	}
	
	public ViewTsgzYyrd(String id){
		super(id);
	}
	
	@Size(min=0, max=32, message="亚运专题长度不能超过 32 个字符")
	public String getYyzt() {
		return yyzt;
	}

	public void setYyzt(String yyzt) {
		this.yyzt = yyzt;
	}
	
	@Size(min=0, max=32, message="传播者长度不能超过 32 个字符")
	public String getCbz() {
		return cbz;
	}

	public void setCbz(String cbz) {
		this.cbz = cbz;
	}
	
	@Size(min=0, max=32, message="敏感言论长度不能超过 32 个字符")
	public String getMgyl() {
		return mgyl;
	}

	public void setMgyl(String mgyl) {
		this.mgyl = mgyl;
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