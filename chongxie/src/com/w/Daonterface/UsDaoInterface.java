package com.w.Daonterface;


import java.util.List;

import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;

import com.w.data.Us;
import com.w.data.UsDAO;

public interface UsDaoInterface {

	public String getJiaose(String username);
	public void save(Us transientInstance) ;
	public String getQuancheng(String username);
	public void delete(Us persistentInstance) ;

	public Us findById(java.lang.String id) ;

	public List findByExample(Us instance) ;

	public List findByProperty(String propertyName, Object value) ;
	public List findByPwd(Object pwd) ;
	public List findByUsername(Object username) ;

	public List findByJiaose(Object jiaose);
	public List findAll();

	public Us merge(Us detachedInstance);

	public void attachDirty(Us instance);

	public void attachClean(Us instance);
	

	public  UsDAO getFromApplicationContext(ApplicationContext ctx);
	public void add(Us us);
	public boolean logincheck(Us us);
	public boolean checkuser(String id,String username);
}
