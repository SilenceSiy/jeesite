package com.jeesite.modules.tsgz.ylrd.entity;

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
 * 态势感知,舆论热点Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_tsgz_ylrd", alias="a", label="态势感知,舆论热点信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="bt", attrName="bt", label="标题"),
		@Column(name="bq", attrName="bq", label="标签"),
		@Column(name="content", attrName="content", label="内容"),
		@Column(name="lygj", attrName="lygj", label="来源国家"),
		@Column(name="lypt", attrName="lypt", label="来源平台"),
		@Column(name="rq", attrName="rq", label="来源日期", isUpdateForce=true),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
		@Column(name="url", attrName="url", label="图片"),
	}, orderBy="a.id DESC"
)
public class ViewTsgzYlrd extends DataEntity<ViewTsgzYlrd> {
	
	private static final long serialVersionUID = 1L;
	private String bt;		// 标题
	private String bq;		// 标签
	private String content;		// 内容
	private String lygj;		// 来源国家
	private String lypt;		// 来源平台
	private Date rq;		// 来源日期
	private Date createtime;		// 创建时间
	private Date updatetime;		// 更新时间
	private String url;		// 图片

	public ViewTsgzYlrd() {
		this(null);
	}
	
	public ViewTsgzYlrd(String id){
		super(id);
	}
	
	@Size(min=0, max=255, message="标题长度不能超过 255 个字符")
	public String getBt() {
		return bt;
	}

	public void setBt(String bt) {
		this.bt = bt;
	}
	
	@Size(min=0, max=30, message="标签长度不能超过 30 个字符")
	public String getBq() {
		return bq;
	}

	public void setBq(String bq) {
		this.bq = bq;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@Size(min=0, max=20, message="来源国家长度不能超过 20 个字符")
	public String getLygj() {
		return lygj;
	}

	public void setLygj(String lygj) {
		this.lygj = lygj;
	}
	
	@Size(min=0, max=20, message="来源平台长度不能超过 20 个字符")
	public String getLypt() {
		return lypt;
	}

	public void setLypt(String lypt) {
		this.lypt = lypt;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRq() {
		return rq;
	}

	public void setRq(Date rq) {
		this.rq = rq;
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