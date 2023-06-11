package com.jeesite.modules.zzsq.web;

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
import com.jeesite.modules.zzsq.entity.DyEmploymentConfirmationApplication;
import com.jeesite.modules.zzsq.service.DyEmploymentConfirmationApplicationService;

/**
 * 转正申请管理Controller
 * @author shenbao
 * @version 2023-04-26
 */
@Controller
@RequestMapping(value = "${adminPath}/zzsq/dyEmploymentConfirmationApplication")
public class DyEmploymentConfirmationApplicationController extends BaseController {

	@Autowired
	private DyEmploymentConfirmationApplicationService dyEmploymentConfirmationApplicationService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyEmploymentConfirmationApplication get(String id, boolean isNewRecord) {
		return dyEmploymentConfirmationApplicationService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("zzsq:dyEmploymentConfirmationApplication:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication, Model model) {
		model.addAttribute("dyEmploymentConfirmationApplication", dyEmploymentConfirmationApplication);
		return "modules/zzsq/dyEmploymentConfirmationApplicationList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("zzsq:dyEmploymentConfirmationApplication:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyEmploymentConfirmationApplication> listData(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication, HttpServletRequest request, HttpServletResponse response) {
		dyEmploymentConfirmationApplication.setPage(new Page<>(request, response));
		Page<DyEmploymentConfirmationApplication> page = dyEmploymentConfirmationApplicationService.findPage(dyEmploymentConfirmationApplication);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("zzsq:dyEmploymentConfirmationApplication:view")
	@RequestMapping(value = "form")
	public String form(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication, Model model) {
		model.addAttribute("dyEmploymentConfirmationApplication", dyEmploymentConfirmationApplication);
		return "modules/zzsq/dyEmploymentConfirmationApplicationForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("zzsq:dyEmploymentConfirmationApplication:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		dyEmploymentConfirmationApplicationService.save(dyEmploymentConfirmationApplication);
		return renderResult(Global.TRUE, text("保存转正申请管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("zzsq:dyEmploymentConfirmationApplication:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyEmploymentConfirmationApplication dyEmploymentConfirmationApplication) {
		dyEmploymentConfirmationApplicationService.delete(dyEmploymentConfirmationApplication);
		return renderResult(Global.TRUE, text("删除转正申请管理成功！"));
	}
	
}