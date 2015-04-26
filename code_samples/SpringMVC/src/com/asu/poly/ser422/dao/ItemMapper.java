package com.asu.poly.ser422.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.asu.poly.ser422.dto.ItemDTO;

public class ItemMapper implements RowMapper<ItemDTO>{
	
	 public ItemDTO mapRow(ResultSet rs, int arg0) throws SQLException {
	      ItemDTO itemDTO = new ItemDTO();
	      itemDTO.setInventoryId(rs.getInt("inventory_id"));
	      itemDTO.setItemName(rs.getString("item_name"));
	      itemDTO.setSku(rs.getInt("sku"));
	      itemDTO.setQuantityInStock(rs.getInt("quantity_in_stock"));
	      itemDTO.setPrice(rs.getInt("price"));
	      	      
	      return itemDTO;
	   }
	
}
