package Controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	
	@RequestMapping(value="/uploadimage", method=RequestMethod.POST)
	public String fileUplaod(@RequestParam("profile") CommonsMultipartFile file, HttpSession s) {
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		
		byte[] data = file.getBytes();
		String path=s.getServletContext().getRealPath("/") + file.getOriginalFilename();
		System.out.println(path);
		try {
			FileOutputStream fos=new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Upload Error");
		}
	
		return "filesuccess";
	}
}
