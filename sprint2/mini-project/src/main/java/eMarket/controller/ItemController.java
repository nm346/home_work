
package eMarket.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import eMarket.EMarketApp;
import eMarket.domain.*;

@Controller
@RequestMapping("/item")
public class ItemController {

	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	public String productDetail(Model model,
			@RequestParam(value = "productId", required = false, defaultValue = "-1") int productId,
			@RequestParam(value = "orderId", required = false, defaultValue = "-1") int orderId) {

		HashMap<String, String> product = new HashMap<String, String>();
		for (int i = 0; i < EMarketApp.getStore().getProductList().size(); i++) {
			product.put(Integer.toString(EMarketApp.getStore().getProductList().get(i).getId()),
					EMarketApp.getStore().getProductList().get(i).getName());
		}
		if (productId != -1)
			model.addAttribute("item", EMarketApp.getStore().getItemList().stream()
					.filter(i -> (i.getOrderId() == orderId && i.getId() == productId)).findAny().get());
		else
			// model.addAttribute("item", new Item(Item.lastId++, orderId, -1,
			// 0));
			model.addAttribute("item", new Item(Item.lastId++, orderId, -1, 0));
		// model.addAttribute("productList",
		// EMarketApp.getStore().getProductList());
		model.addAttribute("product", product);
		return "form/itemDetail";
	}
	// int id, String name, String description, double price

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String ItemMaster(@ModelAttribute("Item") Item item, Model model) {
		if (item.getOrderId() < 0) {
			throw new SpringException("ERROeR");
		}

		if (item.getOrderId() <= 0) {
			throw new SpringException("Amount is low");
		}

		EMarketApp.getStore().getItemList()
				.removeIf(p -> (p).getId() == item.getId() && p.getOrderId() == item.getOrderId());
		EMarketApp.getStore().getItemList().add(item);

		ArrayList<Item> items = new ArrayList<Item>();
		EMarketApp.getStore().getItemList().stream().filter(i -> (i.getOrderId() == item.getOrderId()))
				.forEach(i -> items.add(i));
		model.addAttribute("Order", EMarketApp.getStore().getOrderList().stream()
				.filter(o -> (o.getId() == item.getOrderId())).findAny().get());
		model.addAttribute("ItemList", item);
		return "form/orderDetail";
	}

}
// item.setAmount(item.getAmount());