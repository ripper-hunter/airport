package com.w.data;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.w.Daonterface.UsDaoInterface;

/**
 * A data access object (DAO) providing persistence and search support for Us
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see com.w.data.Us
 * @author MyEclipse Persistence Tools
 */
public class UsDAO extends HibernateDaoSupport implements UsDaoInterface{
	private static final Logger log = LoggerFactory.getLogger(UsDAO.class);
	// property constants
	public static final String PWD = "pwd";
	public static final String USERNAME = "username";
	public static final String JIAOSE = "jiaose";
	public static final String QUANCHENG = "quancheng";



	public void save(Us transientInstance) {
		log.debug("saving Us instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Us persistentInstance) {
		log.debug("deleting Us instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Us findById(java.lang.String id) {
		log.debug("getting Us instance with id: " + id);
		try {
			Us instance = (Us) getHibernateTemplate().get("com.w.data.Us", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Us instance) {
		log.debug("finding Us instance by example");
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
		log.debug("finding Us instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Us as model where model." + propertyName
					+ "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByJiaose(Object jiaose) {
		return findByProperty(JIAOSE, jiaose);
	}

	public List findByQuancheng(Object quancheng) {
		return findByProperty(QUANCHENG, quancheng);
	}

	public List findAll() {
		log.debug("finding all Us instances");
		try {
			String queryString = "from Us";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Us merge(Us detachedInstance) {
		log.debug("merging Us instance");
		try {
			Us result = (Us) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Us instance) {
		log.debug("attaching dirty Us instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Us instance) {
		log.debug("attaching clean Us instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
public String getQuancheng(String username) {
		
		List<Us> users=getHibernateTemplate().find("from Us us where us.username='"+username+"'");
		String JGQC="";
		for(Us user:users)
		{
			JGQC= user.getQuancheng();
		}
		
		return JGQC;	
	}
	public  UsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsDAO) ctx.getBean("UsDAO");
	}
	//检验用户是否存在
		public boolean checkuser(String id,String username)
		{
		 
			List<Us> users=  getHibernateTemplate().find("from Us us where us.id='"+id+"'");
			List<Us> user= getHibernateTemplate().find("from Us us where us.username='"+username+"'");
			
			if(users!=null&&users.size()>0||user!=null&&user.size()>0)
			{
				return true;
			}
			return false;
		}
		public String getJiaose(String username) {
			
			List<Us> users=getHibernateTemplate().find("from Us us where us.username='"+username+"'");
			String Jiaose="";
			for(Us user:users)
			{
				Jiaose= user.getJiaose();
			}
			
			return Jiaose;	
		}
		public boolean logincheck(Us us)
		{
		/*	System.out.println(us.getPwd()+"456");
			String decipher = PasswordSafe.decryptBase64(us.getPwd());
			System.out.println(decipher+"4567");*/
			List<Us> users=getHibernateTemplate().find("from Us us where us.username='"+us.getUsername()+"'and us.pwd='"+us.getPwd()+"'");
           
			if(users!=null&&users.size()>0)
			{
				return true;
			}
					return false;
		}

	//添加用户
		public void add(Us us)
		{
			
			getHibernateTemplate().save(us);
		}

	public static UsDAO getFromApplicationContext1(ApplicationContext ctx) {
		return (UsDAO) ctx.getBean("UsDAO");
	}
}