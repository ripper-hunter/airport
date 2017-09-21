package com.w.Daonterface;


import java.util.List;

import com.w.data.Diyu;



public interface DiYuInterface {
	void initDao();
	public void save(Diyu transientInstance);

	public void delete(Diyu persistentInstance);

	public Diyu findById(java.lang.String id) ;

	public List findByExample(Diyu instance) ;

	public List findByProperty(String propertyName, Object value);

	public List findByTitle(Object title);

	public List findByF3(Object f3) ;

	public List findAll() ;

	public Diyu merge(Diyu detachedInstance);

	public void attachDirty(Diyu instance) ;

	public void attachClean(Diyu instance);
}
