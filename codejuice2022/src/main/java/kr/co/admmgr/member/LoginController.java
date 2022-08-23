package kr.co.admmgr.member;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/admmgr/member/")
public class LoginController {
	
	
	
	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
	/** LoginService */
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping(value = "/login.do")
	public ModelAndView Login(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
		logger.info("Login! The client locale is {}.");
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admmgr/member/login");
		
		return mav;
	}
	
	@RequestMapping(value = "/LoginProc.do")
	public ModelAndView LoginProc(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {
		
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("result", loginService.selectUserScoer(modelMap));
						
		ModelAndView mav = new ModelAndView();
		mav.setViewName("admmgr/main");
		mav.addObject(resultMap);
		
		return mav;
	}
	
	//@RequestMapping(value = "/userScore.do")
	//public Map<String, Object> userScore(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) throws Exception {
		
	
		//Map<String, Object> resultMap = new HashMap<String, Object>();
		//resultMap.put("result", loginService.selectUserScoer(modelMap));
		
		//return resultMap;
	//}
	
}
