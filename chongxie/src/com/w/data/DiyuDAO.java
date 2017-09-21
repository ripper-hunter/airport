package com.w.data;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for Diyu
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.w.data.Diyu
 * @author MyEclipse Persistence Tools
 */
public class DiyuDAO extends HibernateDaoSupport {
	private static final Logger log = LoggerFactory.getLogger(DiyuDAO.class);
	// property constants
	public static final String TITLE = "title";
	public static final String F3 = "f3";

	protected void initDao() {
		// do nothing
	}

	public void save(Diyu transientInstance) {
		log.debug("saving Diyu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Diyu persistentInstance) {
		log.debug("deleting Diyu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Diyu findById(java.lang.String id) {
		log.debug("getting Diyu instance with id: " + id);
		try {
			Diyu instance = (Diyu) getHibernateTemplate().get(
					"com.w.data.Diyu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Diyu instance) {
		log.debug("finding Diyu instance by example");
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
		log.debug("finding Diyu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Diyu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTitle(Object title) {
		return findByProperty(TITLE, title);
	}

	public List findByF3(Object f3) {
		return findByProperty(F3, f3);
	}

	public List findAll() {
		log.debug("finding all Diyu instances");
		try {
			String queryString = "from Diyu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Diyu merge(Diyu detachedInstance) {
		log.debug("merging Diyu instance");
		try {
			Diyu result = (Diyu) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Diyu instance) {
		log.debug("attaching dirty Diyu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Diyu instance) {
		log.debug("attaching clean Diyu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DiyuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DiyuDAO) ctx.getBean("DiyuDAO");
	}
}