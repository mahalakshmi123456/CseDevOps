package com.lbrce.Devops;

import java.util.ResourceBundle;

public class uservalidation{
	public boolean check(String uidIn,String pswIn)
	{
		ResourceBundle rb =ResourceBundle.getBundle("config");
		String uid=rb.getString("Username");
		String psw=rb.getString("password");
		if(uid.equals(uidIn)&&psw.equals(pswIn))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}

}
