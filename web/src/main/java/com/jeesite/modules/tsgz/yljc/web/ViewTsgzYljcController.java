package com.jeesite.modules.tsgz.yljc.web;

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
import com.jeesite.modules.tsgz.yljc.entity.ViewTsgzYljc;
import com.jeesite.modules.tsgz.yljc.service.ViewTsgzYljcService;

/**
 * 态势感知-言论监测Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/yljc/viewTsgzYljc")
public class ViewTsgzYljcController extends BaseController {

	@Autowired
	private ViewTsgzYljcService viewTsgzYljcService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewTsgzYljc get(String id, boolean isNewRecord) {
		return viewTsgzYljcService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("yljc:viewTsgzYljc:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewTsgzYljc viewTsgzYljc, Model model) {
		model.addAttribute("viewTsgzYljc", viewTsgzYljc);
		return "tsgz/yljc/viewTsgzYljcList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("yljc:viewTsgzYljc:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewTsgzYljc> listData(ViewTsgzYljc viewTsgzYljc, HttpServletRequest request, HttpServletResponse response) {
		viewTsgzYljc.setPage(new Page<>(request, response));
		Page<ViewTsgzYljc> page = viewTsgzYljcService.findPage(viewTsgzYljc);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("yljc:viewTsgzYljc:view")
	@RequestMapping(value = "form")
	public String form(ViewTsgzYljc viewTsgzYljc, Model model) {
		model.addAttribute("viewTsgzYljc", viewTsgzYljc);
		return "tsgz/yljc/viewTsgzYljcForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("yljc:viewTsgzYljc:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewTsgzYljc viewTsgzYljc) {
		viewTsgzYljcService.save(viewTsgzYljc);
		return renderResult(Global.TRUE, text("保存态势感知-言论监测成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("yljc:viewTsgzYljc:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewTsgzYljc viewTsgzYljc) {
		viewTsgzYljcService.delete(viewTsgzYljc);
		return renderResult(Global.TRUE, text("删除态势感知-言论监测成功！"));
	}
	
}