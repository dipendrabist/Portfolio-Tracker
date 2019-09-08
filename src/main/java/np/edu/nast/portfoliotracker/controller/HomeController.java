package np.edu.nast.portfoliotracker.controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
//	@GetMapping("/profile")
//	public String profile(Model model) {
//		System.out.print(repo.findById(2L));
//		model.addAttribute("userProfile",repo.findById(2L));
//		return "profile";
//	}
	
//
//	@GetMapping("/add")
//	public String home1() {
//		return "addDEMAT";
//	}
	@GetMapping("/sell")
	public String home13() {
		return "sellShare";
	}

//	@GetMapping("/myaccounts")
//	public String aindex() {
//		return "myAccounts";
//	}
	@GetMapping("/accountinfo")
	public String aindexs() {
		return "accountInfo";
	}
}
