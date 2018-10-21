package com.cookie312.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cookie312.domain.Items;
import com.cookie312.service.ItemsService;

@Controller
@RequestMapping("/items")
public class ItemsController {
	
	@Autowired
	private ItemsService itemsService;
	
	
	@RequestMapping("/showDetail")
	public String showDetail(Model model) {
		Items items = itemsService.findById(3);
		model.addAttribute("item",items);  //将查询数据返回给页面
		return "itemDetail"; 	//跳转页面
	}
	
}
