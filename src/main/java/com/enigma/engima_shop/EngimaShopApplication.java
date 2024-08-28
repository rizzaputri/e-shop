package com.enigma.engima_shop;

import com.enigma.engima_shop.entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootApplication
//@RestController
public class EngimaShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(EngimaShopApplication.class, args);
	}

//	@GetMapping(path = "/hello")
//	public String helloWorld() {
//		return "<h1> Hello World </h1>";
//	}
//
//	@RequestMapping(method = RequestMethod.GET, path = "/products")
//	public Map<String, Object> getProduct() {
//		return Map.of(
//				"Id", "1",
//				"Name", "POCO M6 Pro",
//				"Price", "2700000"
//		);
//	}
//
//	@GetMapping(path = "/menus")
//	public List<Map<String, Object>> getMenuFiltered(
//			@RequestParam(name = "name", required = false) String name,
//			@RequestParam(name = "maxPrice", required = false) Integer maxPrice
//	) {
//		Map<String, Object> menu = Map.of(
//				"Id", "1'",
//				"Name", "" + name,
//				"Price", "" + maxPrice
//        );
//
//		List<Map<String, Object>> menus = new ArrayList<>();
//		menus.add(menu);
//
//		return menus;
//	}
//
//	@GetMapping(path = "/menus/{id}")
//	public String getMenuById(@PathVariable String id) {
//		return "Menu dengan id " + id;
//	}
//
//	@PostMapping(path = "/product")
//	public Product getProduct(@RequestBody Product product) {
//		return product;
//	}
}
