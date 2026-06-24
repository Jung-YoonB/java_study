package com.kh.ex2.controller;

import com.kh.ex2.model.GalaxyNote9;
import com.kh.ex2.model.Phone;
import com.kh.ex2.model.V40;

public class PhoneController {
	
	private String[] result;
	
	public String[] method() {
		Phone[] phone = new Phone[2];
		phone[0] = new GalaxyNote9();
		phone[1] = new V40();
		
		result = new String[2];
		
		for (int i=0; i<phone.length; i++) {
			
			if (phone[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)phone[i]).printInformation();
			}
			
			if (phone[i] instanceof V40) {
				result[i] = ((V40)phone[i]).printInformation();
			}
			
		}
				
		return result;		
	}
	
}
