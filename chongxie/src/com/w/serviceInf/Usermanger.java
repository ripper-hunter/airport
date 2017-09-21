package com.w.serviceInf;

import com.w.data.Us;

public interface Usermanger {
    public boolean exit(Us us);
    public boolean logincheck(Us us);
    public void add(Us us);
	public String getQuancheng(String username);
	public String getJiaose(String username);
}
