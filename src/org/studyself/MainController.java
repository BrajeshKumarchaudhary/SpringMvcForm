package org.studyself;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@RequestMapping(method = RequestMethod.GET,value = "/")
	public String homepage(){
		return "form";
	}
	@RequestMapping(value = "displayname")
//	public String displayNmae(HttpServletRequest request,HttpServletResponse response){
//		String firstname=request.getParameter("firstname");
//		request.setAttribute("firstname",firstname);
//		return "displayname";
//	}
	public String displayNmae(@RequestParam("firstname") String name ,Model model){
		
		model.addAttribute("firstname",name);
		return "displayname";
	}
}
