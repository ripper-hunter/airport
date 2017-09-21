package com.w.action;


import com.opensymphony.xwork2.ActionSupport;
import com.w.data.Tianbao;
import com.w.serviceInf.TableInterface;


public class Inputxuqiu extends ActionSupport {
    private Tianbao tianbao;
    private TableInterface table;
    
    public String Tablein()
    {
    	String flag="";
    	System.out.println(tianbao);
    	if(table.inputcheck(tianbao))
    	{
    		flag="error";
    	}
    	else
    	{
    		table.add(tianbao);
    		flag="success";
    	}
    	return flag;
    }

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

	
}
