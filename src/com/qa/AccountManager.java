package com.qa;
import java.util.HashMap;

public class AccountManager {
	
	protected HashMap<String, Integer> myMap = new HashMap<String, Integer>();
	protected String name;
	
	public void addAccount(Account acc) {
		name = acc.getFirstName() + acc.getLastName();
		myMap.put(name, acc.getAccountNumber());
		
	}

	public HashMap<String, Integer> getMyMap() {
		return myMap;
	}

}
