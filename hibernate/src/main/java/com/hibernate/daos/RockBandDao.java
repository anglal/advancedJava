package com.hibernate.daos;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.entities.RockBand;
import com.hibernate.util.HibernateUtil;

public class RockBandDao implements DaoInterface<RockBand> {

	private final String CLASS_NAME = "RockBand";
	@SuppressWarnings("unchecked")
	@Override
	public List<RockBand> findAll() {
		ArrayList<RockBand> bands = new ArrayList<>();
		try {
			Session session = HibernateUtil.openSession();
			bands.addAll(session.createQuery("from "  + CLASS_NAME).list());
			
		}catch(HibernateException e) {
			HibernateUtil.rollbackTransaction();
			e.printStackTrace();
		}finally {
			HibernateUtil.closeCurrentSession();
		}
		return bands;
	}

	@Override
	public RockBand findById(int id) {
		RockBand band = null;
		try {
			Session session = HibernateUtil.openSession();
			band = (RockBand)session.get(RockBand.class, id);
			
		}catch(HibernateException e) {
			HibernateUtil.rollbackTransaction();
			e.printStackTrace();
		}finally {
			HibernateUtil.closeCurrentSession();
		}
		return band;
	}

	@Override
	public void update(RockBand band) {
		try {
			Session session = HibernateUtil.openSession();
			session.update(band);
		}catch(HibernateException e) {
			HibernateUtil.rollbackTransaction();
			e.printStackTrace();
		}finally {
			HibernateUtil.closeCurrentSession();
		}
	}

	@Override
	public RockBand save(RockBand band) {
		try {
			Session session = HibernateUtil.openSession();
			session.save(band);
		}catch(HibernateException e) {
			HibernateUtil.rollbackTransaction();
			e.printStackTrace();
		}finally {
			HibernateUtil.closeCurrentSession();
		}
		return band;
	}

	@Override
	public void delete(int id) {
		try {
			RockBand band = findById(id);
			Session session = HibernateUtil.openSession();
			session.delete(band);
		}catch(HibernateException e) {
			HibernateUtil.rollbackTransaction();
			e.printStackTrace();
		}finally {
			HibernateUtil.closeCurrentSession();
		}
	}

}
