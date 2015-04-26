package com.asu.poly.ser422.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.asu.poly.ser422.dao.InventoryDAO;
import com.asu.poly.ser422.dto.ItemDTO;

@Controller
public class MVCController {
	
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		String message = "Hello World, Spring 3.0!";
		System.out.println(message);
		
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("Beans.xml");
		
		InventoryDAO inventoryDAO = (InventoryDAO) context.getBean("inventoryDAOImpl");
		List<ItemDTO> items = (List<ItemDTO>)inventoryDAO.getItems();
		
		for (ItemDTO itemDTO : items) {
			System.out.println("=============================================");
			System.out.println("Item name       : " + itemDTO.getItemName());
			System.out.println("Item SKU        : " + itemDTO.getSku());
			System.out.println("Item quantity   : " + itemDTO.getQuantityInStock());
			System.out.println("Item price      : " + itemDTO.getPrice());
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("allItems");
		modelAndView.addObject("items", items);
	
		return modelAndView;
	}

}
