package com.asu.poly.ser422.dao;

import java.util.List;

import javax.sql.DataSource;

import com.asu.poly.ser422.dto.ItemDTO;

public interface InventoryDAO {
	
	public void setDataSource(DataSource ds);
	public ItemDTO getItem(int sku);
	public List<ItemDTO> getItems();
	public void create(ItemDTO itemDTO);

}
