package com.w.service;

import java.util.List;

import com.w.Daonterface.UsDaoInterface;
import com.w.data.Us;
import com.w.serviceInf.Usermanger;



public class UserManager implements Usermanger{

	private UsDaoInterface usdao;
	
	@Override
	public boolean exit(Us us) {
		
		return usdao.checkuser(us.getId(),us.getUsername());
		
	}
	@Override
	public String getQuancheng(String username)
	{
		 return usdao.getQuancheng(username); 
	}
	@Override
	public boolean logincheck(Us us) {
		return usdao.logincheck(us);
	}
	@Override
	public String getJiaose(String username){
		return usdao.getJiaose(username);
	}
	
	@Override
	public void add(Us us) {
		usdao.add(us);
	}

	public UsDaoInterface getUsdao() {
		return usdao;
	}

	public void setUsdao(UsDaoInterface usdao) {
		this.usdao = usdao;
	}


	

}
