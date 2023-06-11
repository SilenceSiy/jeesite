package com.jeesite.modules.jfgl.web;

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
import com.jeesite.modules.jfgl.entity.DyRewardPunishManage;
import com.jeesite.modules.jfgl.service.DyRewardPunishManageService;

/**
 * 奖罚管理Controller
 * @author shenbao
 * @version 2023-04-29
 */
@Controller
@RequestMapping(value = "${adminPath}/jfgl/dyRewardPunishManage")
public class DyRewardPunishManageController extends BaseController {

	@Autowired
	private DyRewardPunishManageService dyRewardPunishManageService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyRewardPunishManage get(String id, boolean isNewRecord) {
		return dyRewardPunishManageService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("jfgl:dyRewardPunishManage:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyRewardPunishManage dyRewardPunishManage, Model model) {
		model.addAttribute("dyRewardPunishManage", dyRewardPunishManage);
		return "modules/jfgl/dyRewardPunishManageList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("jfgl:dyRewardPunishManage:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyRewardPunishManage> listData(DyRewardPunishManage dyRewardPunishManage, HttpServletRequest request, HttpServletResponse response) {
		dyRewardPunishManage.setPage(new Page<>(request, response));
		Page<DyRewardPunishManage> page = dyRewardPunishManageService.findPage(dyRewardPunishManage);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("jfgl:dyRewardPunishManage:view")
	@RequestMapping(value = "form")
	public String form(DyRewardPunishManage dyRewardPunishManage, Model model) {
		model.addAttribute("dyRewardPunishManage", dyRewardPunishManage);
		return "modules/jfgl/dyRewardPunishManageForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("jfgl:dyRewardPunishManage:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyRewardPunishManage dyRewardPunishManage) {
		dyRewardPunishManageService.save(dyRewardPunishManage);
		return renderResult(Global.TRUE, text("保存奖罚管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("jfgl:dyRewardPunishManage:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyRewardPunishManage dyRewardPunishManage) {
		dyRewardPunishManageService.delete(dyRewardPunishManage);
		return renderResult(Global.TRUE, text("删除奖罚管理成功！"));
	}
	
}