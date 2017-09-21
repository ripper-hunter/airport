package com.w.action;


import java.util.List;

import org.apache.struts2.json.annotations.JSON;

import com.opensymphony.xwork2.ActionSupport;

import com.w.data.Tianbao;
import com.w.serviceInf.TableInterface2;

public class Search extends ActionSupport {
	private TableInterface2 meth;
	private Tianbao tianbao;
    private List<Tianbao> list2;
    private String val1;
    private String val2;
	
	public String search()
	{
		
		System.out.println(val1);
		if(val1!=null)
		{
			
	     list2=meth.findByDiyu(val1);
	     System.out.println("ÕâÊÇlist2"+list2);
	     if(list2!=null&&list2.size()>0)
	     {
	    	 return "success";
	     }
	     else
	     {
	    	 return "error";
	     }
	     
		}
		else if(tianbao.getJname()==null)
		{
			return "error";
		}
		return "success";
	}
	public List<Tianbao> getList2() {
		return list2;
	}
	public void setList2(List<Tianbao> list2) {
		this.list2 = list2;
	}
	@JSON(serialize=false)
	public TableInterface2 getMeth() {
		return meth;
	}

	public void setMeth(TableInterface2 meth) {
		this.meth = meth;
	}

	public Tianbao getTianbao() {
		return tianbao;
	}

	public void setTianbao(Tianbao tianbao) {
		this.tianbao = tianbao;
	}
	 
	public String getVal2() {
			return val2;
		}

		public void setVal2(String val2) {
			this.val2 = val2;
		}

		public String getVal1() {
			return val1;
		}

		public void setVal1(String val1) {
			this.val1 = val1;
		}
}
