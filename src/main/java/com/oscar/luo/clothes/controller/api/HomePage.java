package com.oscar.luo.clothes.controller.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class HomePage {
	@RequestMapping("/")
	public Map<String, Comparable> getAll(){
		Map<String, Comparable> map = new HashMap<String, Comparable>();
		map.put("name", "oscarluo");
		map.put("age", 28);
		map.put("gender", "male");
		map.put("company", "sap");
		map.put("hometown", "bazhong");
		
		return map;
	}
}
