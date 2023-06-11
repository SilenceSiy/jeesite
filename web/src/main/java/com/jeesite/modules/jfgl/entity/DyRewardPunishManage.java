package com.jeesite.modules.jfgl.entity;

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
 * 奖罚管理Entity
 * @author shenbao
 * @version 2023-04-29
 */
@Table(name="dy_reward_punish_manage", alias="a", label="奖罚管理信息", columns={
		@Column(name="id", attrName="id", label="奖罚管理id", isPK=true),
		@Column(name="student_number", attrName="studentNumber", label="学号"),
		@Column(name="student_name", attrName="studentName", label="学生姓名", queryType=QueryType.LIKE),
		@Column(name="class_name", attrName="className", label="班级名称", queryType=QueryType.LIKE),
		@Column(name="affiliated_branch", attrName="affiliatedBranch", label="所属支部"),
		@Column(name="reward_punish_type", attrName="rewardPunishType", label="奖罚类型"),
		@Column(name="reward_punish_content", attrName="rewardPunishContent", label="奖罚内容"),
		@Column(name="reward_punish_reason", attrName="rewardPunishReason", label="奖罚原因"),
		@Column(name="recommend", attrName="recommend", label="智能推荐"),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class DyRewardPunishManage extends DataEntity<DyRewardPunishManage> {
	
	private static final long serialVersionUID = 1L;
	private String studentNumber;		// 学号
	private String studentName;		// 学生姓名
	private String className;		// 班级名称
	private String affiliatedBranch;		// 所属支部
	private String rewardPunishType;		// 奖罚类型
	private String rewardPunishContent;		// 奖罚内容
	private String rewardPunishReason;		// 奖罚原因
	private String recommend;		// 智能推荐
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间

	public DyRewardPunishManage() {
		this(null);
	}
	
	public DyRewardPunishManage(String id){
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
	
	@Size(min=0, max=64, message="奖罚类型长度不能超过 64 个字符")
	public String getRewardPunishType() {
		return rewardPunishType;
	}

	public void setRewardPunishType(String rewardPunishType) {
		this.rewardPunishType = rewardPunishType;
	}
	
	public String getRewardPunishContent() {
		return rewardPunishContent;
	}

	public void setRewardPunishContent(String rewardPunishContent) {
		this.rewardPunishContent = rewardPunishContent;
	}
	
	public String getRewardPunishReason() {
		return rewardPunishReason;
	}

	public void setRewardPunishReason(String rewardPunishReason) {
		this.rewardPunishReason = rewardPunishReason;
	}
	
	@Size(min=0, max=11, message="智能推荐长度不能超过 11 个字符")
	public String getRecommend() {
		return recommend;
	}

	public void setRecommend(String recommend) {
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