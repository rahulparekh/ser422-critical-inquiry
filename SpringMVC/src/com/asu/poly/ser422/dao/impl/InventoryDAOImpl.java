package com.asu.poly.ser422.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.asu.poly.ser422.dao.InventoryDAO;
import com.asu.poly.ser422.dao.ItemMapper;
import com.asu.poly.ser422.dto.ItemDTO;

public class InventoryDAOImpl implements InventoryDAO{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource ds) {
		this.dataSource = ds;
	    this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public ItemDTO getItem(int sku) {
		String SQL = "select * from inventory where sku = ?";
	     ItemDTO student = jdbcTemplateObject.queryForObject(SQL, 
	                        new Object[]{sku}, new ItemMapper());
	      return student;
	}

	@Override
	public List<ItemDTO> getItems() {
		 String query = "select * from inventory";
	     List <ItemDTO> items = jdbcTemplateObject.query(query, new ItemMapper());
	     return items;

	}

	@Override
	public void create(ItemDTO itemDTO) {
		String query = "insert into inventory(sku, item_name, quantity_in_stock, price) values(?,?,?,?)";
		
		jdbcTemplateObject.update( query, itemDTO.getSku(), itemDTO.getItemName(), itemDTO.getQuantityInStock(), itemDTO.getPrice());
	    System.out.println("Created Record Name = " + itemDTO.getItemName());
	    return;
		
	}

}
