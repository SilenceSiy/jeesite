package com.jeesite.modules.tsgz.xwzx.web;

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
import com.jeesite.modules.tsgz.xwzx.entity.ViewTsgzXwzx;
import com.jeesite.modules.tsgz.xwzx.service.ViewTsgzXwzxService;

/**
 * 态势感知-新闻资讯Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/xwzx/viewTsgzXwzx")
public class ViewTsgzXwzxController extends BaseController {

	@Autowired
	private ViewTsgzXwzxService viewTsgzXwzxService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewTsgzXwzx get(String id, boolean isNewRecord) {
		return viewTsgzXwzxService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("xwzx:viewTsgzXwzx:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewTsgzXwzx viewTsgzXwzx, Model model) {
		model.addAttribute("viewTsgzXwzx", viewTsgzXwzx);
		return "tsgz/xwzx/viewTsgzXwzxList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("xwzx:viewTsgzXwzx:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewTsgzXwzx> listData(ViewTsgzXwzx viewTsgzXwzx, HttpServletRequest request, HttpServletResponse response) {
		viewTsgzXwzx.setPage(new Page<>(request, response));
		Page<ViewTsgzXwzx> page = viewTsgzXwzxService.findPage(viewTsgzXwzx);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("xwzx:viewTsgzXwzx:view")
	@RequestMapping(value = "form")
	public String form(ViewTsgzXwzx viewTsgzXwzx, Model model) {
		model.addAttribute("viewTsgzXwzx", viewTsgzXwzx);
		return "tsgz/xwzx/viewTsgzXwzxForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("xwzx:viewTsgzXwzx:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewTsgzXwzx viewTsgzXwzx) {
		viewTsgzXwzxService.save(viewTsgzXwzx);
		return renderResult(Global.TRUE, text("保存态势感知-新闻资讯成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("xwzx:viewTsgzXwzx:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewTsgzXwzx viewTsgzXwzx) {
		viewTsgzXwzxService.delete(viewTsgzXwzx);
		return renderResult(Global.TRUE, text("删除态势感知-新闻资讯成功！"));
	}
	
}