package com.kishore.spring.service;

import java.util.List;

import com.kishore.hibernate.beans.onetoManyBidirectional.Collage;

public interface CollegeService {
	public void saveCollege(Collage collage);

	public void deleteCollege(Collage collage);

	public void updateCollege(Collage collage);

	public List<Collage> findCollegeByName(Collage collage);

	public List<Collage> findAllColleges();
}
