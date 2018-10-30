package com.qa;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;




public class AccountManager {
	
	protected HashMap<String, Integer> myMap = new HashMap<String, Integer>();
	protected String name;
	protected String myOutput;
	
	public void addAccount(Account acc) {
		name = acc.getFirstName() + " " +  acc.getLastName();
		myMap.put(name, acc.getAccountNumber());
		
	}

	public Map<String, Integer> getMyMap() {
		return myMap;
	}
	
	
	public String convert2Json(Map<String, Integer> myMap) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		myOutput = mapper.writeValueAsString(myMap);
		return myOutput;
	}

}
