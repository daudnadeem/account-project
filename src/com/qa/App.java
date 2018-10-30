package com.qa;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {

	public static void main(String[] args) throws JsonProcessingException {


		Account acc1 = new Account("Slim", "Shady", 1007);
		Account acc2 = new Account("Alvin", "Check", 2000);
		Account acc3 = new Account("Boom", "Baam", 9000);
		
		AccountManager am = new AccountManager();
		am.addAccount(acc1);
		am.addAccount(acc2);
		am.addAccount(acc3);

		Map<String, Integer> myMapOutput = am.getMyMap();
		

		System.out.println(am.convert2Json(myMapOutput));

	}

}
