package com.w.serviceInf;


import java.util.List;

import com.w.data.Bumenn;
import com.w.data.Diyu;
import com.w.data.Tianbao;

public interface TableInterface {

	public List<Diyu> diyus() ;
	public List<Bumenn> bumenns();
	public void add(Tianbao table);
	public boolean inputcheck(Tianbao tianbao);
	public List findById(Object id);
	
}
