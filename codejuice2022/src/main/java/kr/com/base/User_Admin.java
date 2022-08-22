package kr.com.base;

import javax.servlet.http.HttpServletRequest;

import kr.com.base.Utility;

public class User_Admin {
	public String no         = "";
	public String idCd         = "";

	public User_Admin( HttpServletRequest request ){
		User_Admin user = (User_Admin)request.getSession().getAttribute("User_Admin");
		if( user != null ){
			no         = user.no;
			idCd         = user.idCd;
		}
	}

	public void setData( HttpServletRequest request ){
		request.getSession().setAttribute("User_Admin", this);
	}

	public boolean loginCheck(){
		return !Utility.IsEmpty(this.idCd);
	}

}