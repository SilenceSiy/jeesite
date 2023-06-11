package com.jeesite.modules.tsgz.csry.entity;

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
 * 态势感知-主要目标监测-参赛人员Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_zymbjc_ccry", alias="a", label="态势感知-主要目标监测-参赛人员信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="xm", attrName="xm", label="姓名"),
		@Column(name="zy", attrName="zy", label="职业"),
		@Column(name="xb", attrName="xb", label="性别"),
		@Column(name="csrq", attrName="csrq", label="出生日期"),
		@Column(name="gj", attrName="gj", label="国籍"),
		@Column(name="yx", attrName="yx", label="邮箱"),
		@Column(name="dh", attrName="dh", label="电话"),
		@Column(name="lyzh", attrName="lyzh", label="领英账号"),
		@Column(name="inszh", attrName="inszh", label="ins账号"),
		@Column(name="lszh", attrName="lszh", label="脸书账号"),
		@Column(name="ytbzh", attrName="ytbzh", label="YouTube账号"),
		@Column(name="type", attrName="type", label="类型"),
		@Column(name="grjj", attrName="grjj", label="个人简介"),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
		@Column(name="url", attrName="url", label="图片"),
	}, orderBy="a.id DESC"
)
public class ViewZymbjcCcry extends DataEntity<ViewZymbjcCcry> {
	
	private static final long serialVersionUID = 1L;
	private String xm;		// 姓名
	private String zy;		// 职业
	private String xb;		// 性别
	private String csrq;		// 出生日期
	private String gj;		// 国籍
	private String yx;		// 邮箱
	private String dh;		// 电话
	private String lyzh;		// 领英账号
	private String inszh;		// ins账号
	private String lszh;		// 脸书账号
	private String ytbzh;		// YouTube账号
	private String type;		// 类型
	private String grjj;		// 个人简介
	private Date createtime;		// 创建时间
	private Date updatetime;		// 更新时间
	private String url;		// 图片

	public ViewZymbjcCcry() {
		this(null);
	}
	
	public ViewZymbjcCcry(String id){
		super(id);
	}
	
	@Size(min=0, max=32, message="姓名长度不能超过 32 个字符")
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}
	
	@Size(min=0, max=20, message="职业长度不能超过 20 个字符")
	public String getZy() {
		return zy;
	}

	public void setZy(String zy) {
		this.zy = zy;
	}
	
	@Size(min=0, max=11, message="性别长度不能超过 11 个字符")
	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}
	
	@Size(min=0, max=32, message="出生日期长度不能超过 32 个字符")
	public String getCsrq() {
		return csrq;
	}

	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}
	
	@Size(min=0, max=11, message="国籍长度不能超过 11 个字符")
	public String getGj() {
		return gj;
	}

	public void setGj(String gj) {
		this.gj = gj;
	}
	
	@Size(min=0, max=30, message="邮箱长度不能超过 30 个字符")
	public String getYx() {
		return yx;
	}

	public void setYx(String yx) {
		this.yx = yx;
	}
	
	@Size(min=0, max=20, message="电话长度不能超过 20 个字符")
	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}
	
	@Size(min=0, max=32, message="领英账号长度不能超过 32 个字符")
	public String getLyzh() {
		return lyzh;
	}

	public void setLyzh(String lyzh) {
		this.lyzh = lyzh;
	}
	
	@Size(min=0, max=32, message="ins账号长度不能超过 32 个字符")
	public String getInszh() {
		return inszh;
	}

	public void setInszh(String inszh) {
		this.inszh = inszh;
	}
	
	@Size(min=0, max=32, message="脸书账号长度不能超过 32 个字符")
	public String getLszh() {
		return lszh;
	}

	public void setLszh(String lszh) {
		this.lszh = lszh;
	}
	
	@Size(min=0, max=32, message="YouTube账号长度不能超过 32 个字符")
	public String getYtbzh() {
		return ytbzh;
	}

	public void setYtbzh(String ytbzh) {
		this.ytbzh = ytbzh;
	}
	
	@Size(min=0, max=11, message="类型长度不能超过 11 个字符")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getGrjj() {
		return grjj;
	}

	public void setGrjj(String grjj) {
		this.grjj = grjj;
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
	
	@Size(min=0, max=255, message="图片长度不能超过 255 个字符")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}