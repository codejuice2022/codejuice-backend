package kr.co.admmgr.member;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@Service("LoginService")
public class LoginServiceImple  implements LoginService{
	@Resource(name = "LoginDAO")
    private LoginDAO loginDAO;

	@Override
	public List selectUserScoer(Map map) throws Exception {
		// TODO Auto-generated method stub
		return loginDAO.selectUserSocre();
	}



}
