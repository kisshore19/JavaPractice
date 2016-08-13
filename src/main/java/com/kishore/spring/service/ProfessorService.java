package com.kishore.spring.service;

import java.util.List;

import com.kishore.hibernate.beans.onetomanyBidirection.Professor;


public interface ProfessorService {

	void saveProfessor(Professor professor);

	List<Professor> findAllProfessors();

	void deleteProfessorByName(String name);

	Professor findProfessorByID(int id);

	void updateProfessor(Professor professor);

}
