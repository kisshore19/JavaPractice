package com.kishore.testpackage;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.kishore.hibernate.beans.Actor;
import com.kishore.hibernate.beans.ActorInfo;
import com.kishore.hibernate.beans.onetoManyBidirectional.Collage;
import com.kishore.hibernate.beans.onetoManyBidirectional.Student;
import com.kishore.hibernate.beans.onetomanyBidirection.ParkingSpace;
import com.kishore.hibernate.beans.onetomanyBidirection.Professor;
import com.kishore.hibernate.beans.onetomanyUnidirection.Passport;
import com.kishore.hibernate.beans.onetomanyUnidirection.Person;
import com.kishore.spring.configuration.AppConfig;
import com.kishore.spring.dao.AbstractDao;
import com.kishore.spring.service.ActorService;
import com.kishore.spring.service.CollegeService;
import com.kishore.spring.service.PersonService;
import com.kishore.spring.service.ProfessorService;

public class SpringTest {

	public static void main(String args[]){
		
		
		AbstractApplicationContext abstractApplicationContext=new AnnotationConfigApplicationContext(AppConfig.class);
		CollegeService collegeService=(CollegeService)abstractApplicationContext.getBean("collegeService");
		
		/*Person findPersonByID = personService.findPersonByID(1);
		
		
		
		System.out.println(findPersonByID.getPersonId());
		System.out.println(findPersonByID.getName());
		System.out.println(findPersonByID.getPassport().getPassportId());
		System.out.println(findPersonByID.getPassport().getExpiryDate());
		
		
		
		Actor actor=new Actor();
		actor.setFirst_name("kishore_22");
		actor.setLast_name("oggu_22");
		actor.setLast_update(new Timestamp(System.currentTimeMillis()));
		
		ActorInfo actorInfo=new ActorInfo();
		
		actorInfo.setFilmInfo("new Film");
		actorInfo.setFirstName("kishore_22");
		actorInfo.setLastName("oggu_22");
		actor.setActorInfo(actorInfo);
		
		
		
		Professor  professor=new Professor();
		professor.setName("AP10");
		professor.setSalary(100000);
		
		
		ParkingSpace parkingSpace=new ParkingSpace();
		parkingSpace.setLocation("fourthFloor");
		parkingSpace.setLot(4);
		professor.setParkingSpace(parkingSpace);
		*/
		
		
		
		//actorService.deleteProfessorByName("AP3");
		
		//actorService.saveProfessor(professor);
//		System.out.println(actorService.findAllActors().toString());
		
//		System.out.println(actorService.findActorByID(200));
		//actorService.deleteActorByFirstName("kishore");
		
		
		
		
		Person person=new Person();
//		person.setPersonId(2);
		person.setName("ChildFirst");
		person.setEmailId("ChildFirst@abc.com");
		
		Calendar calendar=Calendar.getInstance();
		Passport passport=new Passport();
		
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			passport.setIssueDate(dateFormat.parse("2016-04-05"));
			passport.setExpiryDate(dateFormat.parse("2026-04-26"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
//		personService.savePerson(person);
		
		
		passport.setPerson(person);
		person.setPassport(passport);
		
		//personService.savePerson(passport);
//		personService.updatePerson(person);
		//System.out.println(personService.findAllPersons());
		
		//personService.deletePersonByName("second Name");
		//abstractApplicationContext.close();
		
		
		
		Collage collage=new Collage();
		collage.setcollageName("abc");
		collage.setcollageLocation("hyd");
		
		
		collegeService.saveCollege(collage);
		
		
	}
}
