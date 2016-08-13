package com.kishore.spring.dao;

import java.util.List;

import com.kishore.hibernate.beans.onetomanyBidirection.Professor;


public interface ProfessorDao {
	
	void saveProfessor(Professor professor);

	List<Professor> findAllProfessor();

	void deleteProfessorByName(String name);

	Professor findProfessorByID(int id);

	void updateProfessor(Professor professor);

}
