package com.kishore.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kishore.hibernate.beans.onetoManyBidirectional.Collage;
import com.kishore.spring.dao.CollegeDao;

@Service("collegeService")
@Transactional
public class CollageServiceImpl implements CollegeService {

	@Autowired
	CollegeDao collegeDao;

	public void saveCollege(Collage collage) {

		collegeDao.saveCollege(collage);
	}

	public void deleteCollege(Collage collage) {
		collegeDao.deleteCollege(collage);

	}

	public void updateCollege(Collage collage) {

		collegeDao.updateCollege(collage);
	}

	public List<Collage> findCollegeByName(Collage collage) {

		return collegeDao.findCollegeByName(collage);
	}

	public List<Collage> findAllColleges() {
		return collegeDao.findAllColleges();
	}

}
