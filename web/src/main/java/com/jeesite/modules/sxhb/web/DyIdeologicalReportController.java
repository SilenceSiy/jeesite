package com.jeesite.modules.sxhb.web;

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
import com.jeesite.modules.sxhb.entity.DyIdeologicalReport;
import com.jeesite.modules.sxhb.service.DyIdeologicalReportService;

/**
 * 思想汇报管理Controller
 * @author shenbao
 * @version 2023-04-26
 */
@Controller
@RequestMapping(value = "${adminPath}/sxhb/dyIdeologicalReport")
public class DyIdeologicalReportController extends BaseController {

	@Autowired
	private DyIdeologicalReportService dyIdeologicalReportService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public DyIdeologicalReport get(String id, boolean isNewRecord) {
		return dyIdeologicalReportService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("sxhb:dyIdeologicalReport:view")
	@RequestMapping(value = {"list", ""})
	public String list(DyIdeologicalReport dyIdeologicalReport, Model model) {
		model.addAttribute("dyIdeologicalReport", dyIdeologicalReport);
		return "modules/sxhb/dyIdeologicalReportList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("sxhb:dyIdeologicalReport:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<DyIdeologicalReport> listData(DyIdeologicalReport dyIdeologicalReport, HttpServletRequest request, HttpServletResponse response) {
		dyIdeologicalReport.setPage(new Page<>(request, response));
		Page<DyIdeologicalReport> page = dyIdeologicalReportService.findPage(dyIdeologicalReport);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("sxhb:dyIdeologicalReport:view")
	@RequestMapping(value = "form")
	public String form(DyIdeologicalReport dyIdeologicalReport, Model model) {
		model.addAttribute("dyIdeologicalReport", dyIdeologicalReport);
		return "modules/sxhb/dyIdeologicalReportForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("sxhb:dyIdeologicalReport:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated DyIdeologicalReport dyIdeologicalReport) {
		dyIdeologicalReportService.save(dyIdeologicalReport);
		return renderResult(Global.TRUE, text("保存思想汇报管理成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("sxhb:dyIdeologicalReport:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(DyIdeologicalReport dyIdeologicalReport) {
		dyIdeologicalReportService.delete(dyIdeologicalReport);
		return renderResult(Global.TRUE, text("删除思想汇报管理成功！"));
	}
	
}