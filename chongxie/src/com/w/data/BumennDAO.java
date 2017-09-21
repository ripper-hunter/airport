package com.w.data;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.w.Daonterface.BumennDaoInterface;

/**
 * A data access object (DAO) providing persistence and search support for
 * Bumenn entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.w.data.Bumenn
 * @author MyEclipse Persistence Tools
 */
public class BumennDAO extends HibernateDaoSupport implements BumennDaoInterface{
	private static final Logger log = LoggerFactory.getLogger(BumennDAO.class);

	// property constants

	public void initDao() {
		// do nothing
	}

	public void save(Bumenn transientInstance) {
		log.debug("saving Bumenn instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Bumenn persistentInstance) {
		log.debug("deleting Bumenn instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Bumenn findById(java.lang.String id) {
		log.debug("getting Bumenn instance with id: " + id);
		try {
			Bumenn instance = (Bumenn) getHibernateTemplate().get(
					"com.w.data.Bumenn", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Bumenn instance) {
		log.debug("finding Bumenn instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Bumenn instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bumenn as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Bumenn instances");
		try {
			String queryString = "from Bumenn";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Bumenn merge(Bumenn detachedInstance) {
		log.debug("merging Bumenn instance");
		try {
			Bumenn result = (Bumenn) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Bumenn instance) {
		log.debug("attaching dirty Bumenn instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Bumenn instance) {
		log.debug("attaching clean Bumenn instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static BumennDAO getFromApplicationContext(ApplicationContext ctx) {
		return (BumennDAO) ctx.getBean("BumennDAO");
	}
}