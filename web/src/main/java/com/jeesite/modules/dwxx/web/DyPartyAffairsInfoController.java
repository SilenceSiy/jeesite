package com.jeesite.modules.dwxx.web;

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
import com.jeesite.modules.dwxx.entity.DyPartyAffairsInfo;
import com.jeesite.modules.dwxx.service.DyPartyAffairsInfoService;

/**
 * 党务信息管理Controller
 * @author 申报
 * @version 2023-04-29
 */
@Controller
@RequestMapping(value = "${adminPath}/dwxx/dyPartyAffairsInfo")
public class DyPartyAffairsInfoController extends BaseController {

	@Autowired
	private DyPartyAffairsInfoService dyPartyAffairsInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyPartyAffairsInfo get(String id, boolean isNewRecord) {
		return dyPartyAffairsInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("dwxx:dyPartyAffairsInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyPartyAffairsInfo dyPartyAffairsInfo, Model model) {
		model.addAttribute("dyPartyAffairsInfo", dyPartyAffairsInfo);
		return "modules/dwxx/dyPartyAffairsInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("dwxx:dyPartyAffairsInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyPartyAffairsInfo> listData(DyPartyAffairsInfo dyPartyAffairsInfo, HttpServletRequest request, HttpServletResponse response) {
		dyPartyAffairsInfo.setPage(new Page<>(request, response));
		Page<DyPartyAffairsInfo> page = dyPartyAffairsInfoService.findPage(dyPartyAffairsInfo);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("dwxx:dyPartyAffairsInfo:view")
	@RequestMapping(value = "form")
	public String form(DyPartyAffairsInfo dyPartyAffairsInfo, Model model) {
		model.addAttribute("dyPartyAffairsInfo", dyPartyAffairsInfo);
		return "modules/dwxx/dyPartyAffairsInfoForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("dwxx:dyPartyAffairsInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyPartyAffairsInfo dyPartyAffairsInfo) {
		dyPartyAffairsInfoService.save(dyPartyAffairsInfo);
		return renderResult(Global.TRUE, text("保存党务信息管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("dwxx:dyPartyAffairsInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyPartyAffairsInfo dyPartyAffairsInfo) {
		dyPartyAffairsInfoService.delete(dyPartyAffairsInfo);
		return renderResult(Global.TRUE, text("删除党务信息管理成功！"));
	}
	
}