package kr.co.admmgr.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.webservice.vo.testVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class Login {
	
	private static final Logger logger = LoggerFactory.getLogger(Login.class);
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/admmgr/member/login.do")
	public String Login(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		logger.info("Login! The client locale is {}.");
		
		
		testVO testSelect = sqlSession.selectOne("test.selectTest");
		
		System.out.println(testSelect.getId());
		
		modelMap.addAttribute("id", testSelect.getId());
		
		return "admmgr/member/login";
	}
	
	@RequestMapping(value = "/admmgr/member/LoginProc.do")
	public String LoginProc(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		
		return "admmgr/index";
	}
	
}
