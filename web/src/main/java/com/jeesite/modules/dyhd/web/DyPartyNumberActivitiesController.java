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
import com.jeesite.modules.dyhd.entity.DyPartyNumberActivities;
import com.jeesite.modules.dyhd.service.DyPartyNumberActivitiesService;

/**
 * 党员活动管理Controller
 * @author shenbao
 * @version 2023-04-29
 */
@Controller
@RequestMapping(value = "${adminPath}/dyhd/dyPartyNumberActivities")
public class DyPartyNumberActivitiesController extends BaseController {

	@Autowired
	private DyPartyNumberActivitiesService dyPartyNumberActivitiesService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyPartyNumberActivities get(String id, boolean isNewRecord) {
		return dyPartyNumberActivitiesService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dyhd:dyPartyNumberActivities:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyPartyNumberActivities dyPartyNumberActivities, Model model) {
		model.addAttribute("dyPartyNumberActivities", dyPartyNumberActivities);
		return "modules/dyhd/dyPartyNumberActivitiesList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dyhd:dyPartyNumberActivities:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyPartyNumberActivities> listData(DyPartyNumberActivities dyPartyNumberActivities, HttpServletRequest request, HttpServletResponse response) {
		dyPartyNumberActivities.setPage(new Page<>(request, response));
		Page<DyPartyNumberActivities> page = dyPartyNumberActivitiesService.findPage(dyPartyNumberActivities);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dyhd:dyPartyNumberActivities:view")
	@RequestMapping(value = "form")
	public String form(DyPartyNumberActivities dyPartyNumberActivities, Model model) {
		model.addAttribute("dyPartyNumberActivities", dyPartyNumberActivities);
		return "modules/dyhd/dyPartyNumberActivitiesForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dyhd:dyPartyNumberActivities:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyPartyNumberActivities dyPartyNumberActivities) {
		dyPartyNumberActivitiesService.save(dyPartyNumberActivities);
		return renderResult(Global.TRUE, text("保存党员活动管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dyhd:dyPartyNumberActivities:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyPartyNumberActivities dyPartyNumberActivities) {
		dyPartyNumberActivitiesService.delete(dyPartyNumberActivities);
		return renderResult(Global.TRUE, text("删除党员活动管理成功！"));
	}
	
}