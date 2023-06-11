package com.jeesite.modules.yhxx.web;

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
import com.jeesite.modules.yhxx.entity.DyUserInfo;
import com.jeesite.modules.yhxx.service.DyUserInfoService;

/**
 * 用户信息表Controller
 * @author shenbao
 * @version 2023-04-26
 */
@Controller
@RequestMapping(value = "${adminPath}/yhxx/dyUserInfo")
public class DyUserInfoController extends BaseController {

	@Autowired
	private DyUserInfoService dyUserInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyUserInfo get(String id, boolean isNewRecord) {
		return dyUserInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("yhxx:dyUserInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyUserInfo dyUserInfo, Model model) {
		model.addAttribute("dyUserInfo", dyUserInfo);
		return "modules/yhxx/dyUserInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("yhxx:dyUserInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyUserInfo> listData(DyUserInfo dyUserInfo, HttpServletRequest request, HttpServletResponse response) {
		dyUserInfo.setPage(new Page<>(request, response));
		Page<DyUserInfo> page = dyUserInfoService.findPage(dyUserInfo);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("yhxx:dyUserInfo:view")
	@RequestMapping(value = "form")
	public String form(DyUserInfo dyUserInfo, Model model) {
		model.addAttribute("dyUserInfo", dyUserInfo);
		return "modules/yhxx/dyUserInfoForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("yhxx:dyUserInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyUserInfo dyUserInfo) {
		dyUserInfoService.save(dyUserInfo);
		return renderResult(Global.TRUE, text("保存用户信息表成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("yhxx:dyUserInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyUserInfo dyUserInfo) {
		dyUserInfoService.delete(dyUserInfo);
		return renderResult(Global.TRUE, text("删除用户信息表成功！"));
	}
	
}