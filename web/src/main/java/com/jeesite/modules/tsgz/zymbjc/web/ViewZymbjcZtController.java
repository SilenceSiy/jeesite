package com.jeesite.modules.tsgz.zymbjc.web;

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
import com.jeesite.modules.tsgz.zymbjc.entity.ViewZymbjcZt;
import com.jeesite.modules.tsgz.zymbjc.service.ViewZymbjcZtService;

/**
 * 态势感知-重要目标监测Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/zymbjc/viewZymbjcZt")
public class ViewZymbjcZtController extends BaseController {

	@Autowired
	private ViewZymbjcZtService viewZymbjcZtService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewZymbjcZt get(String id, boolean isNewRecord) {
		return viewZymbjcZtService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("zymbjc:viewZymbjcZt:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewZymbjcZt viewZymbjcZt, Model model) {
		model.addAttribute("viewZymbjcZt", viewZymbjcZt);
		return "tsgz/zymbjc/viewZymbjcZtList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("zymbjc:viewZymbjcZt:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewZymbjcZt> listData(ViewZymbjcZt viewZymbjcZt, HttpServletRequest request, HttpServletResponse response) {
		viewZymbjcZt.setPage(new Page<>(request, response));
		Page<ViewZymbjcZt> page = viewZymbjcZtService.findPage(viewZymbjcZt);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("zymbjc:viewZymbjcZt:view")
	@RequestMapping(value = "form")
	public String form(ViewZymbjcZt viewZymbjcZt, Model model) {
		model.addAttribute("viewZymbjcZt", viewZymbjcZt);
		return "tsgz/zymbjc/viewZymbjcZtForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("zymbjc:viewZymbjcZt:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewZymbjcZt viewZymbjcZt) {
		viewZymbjcZtService.save(viewZymbjcZt);
		return renderResult(Global.TRUE, text("保存态势感知-重要目标监测成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("zymbjc:viewZymbjcZt:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewZymbjcZt viewZymbjcZt) {
		viewZymbjcZtService.delete(viewZymbjcZt);
		return renderResult(Global.TRUE, text("删除态势感知-重要目标监测成功！"));
	}
	
}