package com.orkut.utility;

import com.orkut.dao.OrkutDAO;
import com.orkut.dao.OrkutDAOInterface;

public class DaoFactory {
	
	private DaoFactory() {
		
	}

	public static OrkutDAOInterface createObject() {
		// TODO Auto-generated method stub
		return new OrkutDAO();
	}

}
