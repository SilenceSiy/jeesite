package com.jeesite.modules.tsgz.yyrd.web;

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
import com.jeesite.modules.tsgz.yyrd.entity.ViewTsgzYyrd;
import com.jeesite.modules.tsgz.yyrd.service.ViewTsgzYyrdService;

/**
 * 态势感知-亚运热点Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/yyrd/viewTsgzYyrd")
public class ViewTsgzYyrdController extends BaseController {

	@Autowired
	private ViewTsgzYyrdService viewTsgzYyrdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewTsgzYyrd get(String id, boolean isNewRecord) {
		return viewTsgzYyrdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("yyrd:viewTsgzYyrd:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewTsgzYyrd viewTsgzYyrd, Model model) {
		model.addAttribute("viewTsgzYyrd", viewTsgzYyrd);
		return "tsgz/yyrd/viewTsgzYyrdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("yyrd:viewTsgzYyrd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewTsgzYyrd> listData(ViewTsgzYyrd viewTsgzYyrd, HttpServletRequest request, HttpServletResponse response) {
		viewTsgzYyrd.setPage(new Page<>(request, response));
		Page<ViewTsgzYyrd> page = viewTsgzYyrdService.findPage(viewTsgzYyrd);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("yyrd:viewTsgzYyrd:view")
	@RequestMapping(value = "form")
	public String form(ViewTsgzYyrd viewTsgzYyrd, Model model) {
		model.addAttribute("viewTsgzYyrd", viewTsgzYyrd);
		return "tsgz/yyrd/viewTsgzYyrdForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("yyrd:viewTsgzYyrd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewTsgzYyrd viewTsgzYyrd) {
		viewTsgzYyrdService.save(viewTsgzYyrd);
		return renderResult(Global.TRUE, text("保存态势感知-亚运热点成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("yyrd:viewTsgzYyrd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewTsgzYyrd viewTsgzYyrd) {
		viewTsgzYyrdService.delete(viewTsgzYyrd);
		return renderResult(Global.TRUE, text("删除态势感知-亚运热点成功！"));
	}
	
}