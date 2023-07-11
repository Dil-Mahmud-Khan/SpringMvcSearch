package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	
	@RequestMapping("complex")
	public String form() {
		return"Form";
	}
	
	@RequestMapping(path="/form",method=RequestMethod.POST)
	public String formHandle(@ModelAttribute("student") Student student,BindingResult result) {
		if(result.hasErrors()) {
			return "Form";
		}
		System.out.println(student);
		return "Success";
	}
}
