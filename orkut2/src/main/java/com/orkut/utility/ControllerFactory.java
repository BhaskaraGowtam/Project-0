package com.orkut.utility;

import com.orkut.controller.OrkutController;
import com.orkut.controller.OrkutControllerInterface;

public class ControllerFactory {
	
	private ControllerFactory() {
		
	}

	public static OrkutControllerInterface createObject() {
		// TODO Auto-generated method stub
		return new OrkutController();
	}

}
