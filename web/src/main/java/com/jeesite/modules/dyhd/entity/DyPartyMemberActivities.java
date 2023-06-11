package com.jeesite.modules.dyhd.entity;

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
 * 党员活动管理Entity
 * @author shenbao
 * @version 2023-04-26
 */
@Table(name="dy_party_member_activities", alias="a", label="党员活动管理信息", columns={
		@Column(name="id", attrName="id", label="党员活动D", isPK=true),
		@Column(name="activity_number", attrName="activityNumber", label="活动编号"),
		@Column(name="activity_name", attrName="activityName", label="活动名称", queryType=QueryType.LIKE),
		@Column(name="activity_time", attrName="activityTime", label="活动时间", isUpdateForce=true),
		@Column(name="activity_location", attrName="activityLocation", label="活动地点"),
		@Column(name="participants", attrName="participants", label="参与对象"),
		@Column(name="activity_content", attrName="activityContent", label="活动内容"),
		@Column(name="recommend", attrName="recommend", label="智能推荐", isUpdateForce=true),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class DyPartyMemberActivities extends DataEntity<DyPartyMemberActivities> {
	
	private static final long serialVersionUID = 1L;
	private String activityNumber;		// 活动编号
	private String activityName;		// 活动名称
	private Date activityTime;		// 活动时间
	private String activityLocation;		// 活动地点
	private String participants;		// 参与对象
	private String activityContent;		// 活动内容
	private Long recommend;		// 智能推荐
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间

	public DyPartyMemberActivities() {
		this(null);
	}
	
	public DyPartyMemberActivities(String id){
		super(id);
	}
	
	@Size(min=0, max=64, message="活动编号长度不能超过 64 个字符")
	public String getActivityNumber() {
		return activityNumber;
	}

	public void setActivityNumber(String activityNumber) {
		this.activityNumber = activityNumber;
	}
	
	@Size(min=0, max=64, message="活动名称长度不能超过 64 个字符")
	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getActivityTime() {
		return activityTime;
	}

	public void setActivityTime(Date activityTime) {
		this.activityTime = activityTime;
	}
	
	@Size(min=0, max=64, message="活动地点长度不能超过 64 个字符")
	public String getActivityLocation() {
		return activityLocation;
	}

	public void setActivityLocation(String activityLocation) {
		this.activityLocation = activityLocation;
	}
	
	public String getParticipants() {
		return participants;
	}

	public void setParticipants(String participants) {
		this.participants = participants;
	}
	
	public String getActivityContent() {
		return activityContent;
	}

	public void setActivityContent(String activityContent) {
		this.activityContent = activityContent;
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