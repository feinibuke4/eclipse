package com.web.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.domain.Tackets;
import com.service.TacketsService;

//@RestController // 包括@Controller@ResponseBody一般一个类里都是异步用这个注解
@CrossOrigin // 跨域访问，所有网站可以跨域访问
@Controller
@SessionAttributes("list")
public class TacketsController {

	@Autowired
	private TacketsService tacketsservice;

	@RequestMapping("findall")
	public String findall(ModelMap modelmap) {
		modelmap.put("list", this.tacketsservice.findalltackets());
		return "redirect:ticketSearch.jsp";
	}

	@RequestMapping("addUI")
	public String addUI() {
		return "redirect:TicketAdd.jsp";
	}

	@RequestMapping("secaadd")
	public String sevaadd(Tackets tackets) {
		this.tacketsservice.sevaadd(tackets);

		return "findall";
	}

	@RequestMapping("updateUI")
	public String updateUI(Integer id, ModelMap modelmap) {
		modelmap.put("upid", this.tacketsservice.updateid(id));
		return "TicketModify.jsp";
	}

	@RequestMapping("saveupdate")
	public String saveupdate(Tackets tackets) {
		this.tacketsservice.saveupdate(tackets);
		return "findall";
	}
	@RequestMapping("delete")
	public String savedelete(Integer id) {
		this.tacketsservice.savedelete(id);
		return "findall";
	}
}
