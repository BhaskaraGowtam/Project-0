package com.orkut.service;

import java.util.List;

import com.orkut.entity.OrkutUser;
import com.orkut.entity.TimeLineEntity;

public interface OrkutServiceInterface {

	int createProfileService(OrkutUser lu);

	OrkutUser viewProfileService(OrkutUser lu);

	List<OrkutUser> viewAllProfileService();

	int deleteProfileService(OrkutUser lu);

	OrkutUser loginProfileService(OrkutUser lu);

	List<TimeLineEntity> timelineService(OrkutUser lu);

	int editProfileService(OrkutUser lu);

	//OrkutUser searchProfileService(OrkutUser lu);

}
