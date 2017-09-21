package com.w.service;

import java.util.List;

import com.w.Daonterface.TableDaoInterface;
import com.w.data.Tianbao;
import com.w.serviceInf.XuqiuGl;

public class Xuqiugl implements XuqiuGl{
	  private TableDaoInterface tabledao;
	
	  public List xqgl(Tianbao tianbao){
   	  
   	  return tabledao.xqgl(tianbao);
     }

	public TableDaoInterface getTabledao() {
		return tabledao;
	}

	public void setTabledao(TableDaoInterface tabledao) {
		this.tabledao = tabledao;
	}
}
