package com.jeesite.modules.xqxx.xq.entity;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import java.util.Date;
import com.jeesite.common.mybatis.annotation.JoinTable;
import com.jeesite.common.mybatis.annotation.JoinTable.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.jeesite.common.collect.ListUtils;

import com.jeesite.common.entity.DataEntity;
import com.jeesite.common.mybatis.annotation.Column;
import com.jeesite.common.mybatis.annotation.Table;
import com.jeesite.common.mybatis.mapper.query.QueryType;

/**
 * 小区信息Entity
 * @author admin
 * @version 2023-06-11
 */
@Table(name="tqz_xq_info", alias="a", label="小区信息信息", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="name", attrName="name", label="小区名称", queryType=QueryType.LIKE),
		@Column(name="jcnd", attrName="jcnd", label="建成年代"),
		@Column(name="address", attrName="address", label="位置"),
		@Column(name="ldsl", attrName="ldsl", label="楼栋数量"),
		@Column(name="wyf", attrName="wyf", label="物业费"),
		@Column(name="yyxx", attrName="yyxx", label="医院信息"),
		@Column(name="xxxx", attrName="xxxx", label="学校信息"),
		@Column(name="csc", attrName="csc", label="菜市场"),
		@Column(name="dtxx", attrName="dtxx", label="地铁"),
		@Column(name="scxx", attrName="scxx", label="商超"),
		@Column(name="kfs", attrName="kfs", label="开发商"),
		@Column(name="wgsj", attrName="wgsj", label="完工时间"),
		@Column(name="remark", attrName="remark", label="备注"),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
		@Column(name="create_time", attrName="createTime", label="录入时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class TqzXqInfo extends DataEntity<TqzXqInfo> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// 小区名称
	private String jcnd;		// 建成年代
	private String address;		// 位置
	private String ldsl;		// 楼栋数量
	private String wyf;		// 物业费
	private String yyxx;		// 医院信息
	private String xxxx;		// 学校信息
	private String csc;		// 菜市场
	private String dtxx;		// 地铁
	private String scxx;		// 商超
	private String kfs;		// 开发商
	private String wgsj;		// 完工时间
	private String remark;		// 备注
	private Date updateTime;		// 更新时间
	private Date createTime;		// 录入时间
	private List<TqzXqHx> tqzXqHxList = ListUtils.newArrayList();		// 子表列表
	private List<TqzXqLd> tqzXqLdList = ListUtils.newArrayList();		// 子表列表

	public TqzXqInfo() {
		this(null);
	}
	
	public TqzXqInfo(String id){
		super(id);
	}
	
	@Size(min=0, max=64, message="小区名称长度不能超过 64 个字符")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Size(min=0, max=32, message="建成年代长度不能超过 32 个字符")
	public String getJcnd() {
		return jcnd;
	}

	public void setJcnd(String jcnd) {
		this.jcnd = jcnd;
	}
	
	@Size(min=0, max=512, message="位置长度不能超过 512 个字符")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Size(min=0, max=32, message="楼栋数量长度不能超过 32 个字符")
	public String getLdsl() {
		return ldsl;
	}

	public void setLdsl(String ldsl) {
		this.ldsl = ldsl;
	}
	
	@Size(min=0, max=32, message="物业费长度不能超过 32 个字符")
	public String getWyf() {
		return wyf;
	}

	public void setWyf(String wyf) {
		this.wyf = wyf;
	}
	
	public String getYyxx() {
		return yyxx;
	}

	public void setYyxx(String yyxx) {
		this.yyxx = yyxx;
	}
	
	public String getXxxx() {
		return xxxx;
	}

	public void setXxxx(String xxxx) {
		this.xxxx = xxxx;
	}
	
	public String getCsc() {
		return csc;
	}

	public void setCsc(String csc) {
		this.csc = csc;
	}
	
	public String getDtxx() {
		return dtxx;
	}

	public void setDtxx(String dtxx) {
		this.dtxx = dtxx;
	}
	
	public String getScxx() {
		return scxx;
	}

	public void setScxx(String scxx) {
		this.scxx = scxx;
	}
	
	@Size(min=0, max=255, message="开发商长度不能超过 255 个字符")
	public String getKfs() {
		return kfs;
	}

	public void setKfs(String kfs) {
		this.kfs = kfs;
	}
	
	@Size(min=0, max=32, message="完工时间长度不能超过 32 个字符")
	public String getWgsj() {
		return wgsj;
	}

	public void setWgsj(String wgsj) {
		this.wgsj = wgsj;
	}
	
	@Size(min=0, max=512, message="备注长度不能超过 512 个字符")
	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Valid
	public List<TqzXqHx> getTqzXqHxList() {
		return tqzXqHxList;
	}

	public void setTqzXqHxList(List<TqzXqHx> tqzXqHxList) {
		this.tqzXqHxList = tqzXqHxList;
	}
	
	@Valid
	public List<TqzXqLd> getTqzXqLdList() {
		return tqzXqLdList;
	}

	public void setTqzXqLdList(List<TqzXqLd> tqzXqLdList) {
		this.tqzXqLdList = tqzXqLdList;
	}
	
}