
package eMarket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;
import eMarket.domain.*;
import eMarket.domain.Order;

@Controller
@RequestMapping("/order")
public class OrderController {

	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("orderList", EMarketApp.getStore().getOrderList());
		return "form/orderMaster";
	}

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String orderDetail(
			@RequestParam(value = "orderId", required = false, defaultValue = "-1") Model model, int orderId) {
			Optional<Order> p2 = ((collection<Order>)EMarketApp.getStore().getOrderList()).stream().filter(p -> (((Order)p).getId()== orderId)).findAny();
			/////
			if(!p2.isPresent()) throw new SpringException("order is incomplete");
			
			ArrayList<Item> item = new ArrayList<Item>();
			EMarketApp.getStore().getItemList().stream().filter(i ->(i.getOrderId() == p2.getId())).forEach(i -> items.add(i));
			
			model.addAttribute("Order", p2.get());
			model.addAttribute("ItemList", item);
		return "form/orderDetail";
	}

	@RequestMapping(value = "/add")
	public String orderMaster(Model model) {
		Order order = new Order(Order.lastId++);
		((Collection<Order>)
				EMarketApp.getStore().getOrderList()).removeIf(p ->(p.getId()==order.getId()));
				((Collection<Order>)
						EMarketApp.getStore().getOrderList()).add(order);
						model.addAttribute("Order", order);
						model.addAttribute("ItemList", order.getItemList());
	
		return "form/orderDetail";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String orderMaster(@RequestParam(value = "orderId", required = false, defaultValue = "-1") int orderId,
			Model model) {
		EMarketApp.getStore().getOrderList().removeIf(p -> (p.getId() == orderId));
		model.addAttribute("orderList", EMarketApp.getStore().getOrderList());
		return "form/orderMaster";
	}

}
