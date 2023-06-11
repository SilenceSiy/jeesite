package com.jeesite.modules.zzsq.entity;

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
 * 转正申请管理Entity
 * @author shenbao
 * @version 2023-04-26
 */
@Table(name="dy_employment_confirmation_application", alias="a", label="转正申请管理信息", columns={
		@Column(name="id", attrName="id", label="转正申请id", isPK=true),
		@Column(name="student_number", attrName="studentNumber", label="学号"),
		@Column(name="student_name", attrName="studentName", label="学生姓名", queryType=QueryType.LIKE),
		@Column(name="class_name", attrName="className", label="班级名称", queryType=QueryType.LIKE),
		@Column(name="affiliated_branch", attrName="affiliatedBranch", label="所属支部"),
		@Column(name="application", attrName="application", label="申请书"),
		@Column(name="examine_state", attrName="examineState", label="审核状态"),
		@Column(name="examine_reply", attrName="examineReply", label="审核回复"),
		@Column(name="recommend", attrName="recommend", label="智能推荐", isUpdateForce=true),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class DyEmploymentConfirmationApplication extends DataEntity<DyEmploymentConfirmationApplication> {
	
	private static final long serialVersionUID = 1L;
	private String studentNumber;		// 学号
	private String studentName;		// 学生姓名
	private String className;		// 班级名称
	private String affiliatedBranch;		// 所属支部
	private String application;		// 申请书
	private String examineState;		// 审核状态
	private String examineReply;		// 审核回复
	private Long recommend;		// 智能推荐
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间

	public DyEmploymentConfirmationApplication() {
		this(null);
	}
	
	public DyEmploymentConfirmationApplication(String id){
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
	
	@Size(min=0, max=255, message="申请书长度不能超过 255 个字符")
	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}
	
	@Size(min=0, max=16, message="审核状态长度不能超过 16 个字符")
	public String getExamineState() {
		return examineState;
	}

	public void setExamineState(String examineState) {
		this.examineState = examineState;
	}
	
	@Size(min=0, max=255, message="审核回复长度不能超过 255 个字符")
	public String getExamineReply() {
		return examineReply;
	}

	public void setExamineReply(String examineReply) {
		this.examineReply = examineReply;
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