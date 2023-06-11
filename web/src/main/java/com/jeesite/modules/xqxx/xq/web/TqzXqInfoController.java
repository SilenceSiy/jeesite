package com.jeesite.modules.xqxx.xq.web;

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
import com.jeesite.modules.xqxx.xq.entity.TqzXqInfo;
import com.jeesite.modules.xqxx.xq.entity.TqzXqHx;
import com.jeesite.modules.xqxx.xq.entity.TqzXqLd;
import com.jeesite.modules.xqxx.xq.service.TqzXqInfoService;

/**
 * 小区信息Controller
 * @author admin
 * @version 2023-06-11
 */
@Controller
@RequestMapping(value = "${adminPath}/xq/tqzXqInfo")
public class TqzXqInfoController extends BaseController {

	@Autowired
	private TqzXqInfoService tqzXqInfoService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public TqzXqInfo get(String id, boolean isNewRecord) {
		return tqzXqInfoService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("xq:tqzXqInfo:view")
	@RequestMapping(value = {"list", ""})
	public String list(TqzXqInfo tqzXqInfo, Model model) {
		model.addAttribute("tqzXqInfo", tqzXqInfo);
		return "xqxx/xq/tqzXqInfoList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("xq:tqzXqInfo:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<TqzXqInfo> listData(TqzXqInfo tqzXqInfo, HttpServletRequest request, HttpServletResponse response) {
		tqzXqInfo.setPage(new Page<>(request, response));
		Page<TqzXqInfo> page = tqzXqInfoService.findPage(tqzXqInfo);
		return page;
	}
	
	/**
	 * 查询子表数据
	 */
	@RequiresPermissions("xq:tqzXqInfo:view")
	@RequestMapping(value = "tqzXqHxListData")
	@ResponseBody
	public Page<TqzXqHx> subListData(TqzXqHx tqzXqHx, HttpServletRequest request, HttpServletResponse response) {
		tqzXqHx.setPage(new Page<>(request, response));
		Page<TqzXqHx> page = tqzXqInfoService.findSubPage(tqzXqHx);
		return page;
	}
	
	/**
	 * 查询子表数据
	 */
	@RequiresPermissions("xq:tqzXqInfo:view")
	@RequestMapping(value = "tqzXqLdListData")
	@ResponseBody
	public Page<TqzXqLd> subListData(TqzXqLd tqzXqLd, HttpServletRequest request, HttpServletResponse response) {
		tqzXqLd.setPage(new Page<>(request, response));
		Page<TqzXqLd> page = tqzXqInfoService.findSubPage(tqzXqLd);
		return page;
	}


	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("xq:tqzXqInfo:view")
	@RequestMapping(value = "view")
	public String detail(TqzXqInfo tqzXqInfo, Model model) {
		model.addAttribute("tqzXqInfo", tqzXqInfo);
		return "xqxx/xq/tqzXqInfoView";
	}



	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("xq:tqzXqInfo:view")
	@RequestMapping(value = "form")
	public String form(TqzXqInfo tqzXqInfo, Model model) {
		model.addAttribute("tqzXqInfo", tqzXqInfo);
		return "xqxx/xq/tqzXqInfoForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("xq:tqzXqInfo:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated TqzXqInfo tqzXqInfo) {
		tqzXqInfoService.save(tqzXqInfo);
		return renderResult(Global.TRUE, text("保存小区信息成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("xq:tqzXqInfo:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(TqzXqInfo tqzXqInfo) {
		tqzXqInfoService.delete(tqzXqInfo);
		return renderResult(Global.TRUE, text("删除小区信息成功！"));
	}
	
}