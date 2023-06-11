package com.jeesite.modules.tsgz.ylrd.web;

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
import com.jeesite.modules.tsgz.ylrd.entity.ViewTsgzYlrd;
import com.jeesite.modules.tsgz.ylrd.service.ViewTsgzYlrdService;

/**
 * 态势感知,舆论热点Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/ylrd/viewTsgzYlrd")
public class ViewTsgzYlrdController extends BaseController {

	@Autowired
	private ViewTsgzYlrdService viewTsgzYlrdService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewTsgzYlrd get(String id, boolean isNewRecord) {
		return viewTsgzYlrdService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("ylrd:viewTsgzYlrd:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewTsgzYlrd viewTsgzYlrd, Model model) {
		model.addAttribute("viewTsgzYlrd", viewTsgzYlrd);
		return "tsgz/ylrd/viewTsgzYlrdList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("ylrd:viewTsgzYlrd:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewTsgzYlrd> listData(ViewTsgzYlrd viewTsgzYlrd, HttpServletRequest request, HttpServletResponse response) {
		viewTsgzYlrd.setPage(new Page<>(request, response));
		Page<ViewTsgzYlrd> page = viewTsgzYlrdService.findPage(viewTsgzYlrd);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("ylrd:viewTsgzYlrd:view")
	@RequestMapping(value = "form")
	public String form(ViewTsgzYlrd viewTsgzYlrd, Model model) {
		model.addAttribute("viewTsgzYlrd", viewTsgzYlrd);
		return "tsgz/ylrd/viewTsgzYlrdForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("ylrd:viewTsgzYlrd:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewTsgzYlrd viewTsgzYlrd) {
		viewTsgzYlrdService.save(viewTsgzYlrd);
		return renderResult(Global.TRUE, text("保存态势感知,舆论热点成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("ylrd:viewTsgzYlrd:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewTsgzYlrd viewTsgzYlrd) {
		viewTsgzYlrdService.delete(viewTsgzYlrd);
		return renderResult(Global.TRUE, text("删除态势感知,舆论热点成功！"));
	}
	
}