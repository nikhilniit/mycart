package mycart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerMain {
	@RequestMapping("/")
	public String home()
	{
			System.out.println("iam in home method");
			return "home";
	}
@RequestMapping("/login")
	public String login()
	{
	System.out.println("iam in login method");
	return "login";
	}
@RequestMapping("/signup")
public String signup()
{
	System.out.println("iam in signup method");
	return "signup";
}
	}

