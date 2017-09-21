package com.w.action;

import com.opensymphony.xwork2.ActionSupport;

import com.w.data.Tianbao;

import java.util.List;
import com.w.serviceInf.XuqiuGl;


public class Xuqiugl extends ActionSupport {
	 private XuqiuGl table;
	 private Tianbao tianbao;
	 public List<Tianbao> li;

	

	public XuqiuGl getTable() {
		return table;
	}



	public void setTable(XuqiuGl table) {
		this.table = table;
	}



	public Tianbao getTianbao() {
		return tianbao;
	}



	public void setTianbao(Tianbao tianbao) {
		this.tianbao = tianbao;
	}


	
	public String gl(){
	    
		String flag="";
	    
		 li=(List<Tianbao>)table.xqgl(tianbao);
	if(li!=null)
	{
		flag="success";
	}
	else{
	    	 flag="error";
	}
	     System.out.println(flag+"ok");
	     
	     return flag;
	
	}



	public List<Tianbao> getLi() {
		return li;
	}



	public void setLi(List<Tianbao> li) {
		this.li = li;
	}
}
