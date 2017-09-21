package com.w.service;

import java.util.List;

import com.w.Daonterface.TableDaoInterface;
import com.w.serviceInf.TableInterface2;

public class TableSearch implements TableInterface2{
	  private TableDaoInterface tabledao;

	public TableDaoInterface getTabledao() {
		return tabledao;
	}

	public void setTabledao(TableDaoInterface tabledao) {
		this.tabledao = tabledao;
	}
	  
	 public List findByGuikou(Object guikou)
	 {
		 return tabledao.findByGuikou(guikou);
	 }
	 public List findByDiyu(Object diyu){
		 return tabledao.findByDiyu(diyu);
	 }
	 public List findByJigou(Object jigou)
	 {
		 return tabledao.findByJigou(jigou);
	 }
	 public List findByJname(Object jname)
	 {
        return tabledao.findByJname(jname);
     }
}