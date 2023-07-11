package Interceptor;

import java.security.PublicKey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterCeptorController {
	
	@RequestMapping("/interceptor")
	public String home() {
		System.out.println("Interceptor");
		return "interceptor";
	}
	
	@RequestMapping("/ceptor")
	public String Welcome(@RequestParam ("user") String name, Model m) {
		System.out.println(name);
		m.addAttribute("name",name);
		return "welcome";
	}
	
}
