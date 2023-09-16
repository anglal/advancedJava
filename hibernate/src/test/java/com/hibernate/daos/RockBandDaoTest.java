package com.hibernate.daos;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.hibernate.entities.RockBand;
import com.hibernate.util.HibernateUtil;

import org.junit.Assert;


@RunWith(JUnit4.class)
public class RockBandDaoTest {
private RockBandDao dao = new RockBandDao();

@After
public void cleanup() {
	HibernateUtil.closeSessionFactory();
}

@Test
public void testSaveAndFind() {
	dao.save(new RockBand("AC/DC"));
	RockBand actual = dao.findById(1);
	
	RockBand expected = new RockBand(1, "AC/DC");
	
	Assert.assertEquals(expected, actual);
	
	
}
	
}
