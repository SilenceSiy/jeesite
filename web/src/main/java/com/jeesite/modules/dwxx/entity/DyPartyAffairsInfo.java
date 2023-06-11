package com.jeesite.modules.dwxx.entity;

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
 * 党务信息管理Entity
 * @author 申报
 * @version 2023-04-29
 */
@Table(name="dy_party_affairs_info", alias="a", label="党务信息管理信息", columns={
		@Column(name="id", attrName="id", label="id", isPK=true),
		@Column(name="student_number", attrName="studentNumber", label="学号"),
		@Column(name="syudent_name", attrName="syudentName", label="学生姓名", queryType=QueryType.LIKE),
		@Column(name="affiliated_branch", attrName="affiliatedBranch", label="所属支部"),
		@Column(name="year_of_payment", attrName="yearOfPayment", label="缴纳年份"),
		@Column(name="party_fee_amount", attrName="partyFeeAmount", label="党费金额"),
		@Column(name="pay_state", attrName="payState", label="支付状态"),
		@Column(name="pay_type", attrName="payType", label="支付类型"),
		@Column(name="recommend", attrName="recommend", label="智能推荐"),
		@Column(name="create_time", attrName="createTime", label="创建时间", isUpdateForce=true),
		@Column(name="update_time", attrName="updateTime", label="更新时间", isUpdateForce=true),
	}, orderBy="a.id DESC"
)
public class DyPartyAffairsInfo extends DataEntity<DyPartyAffairsInfo> {
	
	private static final long serialVersionUID = 1L;
	private String studentNumber;		// 学号
	private String syudentName;		// 学生姓名
	private String affiliatedBranch;		// 所属支部
	private String yearOfPayment;		// 缴纳年份
	private String partyFeeAmount;		// 党费金额
	private String payState;		// 支付状态
	private String payType;		// 支付类型
	private String recommend;		// 智能推荐
	private Date createTime;		// 创建时间
	private Date updateTime;		// 更新时间

	public DyPartyAffairsInfo() {
		this(null);
	}
	
	public DyPartyAffairsInfo(String id){
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
	public String getSyudentName() {
		return syudentName;
	}

	public void setSyudentName(String syudentName) {
		this.syudentName = syudentName;
	}
	
	@Size(min=0, max=64, message="所属支部长度不能超过 64 个字符")
	public String getAffiliatedBranch() {
		return affiliatedBranch;
	}

	public void setAffiliatedBranch(String affiliatedBranch) {
		this.affiliatedBranch = affiliatedBranch;
	}
	
	@Size(min=0, max=64, message="缴纳年份长度不能超过 64 个字符")
	public String getYearOfPayment() {
		return yearOfPayment;
	}

	public void setYearOfPayment(String yearOfPayment) {
		this.yearOfPayment = yearOfPayment;
	}
	
	@Size(min=0, max=11, message="党费金额长度不能超过 11 个字符")
	public String getPartyFeeAmount() {
		return partyFeeAmount;
	}

	public void setPartyFeeAmount(String partyFeeAmount) {
		this.partyFeeAmount = partyFeeAmount;
	}
	
	@Size(min=0, max=16, message="支付状态长度不能超过 16 个字符")
	public String getPayState() {
		return payState;
	}

	public void setPayState(String payState) {
		this.payState = payState;
	}
	
	@Size(min=0, max=16, message="支付类型长度不能超过 16 个字符")
	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
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