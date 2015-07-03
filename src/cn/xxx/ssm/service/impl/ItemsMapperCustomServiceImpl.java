package cn.xxx.ssm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.xxx.ssm.mapper.ItemsMapperCustom;
import cn.xxx.ssm.po.ItemsCustom;
import cn.xxx.ssm.po.ItemsQueryVo;
import cn.xxx.ssm.service.ItemsMapperCustomService;

public class ItemsMapperCustomServiceImpl implements ItemsMapperCustomService{

	@Autowired
	private ItemsMapperCustom itemsMapperCustom;
	
	@Override
	public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
			throws Exception {
		
		return itemsMapperCustom.findItemsList(itemsQueryVo);
	}

}
