package com.w.action;



import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;




import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.w.Daonterface.UsDaoInterface;
import com.w.data.Us;
import com.w.data.UsDAO;
import com.w.serviceInf.Usermanger;


public class Login extends ActionSupport {
    
	private Us us;
	private Usermanger usermanger;
	
	private String randcode;
	
	
	//�����½��ע��ط���
	/***********************************************************/
	public String register()
	{
		
		String flag="";
 
        System.out.println("adasdsfqfqqq"+us);
	
		if(usermanger.exit(us))
		{
			flag="error";
		}
		else
		{
			usermanger.add(us);
			flag="success";
		}
		return flag;
	}
	public String login()
	{
		String flag="";
	   
		ActionContext actionContext = ActionContext.getContext();
		Map<String,Object> request = (Map) actionContext.get("request");
		Map<String, Object> session = actionContext.getSession();
		String randcode2=(String)session.get("rand");
		
		
		if(!randcode.equals(randcode2))
		{
		
			flag="error";
		}
		else
		{
			if(usermanger.logincheck(us))
			{
				session.put("quancheng", usermanger.getQuancheng(us.getUsername()));
				String jiaose=usermanger.getJiaose(us.getUsername());
				System.out.println(jiaose+"wcc");
				if(jiaose.equals("һ���û�"))
				{
				flag="success";
				}
				else if(jiaose.equals("��ʽ���Ա"))
				{
					flag="success1";
				}
				else if(jiaose.equals("�������Ա"))
				{
					flag="success2";
				}
				else if(jiaose.equals("����Ա"))
				{
					flag="success3";
				}
				
			}
			else
			{
				
				
				flag="error";
				
			}
			
		}
		return flag;
	}
	public Us getUs() {
		return us;
	}
	public void setUs(Us us) {
		this.us = us;
	}
	public Usermanger getUsermanger() {
		return usermanger;
	}
	public void setUsermanger(Usermanger usermanger) {
		this.usermanger = usermanger;
	}
	public String getRandcode() {
		return randcode;
	}
	public void setRandcode(String randcode) {
		this.randcode = randcode;
	}
	
	
	
}
