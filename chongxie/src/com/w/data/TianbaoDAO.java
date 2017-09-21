package com.w.data;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.w.Daonterface.TableDaoInterface;
import com.w.data.*;

/**
 * A data access object (DAO) providing persistence and search support for
 * Tianbao entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.w.data.Tianbao
 * @author MyEclipse Persistence Tools
 */
public class TianbaoDAO extends HibernateDaoSupport implements TableDaoInterface{
	private static final Logger log = LoggerFactory.getLogger(TianbaoDAO.class);
	// property constants
	public static final String ID = "id";
	public static final String QUANCHENG="quancheng";
	public static final String GUIKOU = "guikou";
	public static final String TONGXUN = "tongxun";
	public static final String DIYU = "diyu";
	public static final String WANGZHI = "wangzhi";
	public static final String YOUXIANG = "youxiang";
	public static final String DAIBIAO = "daibiao";
	public static final String YOUBIAN = "youbian";
	public static final String LIANXI = "lianxi";
	public static final String PHONE = "phone";
	public static final String MPHONE = "mphone";
	public static final String CHUANZHEN = "chuanzhen";
	public static final String JIGOU = "jigou";
	public static final String JIANJIE = "jianjie";
	public static final String JNAME = "jname";
	public static final String QISHINIAN = "qishinian";
	public static final String ZHONGZHINIAN = "zhongzhinian";
	public static final String GAISHU = "gaishu";
	public static final String GJZI = "gjzi";
	public static final String ZIJIN = "zijin";
	public static final String FANGSHI = "fangshi";
	public static final String YIXIANDANWEI = "yixiandanwei";
	public static final String HDLX = "hdlx";
	public static final String XUEKE = "xueke";
	public static final String XUQIULIYU = "xuqiuliyu";
	public static final String QITA = "qita";
	public static final String XIQIUYINGYONG = "xiqiuyingyong";
	public static final String ZHUANGTAI = "zhuangtai";
	public static final String NJNAME = "njname";
    private Us us;
	protected void initDao() {
		// do nothing
	}

	public void save(Tianbao transientInstance) {
		log.debug("saving Tianbao instance");
		try {
			
			
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Tianbao persistentInstance) {
		log.debug("deleting Tianbao instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tianbao findById(java.lang.Integer id) {
		log.debug("getting Tianbao instance with id: " + id);
		try {
			Tianbao instance = (Tianbao) getHibernateTemplate().get(
					"com.w.data.Tianbao", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Tianbao instance) {
		log.debug("finding Tianbao instance by example");
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
		log.debug("finding Tianbao instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Tianbao as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
	public List findById(Object id)
	{
		return findByProperty(ID,id);
	}
	public List findByGuikou(Object guikou) {
		return findByProperty(GUIKOU, guikou);
	}

	public List findByTongxun(Object tongxun) {
		return findByProperty(TONGXUN, tongxun);
	}

	public List findByDiyu(Object diyu) {
		return findByProperty(DIYU, diyu);
	}

	public List findByWangzhi(Object wangzhi) {
		return findByProperty(WANGZHI, wangzhi);
	}

	public List findByYouxiang(Object youxiang) {
		return findByProperty(YOUXIANG, youxiang);
	}

	public List findByDaibiao(Object daibiao) {
		return findByProperty(DAIBIAO, daibiao);
	}

	public List findByYoubian(Object youbian) {
		return findByProperty(YOUBIAN, youbian);
	}

	public List findByLianxi(Object lianxi) {
		return findByProperty(LIANXI, lianxi);
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByMphone(Object mphone) {
		return findByProperty(MPHONE, mphone);
	}

	public List findByChuanzhen(Object chuanzhen) {
		return findByProperty(CHUANZHEN, chuanzhen);
	}

	public List findByJigou(Object jigou) {
		return findByProperty(JIGOU, jigou);
	}

	public List findByJianjie(Object jianjie) {
		return findByProperty(JIANJIE, jianjie);
	}

	public List findByJname(Object jname) {
		return findByProperty(JNAME, jname);
	}

	public List findByQishinian(Object qishinian) {
		return findByProperty(QISHINIAN, qishinian);
	}

	public List findByZhongzhinian(Object zhongzhinian) {
		return findByProperty(ZHONGZHINIAN, zhongzhinian);
	}

	public List findByGaishu(Object gaishu) {
		return findByProperty(GAISHU, gaishu);
	}

	public List findByGjzi(Object gjzi) {
		return findByProperty(GJZI, gjzi);
	}

	public List findByZijin(Object zijin) {
		return findByProperty(ZIJIN, zijin);
	}

	public List findByFangshi(Object fangshi) {
		return findByProperty(FANGSHI, fangshi);
	}

	public List findByYixiandanwei(Object yixiandanwei) {
		return findByProperty(YIXIANDANWEI, yixiandanwei);
	}

	public List findByHdlx(Object hdlx) {
		return findByProperty(HDLX, hdlx);
	}

	public List findByXueke(Object xueke) {
		return findByProperty(XUEKE, xueke);
	}

	public List findByXuqiuliyu(Object xuqiuliyu) {
		return findByProperty(XUQIULIYU, xuqiuliyu);
	}

	public List findByQita(Object qita) {
		return findByProperty(QITA, qita);
	}

	public List findByXiqiuyingyong(Object xiqiuyingyong) {
		return findByProperty(XIQIUYINGYONG, xiqiuyingyong);
	}

	public List findByZhuangtai(Object zhuangtai) {
		return findByProperty(ZHUANGTAI, zhuangtai);
	}

	public List findByNjname(Object njname) {
		return findByProperty(NJNAME, njname);
	}

	public List findAll() {
		log.debug("finding all Tianbao instances");
		try {
			String queryString = "from Tianbao";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Tianbao merge(Tianbao detachedInstance) {
		log.debug("merging Tianbao instance");
		try {
			Tianbao result = (Tianbao) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Tianbao instance) {
		log.debug("attaching dirty Tianbao instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tianbao instance) {
		log.debug("attaching clean Tianbao instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
	public List<Bumenn> bumenns() {
		List<Bumenn> bumenns = getHibernateTemplate().find("from Bumenn");
		return bumenns;
	}
	public List<Diyu> diyus() {
		List<Diyu> diyus = getHibernateTemplate().find("from Diyu");
		return diyus;
	}
	public boolean inputcheck(Tianbao tianbao)
	{
		/*List<Tianbao> table=getHibernateTemplate().find("form Tianbao tianbao where tianbao.jname='"+tianbao.getJname()+"'");
		if(table!=null&&table.size()>0)
		{
			return false;
		}*/
		return false;
	}

	
	public List xqgl(Tianbao tianbao)
	{
		
		List<Tianbao> li=getHibernateTemplate().find("from Tianbao tianbao where tianbao.quancheng='铁大'and tianbao.zhuangtai='保存未提交'");
		 System.out.println("sd");
		if(li!=null&&li.size()>0)
	    {
	    	return li; 
	    }
	    return li;
	   
	}
	public void add(Tianbao tianbao)
	{
			
			getHibernateTemplate().save(tianbao);
			System.out.println(tianbao);

	}

	@Override
	public List findByQuancheng(Object quancheng) {
		// TODO Auto-generated method stub
		return null;
	}
	public static TianbaoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TianbaoDAO) ctx.getBean("TianbaoDAO");
	}
}