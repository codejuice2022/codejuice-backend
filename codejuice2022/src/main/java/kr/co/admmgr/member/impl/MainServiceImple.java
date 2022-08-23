package kr.co.admmgr.member.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import kr.co.admmgr.member.MainDAO;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@Service("MainService")
public class MainServiceImple  implements MainService{
	@Resource(name = "LoginDAO")
    private MainDAO MainDAO;

	@Override
	public List selectUserScoer(Map map) throws Exception {
		// TODO Auto-generated method stub
		return MainDAO.selectUserSocre();
	}



}
