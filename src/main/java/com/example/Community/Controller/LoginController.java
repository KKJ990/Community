package com.example.Community.Controller;

import com.example.Community.Repository.Member;


import Service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {

    Member member = new Member();
    
    private LoginService loginService;
    
    @Autowired
    public LoginController(LoginService loginService){
    	
    	this.loginService = loginService;
    	
    	
    }
 

    //로그인
    @GetMapping("/")
    public String Login(){
        return "Login";
    }
    
    @PostMapping("/")
    public String LoginCheck(HttpServletRequest request){
    	Member check= new Member();
    	check.setUserid(request.getParameter("userid"));
    	check.setPw(request.getParameter("pw"));
    	if(loginService.Login(check.getUserid(), check.getPw())) {
    		
    		
    		return "Main";
    	}else {
    	
    	

    return "Login";
    	}
        }

    // 회원가입 창으로이동
    @PostMapping("Join")
    public String CreateJoinForm(){

        return "JoinForm";
    }

    @PostMapping("JoinComplete")
    public String JoinComplete(Member member){
    	
    	
    	loginService.join(member);


    return "Login";
    }



    //로그인
    @RequestMapping("Main")
    public String Main(Model model){



        return "Main";
    }
}
