package cn.xxx.ssm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import cn.xxx.ssm.po.ItemsCustom;
import cn.xxx.ssm.service.ItemsMapperCustomService;

/*
 * 
 * 
 */
@Controller
public class ItemsController{
	
	@Autowired
	private ItemsMapperCustomService itemsService;
	//标识一个映射器
	@RequestMapping("queryItems")
	public ModelAndView queryItems() throws Exception {
		//调用service 查找数据库，
		List<ItemsCustom> itemsList = new ArrayList<ItemsCustom>();
		System.out.println("items controller");
		itemsList = itemsService.findItemsList(null);
		//返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemsList",itemsList);
		modelAndView.setViewName("/itemsList.jsp");
		return modelAndView;
	}
	
}
