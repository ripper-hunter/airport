package com.w.action;

import com.opensymphony.xwork2.ActionSupport;
import com.w.data.Tianbao;
import com.w.serviceInf.TableInterface;
import java.util.List;

public class Xiqiugx extends ActionSupport {

	private Tianbao tianbao;
    private TableInterface table;
    private List<Tianbao> list;
   
	public Tianbao getTianbao() {
		return tianbao;
	}
	public void setTianbao(Tianbao tianbao) {
		this.tianbao = tianbao;
	}
	public TableInterface getTable() {
		return table;
	}
	public void setTable(TableInterface table) {
		this.table = table;
	}
	
	public String bianji()
	{
		String flag="";
		
		System.out.println(tianbao.getId());
		list=table.findById(tianbao.getId());
		System.out.println(list);
		if(list!=null&&list.size()>0)
		{
		
		flag="success";
		}
		else
		{
			flag="error";
		}
		System.out.println(flag);
		return flag;
	}
	public String shenhe()
	{
		String flag="";
		list=table.findById(tianbao.getId());
		if(list!=null&&list.size()>0)
		{
		 
		flag="success";
		}
		else
		{
			flag="error";
		}
		return flag;
	}
	public List<Tianbao> getList() {
		return list;
	}
	public void setList(List<Tianbao> list) {
		this.list = list;
	}
    
}
