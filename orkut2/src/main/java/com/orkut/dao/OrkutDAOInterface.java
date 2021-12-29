package com.orkut.dao;

import java.util.List;

import com.orkut.entity.OrkutUser;
import com.orkut.entity.TimeLineEntity;

public interface OrkutDAOInterface {

	int createProfileDAO(OrkutUser lu);

	OrkutUser viewProfileDAO(OrkutUser lu);

	List<OrkutUser> viewAllProfileDAO();

	int deleteProfileDAO(OrkutUser lu);

	OrkutUser loginProfileDAO(OrkutUser lu);

	List<TimeLineEntity> timelineProfileDAO(OrkutUser lu);

	int editProfileDAO(OrkutUser lu);

}
