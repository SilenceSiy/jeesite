package com.jeesite.modules.tsgz.rdht.web;

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
import com.jeesite.modules.tsgz.rdht.entity.ViewYyrdRdhtphb;
import com.jeesite.modules.tsgz.rdht.service.ViewYyrdRdhtphbService;

/**
 * 态势感知-亚运热点-热点话题排行榜Controller
 * @author admin
 * @version 2023-05-25
 */
@Controller
@RequestMapping(value = "${adminPath}/rdht/viewYyrdRdhtphb")
public class ViewYyrdRdhtphbController extends BaseController {

	@Autowired
	private ViewYyrdRdhtphbService viewYyrdRdhtphbService;
	
	/**
	 * 获取数据
	 */
	@ModelAttribute
	public ViewYyrdRdhtphb get(String id, boolean isNewRecord) {
		return viewYyrdRdhtphbService.get(id, isNewRecord);
	}
	
	/**
	 * 查询列表
	 */
	@RequiresPermissions("rdht:viewYyrdRdhtphb:view")
	@RequestMapping(value = {"list", ""})
	public String list(ViewYyrdRdhtphb viewYyrdRdhtphb, Model model) {
		model.addAttribute("viewYyrdRdhtphb", viewYyrdRdhtphb);
		return "tsgz/rdht/viewYyrdRdhtphbList";
	}
	
	/**
	 * 查询列表数据
	 */
	@RequiresPermissions("rdht:viewYyrdRdhtphb:view")
	@RequestMapping(value = "listData")
	@ResponseBody
	public Page<ViewYyrdRdhtphb> listData(ViewYyrdRdhtphb viewYyrdRdhtphb, HttpServletRequest request, HttpServletResponse response) {
		viewYyrdRdhtphb.setPage(new Page<>(request, response));
		Page<ViewYyrdRdhtphb> page = viewYyrdRdhtphbService.findPage(viewYyrdRdhtphb);
		return page;
	}

	/**
	 * 查看编辑表单
	 */
	@RequiresPermissions("rdht:viewYyrdRdhtphb:view")
	@RequestMapping(value = "form")
	public String form(ViewYyrdRdhtphb viewYyrdRdhtphb, Model model) {
		model.addAttribute("viewYyrdRdhtphb", viewYyrdRdhtphb);
		return "tsgz/rdht/viewYyrdRdhtphbForm";
	}

	/**
	 * 保存数据
	 */
	@RequiresPermissions("rdht:viewYyrdRdhtphb:edit")
	@PostMapping(value = "save")
	@ResponseBody
	public String save(@Validated ViewYyrdRdhtphb viewYyrdRdhtphb) {
		viewYyrdRdhtphbService.save(viewYyrdRdhtphb);
		return renderResult(Global.TRUE, text("保存态势感知-亚运热点-热点话题排行榜成功！"));
	}
	
	/**
	 * 删除数据
	 */
	@RequiresPermissions("rdht:viewYyrdRdhtphb:edit")
	@RequestMapping(value = "delete")
	@ResponseBody
	public String delete(ViewYyrdRdhtphb viewYyrdRdhtphb) {
		viewYyrdRdhtphbService.delete(viewYyrdRdhtphb);
		return renderResult(Global.TRUE, text("删除态势感知-亚运热点-热点话题排行榜成功！"));
	}
	
}