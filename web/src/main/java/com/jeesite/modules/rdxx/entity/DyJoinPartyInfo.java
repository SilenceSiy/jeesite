package com.jeesite.modules.rdxx.entity;

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
 * 入党信息Entity
 * @author shenbao
 * @version 2023-04-26
 */
@Table(name="dy_join_party_info", alias="a", label="入党信息信息", columns={
		@Column(name="id", attrName="id", label="入党信息id", isPK=true),
		@Column(name="student_number", attrName="studentNumber", label="学号"),
		@Column(name="student_name", attrName="studentName", label="学生姓名", queryType=QueryType.LIKE),
		@Column(name="class_name", attrName="className", label="班级名称", queryType=QueryType.LIKE),
		@Column(name="affiliated_branch", attrName="affiliatedBranch", label="所属支部"),
		@Column(name="current_state", attrName="currentState", label="当前状态"),
		@Column(name="join_party_time", attrName="joinPartyTime", label="入党时间", isUpdateForce=true),
		@Column(name="recommend", attrName="recommend", label="智能推荐", isUpdateForce=true),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class DyJoinPartyInfo extends DataEntity<DyJoinPartyInfo> {
	
	private static final long serialVersionUID = 1L;
	private String studentNumber;		// 学号
	private String studentName;		// 学生姓名
	private String className;		// 班级名称
	private String affiliatedBranch;		// 所属支部
	private String currentState;		// 当前状态
	private Date joinPartyTime;		// 入党时间
	private Long recommend;		// 智能推荐
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间

	public DyJoinPartyInfo() {
		this(null);
	}
	
	public DyJoinPartyInfo(String id){
		super(id);
	}
	
	@Size(min=0, max=64, message="学号长度不能超过 64 个字符")
	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	@Size(min=0, max=64, message="学生姓名长度不能超过 64 个字符")
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Size(min=0, max=64, message="班级名称长度不能超过 64 个字符")
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
	
	@Size(min=0, max=64, message="所属支部长度不能超过 64 个字符")
	public String getAffiliatedBranch() {
		return affiliatedBranch;
	}

	public void setAffiliatedBranch(String affiliatedBranch) {
		this.affiliatedBranch = affiliatedBranch;
	}
	
	@Size(min=0, max=64, message="当前状态长度不能超过 64 个字符")
	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getJoinPartyTime() {
		return joinPartyTime;
	}

	public void setJoinPartyTime(Date joinPartyTime) {
		this.joinPartyTime = joinPartyTime;
	}
	
	public Long getRecommend() {
		return recommend;
	}

	public void setRecommend(Long recommend) {
		this.recommend = recommend;
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