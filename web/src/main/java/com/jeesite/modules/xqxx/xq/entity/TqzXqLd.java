package com.jeesite.modules.xqxx.xq.entity;

import javax.validation.constraints.Size;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 小区信息Entity
 * @author admin
 * @version 2023-06-11
 */
@Table(name="tqz_xq_ld", alias="a", label="小区信息信息", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="xq_id", attrName="xqId.id", label="xq_id"),
		@Column(name="xq_name", attrName="xqName", label="xq_name", queryType=QueryType.LIKE),
		@Column(name="ld_name", attrName="ldName", label="楼栋名称", queryType=QueryType.LIKE),
		@Column(name="ld_code", attrName="ldCode", label="楼栋编号"),
		@Column(name="jzmj", attrName="jzmj", label="建筑面积"),
		@Column(name="dys", attrName="dys", label="单元数", isUpdateForce=true),
		@Column(name="lcs", attrName="lcs", label="楼层数", isUpdateForce=true),
		@Column(name="hs", attrName="hs", label="户数", isUpdateForce=true),
		@Column(name="ldyt", attrName="ldyt", label="楼栋用途"),
		@Column(name="ldlx", attrName="ldlx", label="楼栋类型"),
		@Column(name="dtqk", attrName="dtqk", label="电梯情况"),
		@Column(name="remark", attrName="remark", label="备注"),
	}, orderBy="a.id ASC"
)
public class TqzXqLd extends DataEntity<TqzXqLd> {
	
	private static final long serialVersionUID = 1L;
	private TqzXqInfo xqId;		// xq_id 父类
	private String xqName;		// xq_name
	private String ldName;		// 楼栋名称
	private String ldCode;		// 楼栋编号
	private String jzmj;		// 建筑面积
	private Long dys;		// 单元数
	private Long lcs;		// 楼层数
	private Long hs;		// 户数
	private String ldyt;		// 楼栋用途
	private String ldlx;		// 楼栋类型
	private String dtqk;		// 电梯情况
	private String remark;		// 备注

	public TqzXqLd() {
		this(null);
	}

	public TqzXqLd(TqzXqInfo xqId){
		this.xqId = xqId;
	}
	
	public TqzXqInfo getXqId() {
		return xqId;
	}

	public void setXqId(TqzXqInfo xqId) {
		this.xqId = xqId;
	}
	
	@Size(min=0, max=64, message="xq_name长度不能超过 64 个字符")
	public String getXqName() {
		return xqName;
	}

	public void setXqName(String xqName) {
		this.xqName = xqName;
	}
	
	@Size(min=0, max=64, message="楼栋名称长度不能超过 64 个字符")
	public String getLdName() {
		return ldName;
	}

	public void setLdName(String ldName) {
		this.ldName = ldName;
	}
	
	@Size(min=0, max=64, message="楼栋编号长度不能超过 64 个字符")
	public String getLdCode() {
		return ldCode;
	}

	public void setLdCode(String ldCode) {
		this.ldCode = ldCode;
	}
	
	@Size(min=0, max=32, message="建筑面积长度不能超过 32 个字符")
	public String getJzmj() {
		return jzmj;
	}

	public void setJzmj(String jzmj) {
		this.jzmj = jzmj;
	}
	
	public Long getDys() {
		return dys;
	}

	public void setDys(Long dys) {
		this.dys = dys;
	}
	
	public Long getLcs() {
		return lcs;
	}

	public void setLcs(Long lcs) {
		this.lcs = lcs;
	}
	
	public Long getHs() {
		return hs;
	}

	public void setHs(Long hs) {
		this.hs = hs;
	}
	
	@Size(min=0, max=11, message="楼栋用途长度不能超过 11 个字符")
	public String getLdyt() {
		return ldyt;
	}

	public void setLdyt(String ldyt) {
		this.ldyt = ldyt;
	}
	
	@Size(min=0, max=11, message="楼栋类型长度不能超过 11 个字符")
	public String getLdlx() {
		return ldlx;
	}

	public void setLdlx(String ldlx) {
		this.ldlx = ldlx;
	}
	
	@Size(min=0, max=11, message="电梯情况长度不能超过 11 个字符")
	public String getDtqk() {
		return dtqk;
	}

	public void setDtqk(String dtqk) {
		this.dtqk = dtqk;
	}
	
	@Size(min=0, max=255, message="备注长度不能超过 255 个字符")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}