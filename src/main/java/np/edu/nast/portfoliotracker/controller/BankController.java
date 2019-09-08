package np.edu.nast.portfoliotracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("bank")
public class BankController {
	@GetMapping("/addBank")
	private String addBank(){
		return "bank is added";
		
	}
	@GetMapping("/removeBank")
	private String removeBank(){
		return "bank is removed";
		
	}

}
