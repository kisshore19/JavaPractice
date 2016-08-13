package com.kishore.spring.dao;

import java.util.List;

import com.kishore.hibernate.beans.onetoManyBidirectional.Collage;

public interface CollegeDao {
	
	public void saveCollege(Collage collage);
	public void deleteCollege(Collage collage);
	public void updateCollege(Collage collage);
	public List<Collage> findCollegeByName(Collage collage);
	public List<Collage> findAllColleges();
 
}
