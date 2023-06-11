package com.jeesite.modules.tsgz.rdht.entity;

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
 * 态势感知-亚运热点-热点话题排行榜Entity
 * @author admin
 * @version 2023-05-25
 */
@Table(name="view_yyrd_rdhtphb", alias="a", label="态势感知-亚运热点-热点话题排行榜信息", columns={
		@Column(name="id", attrName="id", label="主键", isPK=true),
		@Column(name="ly", attrName="ly", label="来源"),
		@Column(name="lx", attrName="lx", label="类型"),
		@Column(name="fbsj", attrName="fbsj", label="发布时间", isUpdateForce=true),
		@Column(name="bq", attrName="bq", label="标签"),
		@Column(name="createtime", attrName="createtime", label="创建时间", isUpdateForce=true),
		@Column(name="url", attrName="url", label="图片"),
		@Column(name="updatetime", attrName="updatetime", label="更新时间", isUpdateForce=true),
		@Column(name="content", attrName="content", label="内容"),
	}, orderBy="a.id DESC"
)
public class ViewYyrdRdhtphb extends DataEntity<ViewYyrdRdhtphb> {
	
	private static final long serialVersionUID = 1L;
	private String ly;		// 来源
	private String lx;		// 类型
	private Date fbsj;		// 发布时间
	private String bq;		// 标签
	private Date createtime;		// 创建时间
	private String url;		// 图片
	private Date updatetime;		// 更新时间
	private String content;		// 内容

	public ViewYyrdRdhtphb() {
		this(null);
	}
	
	public ViewYyrdRdhtphb(String id){
		super(id);
	}
	
	@Size(min=0, max=100, message="来源长度不能超过 100 个字符")
	public String getLy() {
		return ly;
	}

	public void setLy(String ly) {
		this.ly = ly;
	}
	
	@Size(min=0, max=32, message="类型长度不能超过 32 个字符")
	public String getLx() {
		return lx;
	}

	public void setLx(String lx) {
		this.lx = lx;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getFbsj() {
		return fbsj;
	}

	public void setFbsj(Date fbsj) {
		this.fbsj = fbsj;
	}
	
	@Size(min=0, max=32, message="标签长度不能超过 32 个字符")
	public String getBq() {
		return bq;
	}

	public void setBq(String bq) {
		this.bq = bq;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	@Size(min=0, max=255, message="图片长度不能超过 255 个字符")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}