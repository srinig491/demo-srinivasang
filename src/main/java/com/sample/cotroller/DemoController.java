package com.sample.cotroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {

	@RequestMapping(value="/getproductdetails",method = RequestMethod.GET,produces = {"application/json"})
	public ResponseEntity<Map<String, String>> getProductDetails() {
		Map<String, String> map=new HashMap<String, String>();
		map.put("devicename", "TA500");
		map.put("noofport", "12");
		map.put("slots", "2");
		map.put("category", "switch");
		ResponseEntity<Map<String, String>> rt=new ResponseEntity<Map<String, String>>(map,HttpStatus.OK);
		return rt;
		
	}
	
	@RequestMapping(value="/getconfigdetails",method = RequestMethod.GET,produces = {"application/json"})
	public ResponseEntity<Map<String, String>> getConfigDetails() {
		Map<String, String> map=new HashMap<String, String>();
		map.put("config1", "windowsconfiguration");
		map.put("config2", "linuxconfiguration");
		map.put("config3", "macosconfiguration");
		ResponseEntity<Map<String, String>> rt=new ResponseEntity<Map<String, String>>(map,HttpStatus.OK);
		return rt;
		
	}
	
}
