package com.w.action;


import java.util.List;

import javax.persistence.JoinColumn;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;
import com.w.data.Bumenn;
import com.w.data.Diyu;
import com.w.data.Us;
import com.w.serviceInf.TableInterface;


public class Tableload extends ActionSupport {
   private TableInterface table;
   private List<Bumenn> bumen;
   private List<Diyu> diyu;

  
   
   public String loaddiyu(){
		
		diyu=table.diyus();
		System.out.println(diyu.size());
		return "success";
	}
	//获取归口管理部门的下拉框的值
	public String loadbumen(){
		
		bumen =table.bumenns();
		System.out.println(bumen.size());
		return "success";
	}
	
	
	@JSON(serialize=false)
	public TableInterface getTable() {
		return table;
	}
	public void setTable(TableInterface table) {
		this.table = table;
	}
	public List<Bumenn> getBumen() {
		return bumen;
	}
	public void setBumen(List<Bumenn> bumen) {
		this.bumen = bumen;
	}
	public List<Diyu> getDiyu() {
		return diyu;
	}
	public void setDiyu(List<Diyu> diyu) {
		this.diyu = diyu;
	}

   
}
