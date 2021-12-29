package com.orkut.utility;

import com.orkut.service.OrkutService;
import com.orkut.service.OrkutServiceInterface;

public class ServiceFactory {
	
	private ServiceFactory() {
		
	}

	public static OrkutServiceInterface createObject() {
		// TODO Auto-generated method stub
		return new OrkutService();
	}

}
