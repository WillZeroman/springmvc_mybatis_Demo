package cn.xxx.ssm.po;

/**
 * 
 * <p>Title: ItemsQueryVo</p>
 * <p>Description:商品包装对象 </p>
 * <p>Company:</p> 
 * @author	
 * @date	2015-7-3下午3:22:36
 * @version 1.0
 */
public class ItemsQueryVo {
	
	//商品信息
	private Items items;
	
	//为了系统 可扩展性，对原始生成的po进行扩展
	private ItemsCustom itemsCustom;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	public ItemsCustom getItemsCustom() {
		return itemsCustom;
	}

	public void setItemsCustom(ItemsCustom itemsCustom) {
		this.itemsCustom = itemsCustom;
	}
	
	

}
