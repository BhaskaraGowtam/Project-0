package com.orkut;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.orkut.dao.OrkutDAO;
import com.orkut.dao.OrkutDAOInterface;
import com.orkut.entity.OrkutUser;

public class DAOTesting {
	
	private OrkutDAOInterface ld;

	@Before
	public void setUp() throws Exception {
		ld=new OrkutDAO();
	}

	@After
	public void tearDown() throws Exception {
		ld=null;
	}

	@Test
	public void testCreateProfileDAO() {
		OrkutUser lu=new OrkutUser();
		lu.setName("Mohan");
		lu.setPassword("sss");
		lu.setEmail("s");
		lu.setAddress("Chennai");
		int i=ld.createProfileDAO(lu);
		
		assert i>0:"profile creation failed";
	}

	@Test
	public void testViewProfileDAO() {
		OrkutUser lu=new OrkutUser();
		
		lu.setEmail("s");
		
		OrkutUser i=ld.viewProfileDAO(lu);
		
		assert i!=null:"profile not found";
	}

}
