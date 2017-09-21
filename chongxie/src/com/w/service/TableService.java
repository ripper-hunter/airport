package com.w.service;


import java.util.List;

import com.w.Daonterface.TableDaoInterface;
import com.w.data.Bumenn;
import com.w.data.Diyu;
import com.w.data.Tianbao;


import com.w.serviceInf.TableInterface;


public class TableService implements TableInterface{
      private TableDaoInterface tabledao;
      
      
      public List<Bumenn> bumenns() {
  		
  		return tabledao.bumenns();
  	}
     
      public boolean inputcheck(Tianbao tianbao)
      {
    	  return tabledao.inputcheck(tianbao);
      }
      public List<Diyu> diyus() {
  		return tabledao.diyus();
  	}
      public List findById(Object id)
  	{
  		
  		return  tabledao.findById(id);
  	}
	public TableDaoInterface getTabledao() {
		return tabledao;
	}

	public void setTabledao(TableDaoInterface tabledao) {
		this.tabledao = tabledao;
	}
      public void add(Tianbao table)
      {
    	  tabledao.save(table);
      }
     
	
}
