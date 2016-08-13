package com.kishore.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kishore.hibernate.beans.onetomanyBidirection.Professor;
import com.kishore.spring.dao.ProfessorDao;

@Service("professorService")
@Transactional
public class ProfessorServiceImpl implements ProfessorService {

	@Autowired
	ProfessorDao professorDao;

	public void saveProfessor(Professor professor) {

		professorDao.saveProfessor(professor);
	}

	public List<Professor> findAllProfessors() {
		return professorDao.findAllProfessor();
	}

	public void deleteProfessorByName(String name) {

		professorDao.deleteProfessorByName(name);
	}

	public Professor findProfessorByID(int id) {

		return professorDao.findProfessorByID(id);
	}

	public void updateProfessor(Professor professor) {

		professorDao.updateProfessor(professor);
	}

}
