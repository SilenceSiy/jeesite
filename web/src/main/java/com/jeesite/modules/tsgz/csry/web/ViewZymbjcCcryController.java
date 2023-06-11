package com.jeesite.modules.tsgz.csry.web;

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
import com.jeesite.modules.tsgz.csry.entity.ViewZymbjcCcry;
import com.jeesite.modules.tsgz.csry.service.ViewZymbjcCcryService;

/**
 * 态势感知-主要目标监测-参赛人员Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/csry/viewZymbjcCcry")
public class ViewZymbjcCcryController extends BaseController {

	@Autowired
	private ViewZymbjcCcryService viewZymbjcCcryService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewZymbjcCcry get(String id, boolean isNewRecord) {
		return viewZymbjcCcryService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("csry:viewZymbjcCcry:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewZymbjcCcry viewZymbjcCcry, Model model) {
		model.addAttribute("viewZymbjcCcry", viewZymbjcCcry);
		return "tsgz/csry/viewZymbjcCcryList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("csry:viewZymbjcCcry:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewZymbjcCcry> listData(ViewZymbjcCcry viewZymbjcCcry, HttpServletRequest request, HttpServletResponse response) {
		viewZymbjcCcry.setPage(new Page<>(request, response));
		Page<ViewZymbjcCcry> page = viewZymbjcCcryService.findPage(viewZymbjcCcry);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("csry:viewZymbjcCcry:view")
	@RequestMapping(value = "form")
	public String form(ViewZymbjcCcry viewZymbjcCcry, Model model) {
		model.addAttribute("viewZymbjcCcry", viewZymbjcCcry);
		return "tsgz/csry/viewZymbjcCcryForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("csry:viewZymbjcCcry:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewZymbjcCcry viewZymbjcCcry) {
		viewZymbjcCcryService.save(viewZymbjcCcry);
		return renderResult(Global.TRUE, text("保存态势感知-主要目标监测-参赛人员成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("csry:viewZymbjcCcry:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewZymbjcCcry viewZymbjcCcry) {
		viewZymbjcCcryService.delete(viewZymbjcCcry);
		return renderResult(Global.TRUE, text("删除态势感知-主要目标监测-参赛人员成功！"));
	}
	
}