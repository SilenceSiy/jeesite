package com.jeesite.modules.dyhd.web;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jeesite.common.config.Global;
import com.jeesite.common.entity.Page;
import com.jeesite.common.web.BaseController;
import com.jeesite.modules.dyhd.entity.DyPartyMemberActivities;
import com.jeesite.modules.dyhd.service.DyPartyMemberActivitiesService;

/**
 * 党员活动管理Controller
 * @author shenbao
 * @version 2023-04-26
 */
@Controller
@RequestMapping(value = "${adminPath}/dyhd/dyPartyMemberActivities")
public class DyPartyMemberActivitiesController extends BaseController {

	@Autowired
	private DyPartyMemberActivitiesService dyPartyMemberActivitiesService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyPartyMemberActivities get(String id, boolean isNewRecord) {
		return dyPartyMemberActivitiesService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dyhd:dyPartyMemberActivities:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyPartyMemberActivities dyPartyMemberActivities, Model model) {
		model.addAttribute("dyPartyMemberActivities", dyPartyMemberActivities);
		return "modules/dyhd/dyPartyMemberActivitiesList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dyhd:dyPartyMemberActivities:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyPartyMemberActivities> listData(DyPartyMemberActivities dyPartyMemberActivities, HttpServletRequest request, HttpServletResponse response) {
		dyPartyMemberActivities.setPage(new Page<>(request, response));
		Page<DyPartyMemberActivities> page = dyPartyMemberActivitiesService.findPage(dyPartyMemberActivities);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dyhd:dyPartyMemberActivities:view")
	@RequestMapping(value = "form")
	public String form(DyPartyMemberActivities dyPartyMemberActivities, Model model) {
		model.addAttribute("dyPartyMemberActivities", dyPartyMemberActivities);
		return "modules/dyhd/dyPartyMemberActivitiesForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dyhd:dyPartyMemberActivities:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyPartyMemberActivities dyPartyMemberActivities) {
		dyPartyMemberActivitiesService.save(dyPartyMemberActivities);
		return renderResult(Global.TRUE, text("保存党员活动管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dyhd:dyPartyMemberActivities:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyPartyMemberActivities dyPartyMemberActivities) {
		dyPartyMemberActivitiesService.delete(dyPartyMemberActivities);
		return renderResult(Global.TRUE, text("删除党员活动管理成功！"));
	}
	
}