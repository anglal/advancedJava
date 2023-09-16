package com.hibernate.executables;

import java.util.List;

import com.hibernate.daos.RockBandDao;
import com.hibernate.entities.RockBand;

public class HibernateApp {

	public static void main(String[] args) {

		RockBandDao dao = new RockBandDao(); 
		
		RockBand thisBand = new RockBand("AC/DC");
		dao.save(thisBand);
		
		dao.save(new RockBand("Cheap Trick"));
		dao.save(new RockBand("Ratt"));
		dao.save(new RockBand("Van Halen"));
		dao.save(new RockBand("Tom Petty & the Heartbreakers"));
		
		RockBand fetched = dao.findById(3);
		System.out.println("Fetched: " + fetched);
		
		fetched.setBandName("Journet");
		System.out.println("Changing band name to Journey");
		dao.update(fetched);
		fetched = dao.findById(3);
		System.out.println("Fetched: " + fetched+"\n");
		
		List<RockBand> bands = dao.findAll();
		bands.forEach(System.out::println);
		
		dao.delete(2);
		
		System.out.println("Fetched now: " + fetched+"\n");
		bands = dao.findAll();
		bands.forEach(System.out::println);
	}

}
