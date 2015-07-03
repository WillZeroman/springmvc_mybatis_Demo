package cn.xxx.ssm.service;

import java.util.List;

import cn.xxx.ssm.po.ItemsCustom;
import cn.xxx.ssm.po.ItemsQueryVo;

public interface ItemsMapperCustomService {
	public  List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception;
}
