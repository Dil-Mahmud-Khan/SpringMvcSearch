package Controller;

import java.security.PublicKey;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}")
	public String getUserDetail(@PathVariable("userId") int userId){
		System.out.println(userId);
		return "home";
	}
	@RequestMapping("/home")
	public String home() {
		System.out.println("It works");
//		String string=null;							//For Error Handling
//		System.out.println(string.length());
		return "Home";
	}
	
	@RequestMapping("search")
	public RedirectView search(@RequestParam("querybox") String query) {
		RedirectView redirectView=new RedirectView();
		String url="https://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
	
	//For Error Handling
	
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value=NullPointerException.class)
//	public String exceptionHandlerNull() {
//		return "null_page";
//	}
}
