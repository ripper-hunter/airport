package com.w.action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.PrintWriter;

import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;
import com.w.tools.*;

public class Passwordsafe extends ActionSupport {

	
	@Override
	public String execute() throws Exception {
		  ServletResponse response = ServletActionContext.getResponse();
	        PrintWriter writer = response.getWriter();
	        String publicKey = PasswordSafe.generateBase64PublicKey();
	        writer.write(publicKey);        
	        System.out.println(publicKey);  
	        
	        return null;
	}
 
	
}