package com.jeesite.modules.tsgz.ylqs.web;

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
import com.jeesite.modules.tsgz.ylqs.entity.ViewTsgzYlqs;
import com.jeesite.modules.tsgz.ylqs.service.ViewTsgzYlqsService;

/**
 * 态势感知-言论趋势Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/ylqs/viewTsgzYlqs")
public class ViewTsgzYlqsController extends BaseController {

	@Autowired
	private ViewTsgzYlqsService viewTsgzYlqsService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewTsgzYlqs get(String id, boolean isNewRecord) {
		return viewTsgzYlqsService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("ylqs:viewTsgzYlqs:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewTsgzYlqs viewTsgzYlqs, Model model) {
		model.addAttribute("viewTsgzYlqs", viewTsgzYlqs);
		return "tsgz/ylqs/viewTsgzYlqsList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("ylqs:viewTsgzYlqs:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewTsgzYlqs> listData(ViewTsgzYlqs viewTsgzYlqs, HttpServletRequest request, HttpServletResponse response) {
		viewTsgzYlqs.setPage(new Page<>(request, response));
		Page<ViewTsgzYlqs> page = viewTsgzYlqsService.findPage(viewTsgzYlqs);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("ylqs:viewTsgzYlqs:view")
	@RequestMapping(value = "form")
	public String form(ViewTsgzYlqs viewTsgzYlqs, Model model) {
		model.addAttribute("viewTsgzYlqs", viewTsgzYlqs);
		return "tsgz/ylqs/viewTsgzYlqsForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("ylqs:viewTsgzYlqs:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewTsgzYlqs viewTsgzYlqs) {
		viewTsgzYlqsService.save(viewTsgzYlqs);
		return renderResult(Global.TRUE, text("保存态势感知-言论趋势成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("ylqs:viewTsgzYlqs:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewTsgzYlqs viewTsgzYlqs) {
		viewTsgzYlqsService.delete(viewTsgzYlqs);
		return renderResult(Global.TRUE, text("删除态势感知-言论趋势成功！"));
	}
	
}