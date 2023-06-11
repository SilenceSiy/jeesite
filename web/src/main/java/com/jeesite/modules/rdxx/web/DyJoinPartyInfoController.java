package com.jeesite.modules.rdxx.web;

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
import com.jeesite.modules.rdxx.entity.DyJoinPartyInfo;
import com.jeesite.modules.rdxx.service.DyJoinPartyInfoService;

/**
 * 入党信息Controller
 * @author shenbao
 * @version 2023-04-26
 */
@Controller
@RequestMapping(value = "${adminPath}/rdxx/dyJoinPartyInfo")
public class DyJoinPartyInfoController extends BaseController {

	@Autowired
	private DyJoinPartyInfoService dyJoinPartyInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyJoinPartyInfo get(String id, boolean isNewRecord) {
		return dyJoinPartyInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("rdxx:dyJoinPartyInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyJoinPartyInfo dyJoinPartyInfo, Model model) {
		model.addAttribute("dyJoinPartyInfo", dyJoinPartyInfo);
		return "modules/rdxx/dyJoinPartyInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("rdxx:dyJoinPartyInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyJoinPartyInfo> listData(DyJoinPartyInfo dyJoinPartyInfo, HttpServletRequest request, HttpServletResponse response) {
		dyJoinPartyInfo.setPage(new Page<>(request, response));
		Page<DyJoinPartyInfo> page = dyJoinPartyInfoService.findPage(dyJoinPartyInfo);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("rdxx:dyJoinPartyInfo:view")
	@RequestMapping(value = "form")
	public String form(DyJoinPartyInfo dyJoinPartyInfo, Model model) {
		model.addAttribute("dyJoinPartyInfo", dyJoinPartyInfo);
		return "modules/rdxx/dyJoinPartyInfoForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("rdxx:dyJoinPartyInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyJoinPartyInfo dyJoinPartyInfo) {
		dyJoinPartyInfoService.save(dyJoinPartyInfo);
		return renderResult(Global.TRUE, text("保存入党信息成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("rdxx:dyJoinPartyInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyJoinPartyInfo dyJoinPartyInfo) {
		dyJoinPartyInfoService.delete(dyJoinPartyInfo);
		return renderResult(Global.TRUE, text("删除入党信息成功！"));
	}
	
}