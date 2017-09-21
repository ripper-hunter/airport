package com.w.Daonterface;

import java.util.List;

import com.w.data.Bumenn;

public interface BumennDaoInterface {
    void initDao();
	public void save(Bumenn transientInstance);
	public void delete(Bumenn persistentInstance);
	public Bumenn findById(java.lang.String id);
	public List findByExample(Bumenn instance);
	public List findByProperty(String propertyName, Object value);
	public List findAll();
	public Bumenn merge(Bumenn detachedInstance);
	public void attachDirty(Bumenn instance);
	public void attachClean(Bumenn instance);


}
