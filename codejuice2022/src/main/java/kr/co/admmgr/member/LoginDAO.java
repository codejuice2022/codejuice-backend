package kr.co.admmgr.member;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import kr.com.common.AbstractDAO;

@Repository("LoginDAO")
public class LoginDAO extends AbstractDAO{
	public List selectUserSocre( Map map ) throws Exception {
		System.out.println("map :" +map);
    	return selectList("webService.selectUserScore",map);
    }

}
