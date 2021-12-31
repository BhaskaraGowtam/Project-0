package com.orkut.service;

import java.util.List;

import com.orkut.dao.OrkutDAOInterface;
import com.orkut.entity.OrkutUser;
import com.orkut.entity.TimeLineEntity;
import com.orkut.utility.DaoFactory;

public class OrkutService implements OrkutServiceInterface {

	public int createProfileService(OrkutUser lu) {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return ld.createProfileDAO(lu);
	}

	//@Override
	public OrkutUser viewProfileService(OrkutUser lu) {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return ld.viewProfileDAO(lu);
	}

	//@Override
	public List<OrkutUser> viewAllProfileService() {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return ld.viewAllProfileDAO();
	}

	//@Override
	public int deleteProfileService(OrkutUser lu) {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return ld.deleteProfileDAO(lu);
	}

	//@Override
	public OrkutUser loginProfileService(OrkutUser lu) {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return ld.loginProfileDAO(lu);
	}

	//@Override
	public List<TimeLineEntity> timelineService(OrkutUser lu) {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return ld.timelineProfileDAO(lu);
	}

	public int editProfileService(OrkutUser lu) {
		OrkutDAOInterface ld=DaoFactory.createObject();
		return  ld.editProfileDAO(lu);
	}

	

}
