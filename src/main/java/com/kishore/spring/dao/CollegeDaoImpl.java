package com.kishore.spring.dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import com.kishore.hibernate.beans.onetoManyBidirectional.Collage;

@Repository("collegeDao")
public class CollegeDaoImpl extends AbstractDao implements CollegeDao {

	public void saveCollege(Collage collage) {
		persist(collage);

	}

	public void deleteCollege(Collage collage) {
		delete(collage);
	}

	public void updateCollege(Collage collage) {
		getSession().saveOrUpdate(collage);

	}

	@SuppressWarnings("unchecked")
	public List<Collage> findCollegeByName(Collage collage) {
		Query query = getSession().createQuery("select from" + Collage.class + "where collageName =:collageName");
		query.setString("collageName", collage.getcollageName());
		return query.list();
	}

	@SuppressWarnings("unchecked")
	public List<Collage> findAllColleges() {
		return getSession().createCriteria(Collage.class).list();
	}

}
