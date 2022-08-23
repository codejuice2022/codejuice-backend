package kr.co.admmgr.member;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

import kr.com.common.AbstractDAO;

@Repository("MainDAO")
public class MainDAO extends AbstractDAO{
	public List selectUserSocre() throws Exception {
    	return selectList("webService.selectUserScore");
    }

}
